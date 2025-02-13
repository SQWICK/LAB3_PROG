//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Enums.*;
import objects.*;
import persons.*;
import actions.Event;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Malish melkii = new Malish("Малыш",20);
        Carlson carcar = new Carlson(Mood.SAD,true,"Карлсон",21);
        Bone bone = new Bone(Sizes.MEDIUM, false, Color.RED);
        ArrayList<Event> events = new ArrayList<>();
        Begonia begonia = new Begonia();
        Pot pot = new Pot(begonia);
        Room room  = new Room();
        room.SetTable(new Table());
        room.SetWindow(new Window());
        room.GetTable().addPerson(carcar);
        room.GetTable().removePerson(carcar);
        carcar.chooseJuice(Juice.ORANGE);
        bone.setOwner(carcar);
        carcar.extendHand(melkii.getName());
        bone.changeOwner(melkii);
        room.GetWindow().addPerson(carcar);
        room.GetWindow().getWindowsill().addItem(pot);
        room.GetWindow().getWindowsill().getItems();
        carcar.grab(begonia);
        carcar.destroyFlow(begonia);
        events.add(new Event(carcar.getName(), begonia.toString()));
        carcar.throwObjectTo(begonia,room.GetWindow());
        carcar.putObjectToPot(pot, bone.toString(), bone);
        carcar.fillUpPot(pot);
        carcar.argue(Mood.SAD, melkii);
        carcar.setMood(Mood.ANGRY);
        carcar.setMood(Mood.HAPPY);
        carcar.makeSoud(Sounds.CLUCKING);
        carcar.eyesShine();
    }
}