package objects;
import Exceptions.destroyException;

public class Begonia {
    private boolean destroyed;
    public void destroy() {
        if (destroyed) throw new destroyException("Нечего уничтожать");
        else {
            destroyed = true;
            System.out.println("бегония вырвана" );
        }
    }

    @Override
    public String toString() {
        return "бегония";
    }
}
