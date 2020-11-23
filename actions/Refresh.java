package com.company.actions;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

public class Refresh extends StatusMove {
    private final Effect Refresh= new Effect().chance(1).stat(Stat.HP,100);
    public Refresh() {};
    protected void applySelfEffects(Pokemon atk) {atk.addEffect(Refresh);}
    protected String describe(){return("used Refresh");}
}
