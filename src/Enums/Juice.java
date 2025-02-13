package Enums;

public enum Juice {
    ORANGE("Апельсиновый Сок "),
    APPLE("Яблочный Сок "),
    CHERRY("Вишневый Сок ");

    private String juice;

    Juice(String juice) {
        this.juice = juice;
    }

    public String getJuice() {
        return juice;
    }

}
