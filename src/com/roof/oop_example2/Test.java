package com.roof.oop_example2;

public class Test {
    public static void main(String[] args) {
        Monster monster1 = new FireMonster("Fire Man");
        System.out.println(monster1.getName()+ " " + monster1.attack());

        Monster monster2=new WaterMonster("Water Man");
        System.out.println(monster2.getName()+ " " + monster2.attack());

        Monster monster3=new StoneMonster("Stone Man");
        System.out.println(monster3.getName()+ " " + monster3.attack());

        Monster monster4 = new Monster("Monster");
        System.out.println(monster4.getName()+ " " + monster4.attack());
    }
}
