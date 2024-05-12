package Internet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.text.SimpleDateFormat;
import enums.Currency;
import models.Money;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Connection implements Runnable {

    private static final String URL = "https://api.nbrb.by/exrates/rates/%s?parammode=2";
    private Money money;
    private Currency cur;
    private String curSt;

    public Connection(Currency cur) {
        this.cur = cur;
    }

    public Connection(String curSt) {
        this.curSt = curSt;
    }

    private String respond() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(String.format(URL, curSt))
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private void setMoney() {
        String respond = respond();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(format);
        try {
             money = mapper.readValue(respond, Money.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


    public Money getMoney() {
        return money;
    }

    public Currency getCur() {
        return cur;
    }

    public String getCurSt() {
        return curSt;
    }

    @Override
    public void run() {
        setMoney();
    }
}
