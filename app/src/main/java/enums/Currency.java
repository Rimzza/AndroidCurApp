package enums;

public enum Currency {
    RUB("Росийский рубль"),
    USD("Доллар США"),
    EUR("Евро"),
    BYN("Белорусский рубль");
    private final String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String[] getNames(){
        Currency[] cue = values();
        String[] currencies = new String[cue.length];
        for (int i = 0; i < currencies.length; i++) {
            currencies[i] = cue[i].getName();
        }
        return currencies;
    }
    public static String[] getValuesString() {
        Currency[] cue = values();
        String[] currencies = new String[cue.length];
        for (int i = 0; i < currencies.length; i++) {
            currencies[i] = cue[i].toString();
        }
        return currencies;
    }
}
