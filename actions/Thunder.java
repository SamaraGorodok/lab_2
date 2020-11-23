package com.company.actions;
import ru.ifmo.se.pokemon.*;
public class Thunder extends SpecialMove {
    public Thunder(){
        super (Type.ELECTRIC,110,70);
    }
    protected String describe() {return("used Thunder");
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) Effect.paralyze(p);
    }}