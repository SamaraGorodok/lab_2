package com.company.actions;
import ru.ifmo.se.pokemon.*;
public class Overheat extends SpecialMove {
    Effect Overheat = new Effect().chance(1).turns(2);
    public Overheat(){
        super(Type.FIRE,130,90);//надо понизить спец атаку использующего на 2 ступени
    }
    protected String describe() {
        return ("used Rock Slide");
    }
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK,-2);
    }
}