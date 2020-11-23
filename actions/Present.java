package com.company.actions;
import ru.ifmo.se.pokemon.*;
public class Present extends StatusMove {

    private final Effect Present_def = new Effect().chance(0.5).turns(1).stat(Stat.HP, -100);

    protected void applySelfEffects(Pokemon atk) {
        double A = Math.random();
        if (A<0.4){
            atk.setMod(Stat.ATTACK, 40);
        }
        else if (A>=0.4&&A<0.7){
            atk.setMod(Stat.ATTACK, 80);
        }
        else if (A>=0.7&&A<0.8){
            atk.setMod(Stat.ATTACK, 120);
        }
        else if (A>=0.8&&A<1){
            atk.setMod(Stat.HP, (int) (atk.getHP() * 1.25));
        }
    }
    protected void applyOppEffects(Pokemon def) {def.addEffect(Present_def);}
    protected String describe() {return("used Present");}
}
