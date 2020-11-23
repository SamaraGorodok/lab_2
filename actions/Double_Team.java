package com.company.actions;
import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove {
    public   Double_Team() {
        super(Type.NORMAL, 0, 0);
    }
    protected String describe(){
        return "used DoubleTeam"; }
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION,+1);
    }
}