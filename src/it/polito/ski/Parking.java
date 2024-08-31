package it.polito.ski;

import java.util.TreeMap;

public class Parking {
    //String name, int slots

    private String name;
    private int slots;
    private TreeMap<String, Lift> lifts = new TreeMap<>();


    public Parking(String name, int slots) {
        this.name = name;
        this.slots = slots;
    }


    public String getName() {
        return name;
    }


    public int getSlots() {
        return slots;
    }


    public TreeMap<String, Lift> getLifts() {
        return lifts;
    }

    public void addLift(String name, Lift l){
        lifts.put(name, l);
    }

    //true se il numero di posti del parcheggio diviso la somma dei numeri dei posti degli impianti che da esso partono è inferiore a 30.

    public Boolean isProportionate(){
        int sum =0;
        for(Lift l : lifts.values()) sum+=l.getCapacity();
        if((slots/sum)<30) return true;
        return false;
    }

    



}
