package com.company.actions;
import ru.ifmo.se.pokemon.*;
public class Slam extends PhysicalMove {
    public Slam(){
        super(Type.NORMAL,80,75);
    }
    protected String describe() {return ("used Slam");
    }
}