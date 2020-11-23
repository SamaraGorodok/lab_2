package com.company.Pokemon;
import com.company.actions.*;
import ru.ifmo.se.pokemon.*;

public class Happiny extends Pokemon {
    public Happiny(String name, int level) {
        super(name,level);
        this.setStats(100,5,5,15,65,30);
        this.setType(Type.NORMAL);
        Move[] Attack=new Move[3];
        Attack[0]= new Double_Team();
        Attack[1]=new Refresh();

        this.setMove(Attack);
    }
}

