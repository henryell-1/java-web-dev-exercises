package exercises.technology;

public class Computer extends AbstractEntity{

    private final String id;
    private  int ram;
    private  int storage;
    private  boolean hasKeyboard;


    public Computer(String id, int ram, int storage, boolean hasKeyboard){
        super();
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
        this.id = id;

    }

    public void increaseRam(int n){
        this.ram = this.ram + n;
    }

    public void increaseStorage(int x){
        this.storage = this.storage + x;
    }
}
