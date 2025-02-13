package persons;
import objects.Bone;
import Enums.Mood;
import Enums.Sounds;
import Enums.Juice;
import actions.Argueable;
import objects.Begonia;
import objects.Pot;

public class Carlson extends Person implements Argueable {
    private String name;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    private Mood mood;
    private boolean peachJuice;
    private boolean eyes;

    public Carlson(Mood mood, boolean eyes, String name, int age) {
        this.mood = mood;
        this.eyes = eyes;
        this.name = name;
        this.age = age;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        System.out.println("у " + name + " настроение поменялось с " + this.mood.getName() + " на " + mood.getName());
        this.mood = mood;
    }


    public void makeSoud(Sounds sound){
        System.out.println(name + " издал звук:" + sound.getName());
    }

    public void chooseJuice(Juice juice){
        System.out.println(juice.getJuice() + "cтекал у " + name);
    }

    public boolean isEyes() {
        return eyes;
    }

    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }

    public void extendHand(String personName) {
        System.out.println(name + " протягивает руку " + personName);
    }

    public void grab(Object object) {
        System.out.println(name + " схватил " + object);
    }

    public void eyesShine() {
        if (eyes) System.out.println("у " + name + " сияют глаза");
        else System.out.println("у " + name + " нет глаз((((((((((");
    }

    public void destroyFlow(Begonia begonia) {
        begonia.destroy();
    }

    public void putObjectToPot(Pot pot, Object obj, Bone bone) {
        pot.setObj(obj);
        System.out.println(name + " сунул " + bone.getSize().getName() + bone.getRough() + bone.getColor().getName() + obj +  " в горшок");
    }

    public void fillUpPot(Pot pot) {
        System.out.println(name + " засыпал землей");
        pot.refreshLand();
    }

    public void throwObjectTo(Object obj, Object to) {
        System.out.println(name + " бросил " + obj + " в " + to);
    }

    public void argue(Mood mood, Person opponent) {
        System.out.println(name + " " + mood.getName() + " спорит с " + opponent);
    }


    @Override
    public String toString() {
        return name;
    }
}

