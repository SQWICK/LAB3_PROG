package Enums;

public enum Color {
    RED("Красный "),
    WHITE("Белый "),
    BLACK("Черный ");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
