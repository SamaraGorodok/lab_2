package com.company.Pokemon;
import ru.ifmo.se.pokemon.*;
import com.company.actions.*;
public class Donphan extends Pokemon {
    public Donphan(String name, int level) {
        super(name,level);
        this.setStats(90,120,120,60,60,50);
        this.setType(Type.GROUND);
        Move[] Attack=new Move[4];
        Attack[0]= new Slam();
        Attack[1]=new Rock_slide();
        Attack[2]=new Swagger();
        Attack[3]=new Scary_face();
        this.setMove(Attack);
    }
}


