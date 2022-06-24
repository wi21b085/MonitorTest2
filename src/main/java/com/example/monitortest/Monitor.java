package com.example.monitortest;

public class Monitor {
    String message = null;
    String color = "green";
    public void reset(String reset) {
        if (reset.equals("yes") || reset.equals("ja")){
            message = null;
            color = "green";
        }
    }
    public void set(String set) {
        if(set != null){
            message = set;
            color = "red";
        }
    }
    public String deliver() {
        return this.message;
    }
    public String getColor(){
        return this.color;
    }
}
