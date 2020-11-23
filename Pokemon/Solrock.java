package com.company.Pokemon;
import ru.ifmo.se.pokemon.*;
import com.company.actions.*;
public class Solrock extends Phanpy {
    public Solrock(String name, int level) {
        super(name,level);
        this.setStats(90,95,85,55,65,70);
        this.setType(Type.ROCK.PSYCHIC);
        Move[] Attack=new Move[4];
        Attack[0]= new Tackle();
        Attack[1]=new Confusion();
        Attack[2]=new Swagger();
        Attack[3]=new Overheat();
        this.setMove(Attack);
    }
}




