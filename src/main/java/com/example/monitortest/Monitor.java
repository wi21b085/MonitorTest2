package com.example.monitortest;

public class Monitor {

    String message = "";
    String color = "green";

    public void reset(String reset) {
        if (reset.equals("yes") || reset.equals("ja"))
            message = "";
    }

    public void set(String set) {
        message = set;
    }

    public String deliver() {
        return this.message;
    }

    public String getColor(){
        return color;
    }
}
