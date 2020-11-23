package com.company.actions;
import ru.ifmo.se.pokemon.*;
public class Scary_face extends StatusMove {
    public Scary_face(){
        super(Type.NORMAL,10,100);
    }
    protected String describe(){return ("used Scary_Face move");
    }
}