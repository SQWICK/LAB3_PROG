package Enums;

public enum Sounds {
    CLUCKING("Кудахтанье"),
    POOPING("Пука");

    private String name;

    Sounds(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
