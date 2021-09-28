package exercises.technology;

public class SmartPhone extends Computer{
    private int numberOfSelfies;

    public SmartPhone(String id, int ram, int storage, boolean hasKeyboard, int numberOfSelfies){
        super(id, ram,storage,hasKeyboard);
        this.numberOfSelfies = numberOfSelfies;
    }
    public void takeSelfies(){
        this.numberOfSelfies = this.numberOfSelfies + 1;
    }

    public int getNumberOfSelfies(){
        return this.numberOfSelfies;
    }
}
