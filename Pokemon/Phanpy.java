package com.company.Pokemon;
import com.company.actions.*;
import ru.ifmo.se.pokemon.*;

public class Phanpy extends Pokemon {
    public Phanpy(String name, int level) {
        super(name,level);
        this.setStats(90,60,60,40,40,40);
        this.setType(Type.GROUND);
        Move[] Attack=new Move[3];
        Attack[0]= new Slam();
        Attack[1]=new Rock_slide();
        Attack[2]=new Swagger();
        this.setMove(Attack);
    }
}

