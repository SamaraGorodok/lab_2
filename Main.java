package com.company;
import ru.ifmo.se.pokemon.*;
import com.company.Pokemon.*;
public class Main {

    public static void main(String[] args) {
        Battle battle = new Battle();
        Phanpy Phanpy= new Phanpy("Фанпи",1);
        Donphan Donphan= new Donphan("Донфан",50);
        Happiny Happiny= new Happiny("Хэппини",100);
        Solrock Solrock= new Solrock("Солрок",1);
        Chansey Chansey = new Chansey("Ченси",50);
        Blissey Blissey = new Blissey("Блисси",100);

        battle.addAlly(new Donphan("Донфан",50));
        battle.addAlly(new Happiny("Хэппини",100));
        battle.addAlly(new Phanpy("Фанфи",1));
        battle.addFoe(new Solrock("Солрок",1));
        battle.addFoe(new Chansey("Ченси",50));
        battle.addFoe(new Blissey("Блисси",100));
        battle.go();

    }
}
