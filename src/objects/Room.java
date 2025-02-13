package objects;

public class Room {
    private Table table;
    private Window window;
    public void SetTable(Table table) {
        this.table = table;
    }

    public void SetWindow(Window window) {
        this.window = window;
    }

    public Table GetTable() {
        return table;
    }

    public Window GetWindow() {
        return window;
    }
}
