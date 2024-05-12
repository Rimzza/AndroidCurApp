package Internet;

import Instruments.CreateBYN;
import models.Money;

public class RecipientCur {

    private Connection connection;

    public RecipientCur(Connection connection) {
        this.connection = connection;
    }

    public Money getMoney() {
        if (connection.getCurSt().equals("BYN")){
            return CreateBYN.get();
        } else {
            Thread thread = new Thread(connection);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return connection.getMoney();
    }
}
