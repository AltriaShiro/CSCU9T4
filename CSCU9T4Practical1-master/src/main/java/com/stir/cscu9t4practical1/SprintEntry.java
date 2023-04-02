package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {
    private int reptitions;
    private int recoveryTime;
    
    public SprintEntry(String n, int d, int m, int y, int h, int min, int sec, float dist, int rounds, int recoveryTime){
            super(n, d, m, y, h, min, sec, dist);
            this.reptitions = rounds;
            this.recoveryTime = recoveryTime;
    }
    
    public int getRepetitions(){
        return reptitions;
    }
    public int getRecovery(){
        return recoveryTime;
    }
    
    @Override
    public String getEntry(){
        String result = getName() +"run" + getRepetitions() + "rounds of sprints"
                +getRecovery() + "Minutes, covering the distance of" +getDistance() + " km in "
                +getHour()+":"+getMin()+":"+ getSec() + " on "
                +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
        return result;
    }
}