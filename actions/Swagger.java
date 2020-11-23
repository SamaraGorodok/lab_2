package com.company.actions;
import ru.ifmo.se.pokemon.*;
public class Swagger extends StatusMove {
    Effect Swagger = new Effect().chance(0.85).turns(-1).stat(Stat.ATTACK,2);
    public Swagger() {}
    protected void applyOppEffects(Pokemon def) {def.addEffect(Swagger);def.confuse();}
    protected String describe() {return("use Swagger");}
}