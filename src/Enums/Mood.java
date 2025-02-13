package Enums;

public enum Mood {
    ANGRY("Злой"),
    HAPPY("Веселый"),
    SAD("Грустный");

    private String name;

    Mood(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
