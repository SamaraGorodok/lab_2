package com.company.actions;
import ru.ifmo.se.pokemon.*;

public class Rock_slide extends SpecialMove {
    public Rock_slide(){//повышает уклон на 10
        super(Type.ROCK,75,90);
    }
    protected String describe() {
        return ("used Rock Slide");
    }
}
