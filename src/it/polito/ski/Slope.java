package it.polito.ski;

public class Slope {
    //String name, String difficulty, String lift
    private String name;
    private String difficulty;
    private String liftName;

    
    public Slope(String name, String difficulty, String liftName) {
        this.name = name;
        this.difficulty = difficulty;
        this.liftName = liftName;
    }


    public String getName() {
        return name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getLiftName() {
        return liftName;
    }

    

    

}
