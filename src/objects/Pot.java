package objects;

public class Pot extends Item{
    private Object obj;
    public Pot(Object obj) {
        this.obj = obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObjSize(Bone obj) {
        return obj.getSize();
    }

    public Object getObjRough(Bone obj) {
        return obj.getRough();
    }

    public void refreshLand(){
    }

    @Override
    public String toString() {
        return "горшок с " + this.obj;
    }

}
