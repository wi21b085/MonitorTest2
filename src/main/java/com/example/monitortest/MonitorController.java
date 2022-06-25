package com.example.monitortest;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin //html zugreifen
public class MonitorController {
    Monitor mon = new Monitor();

    @GetMapping("/")
    public String index() {
        return "index";
    } // https://stackoverflow.com/a/47170750
    @RequestMapping("/reset")
    public void reset(String reset){
        mon.reset(reset);
    }
    @RequestMapping("/set")
    public void set(String message){
        mon.set(message);
    }
    @RequestMapping("/deliver")
    public String deliver(){
        return mon.deliver();
    }
    @RequestMapping("/color")
    public String color(){
        return mon.getColor();
    }
}
