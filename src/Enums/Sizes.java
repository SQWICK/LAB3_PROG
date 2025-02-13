package Enums;

public enum Sizes {
    BIG("Большой "),
    SMALL("Маленький "),
    MEDIUM("Средний ");

    private String name;

    Sizes(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
