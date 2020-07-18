package advance;

public class LearnSingleton {
    public String pizzaname;
    public int pizzaprice;
    public String pizzaqty;
    public String pizzadeliverycharge;
    private char size='L';
    private boolean isAvailable;

    private LearnSingleton(){
    ////private constuctor
    }
    // create instance variable/object
    private static LearnSingleton instance=new LearnSingleton();
    public static LearnSingleton getInstance(){
        return instance;
    }
    //    getter and setter
    // get size
    public char getSize() {
        return size;
    }
    // get set
    public void setSize(char size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}


