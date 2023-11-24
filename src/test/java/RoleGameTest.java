import edu.undef.fie.domain.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class RoleGameTest {
    @Test
    @DisplayName("Role game tests")
    void Test() {
        Player goku = new Player(100, 4, new ArrayList<>());
        Player pikoro = new Player(100, 2, new ArrayList<>());

        goku.addToInventory(new WeaponItem("Pistol", 2, 4, new WeaponEquip()));
        goku.addToInventory(new WeaponItem("Knife", 1, 2, new WeaponEquip()));
        goku.addToInventory(new DefenseItem("Shield", 20, new DefenseEquip()));

        pikoro.addToInventory(new DefenseItem("Shield", 20, new DefenseEquip()));

        goku.equip("Pistol");
        pikoro.equip("Shield");
        goku.attack(pikoro);

        System.out.println("pikoro = " + pikoro);
        System.out.println("goku = " + goku);
        //Assertions

        assertEquals(114, pikoro.getLife(), "Pikoro's life should be reduced after being attacked");
        assertEquals(6, goku.getPower(), "Goku's power should be increased after being equiped");


    }
}
