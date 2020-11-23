package com.company.Pokemon;
import ru.ifmo.se.pokemon.*;
import com.company.actions.*;
public class Blissey extends Chansey{
        public Blissey(String name, int level) {
            super(name, level);
            this.setStats(255, 10, 10, 75, 135, 55);
            this.setType(Type.NORMAL);
            Move[] Attack = new Move[4];
            Attack[0] = new Double_Team();
            Attack[1] = new Refresh();
            Attack[2] = new Present();
            Attack[3] = new Thunder();
            this.setMove(Attack);
        }

}

