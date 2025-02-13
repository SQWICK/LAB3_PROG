package objects;

import Enums.Color;
import Enums.Sizes;
import persons.Person;

public class Bone {
    private Sizes size;
    private boolean rough;
    private Color color;
    private Person owner;

    public Bone(Sizes size, boolean rough, Color color) {
        this.size = size;
        this.rough = rough;
        this.color = color;
    }

    public Sizes getSize(){
        return size;
    }

    public String getRough(){
        if (rough == true){
            return "шершавый ";
        }else return "гладкий ";
    }

    public Color getColor(){
        return color;
    }

    public void changeOwner(Person owner) {
        System.out.println(this.owner + " передал кость " + owner);
        this.owner = owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "кость";
    }
}
