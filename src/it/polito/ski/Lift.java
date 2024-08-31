package it.polito.ski;

public class Lift {
    //String code, String category, int capacity

    private String code;
    private String category;
    private int capacity;


    public Lift(String code, String category, int capacity) {
        this.code = code;
        this.category = category;
        this.capacity = capacity;
    }


    public String getCode() {
        return code;
    }


    public String getCategory() {
        return category;
    }


    public int getCapacity() {
        return capacity;
    }

    

    

}
