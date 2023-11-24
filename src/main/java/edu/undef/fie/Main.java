package edu.undef.fie;

import edu.undef.fie.domain.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player goku = new Player(100, 4, new ArrayList<>());
        Player pikoro = new Player(100, 2, new ArrayList<>());

        goku.addToInventory(new WeaponItem("Pistol", 2, 4, new WeaponEquip()));
        goku.addToInventory(new WeaponItem("Knife", 1, 2, new WeaponEquip()));
        goku.addToInventory(new DefenseItem("Shield", 20, new DefenseEquip()));

        pikoro.addToInventory(new DefenseItem("Shield", 20, new DefenseEquip()));

        goku.equip("Pistol");
        pikoro.equip("Shield");


        goku.attack(pikoro);



        System.out.println("goku" + goku);
        System.out.println("pikoro" + pikoro);
    }
}