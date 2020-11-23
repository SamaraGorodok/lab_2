package com.company.Pokemon;
import ru.ifmo.se.pokemon.*;
import com.company.actions.*;
public class Chansey extends Happiny {
    public Chansey(String name, int level) {
        super(name, level);
        this.setStats(250, 5, 5, 35, 105, 50);
        this.setType(Type.NORMAL);
        Move[] Attack = new Move[3];
        Attack[0] = new Double_Team();
        Attack[1] = new Refresh();
        Attack[2] = new Present();
        this.setMove(Attack);
    }
}
