package com.company.actions;
import ru.ifmo.se.pokemon.*;
public class Tackle extends PhysicalMove {
    public Tackle(){
        super(Type.NORMAL,40,100);
    }
    protected String describe(){ return ("used Trackle");
    }
}