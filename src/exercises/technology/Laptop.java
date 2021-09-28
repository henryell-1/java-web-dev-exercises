package exercises.technology;

public class Laptop extends Computer{

    private double weight;

    public Laptop( String id, int ram, int storage, boolean hasKeyboard, double weight){
        super(id, ram,storage, hasKeyboard);
        this.weight = weight;
    }

    public boolean isClunky(){
        if(weight > 5.0){
            return true;
        }else {
            return false;
        }
    }
}
