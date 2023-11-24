package edu.undef.fie.domain;


import edu.undef.fie.interfaces.Item;

import java.util.List;

public class Player {

    private int life;
    private int power;
    private List<Item> inventory;

    public Player(int life, int power, List<Item> inventory) {
        this.life = life;
        this.power = power;
        this.inventory = inventory;
    }

    public void addToInventory(Item item){
       if(this.inventory.size()<8){
           this.inventory.add(item);
       }
    }

    public void equip(String item) {
        Item itemToBeEquipedInPlayer = searchItemInInventory(item);
        itemToBeEquipedInPlayer.getEquipStrategy().equip(this, itemToBeEquipedInPlayer);
    }

    public Item searchItemInInventory(String name) {
        for (var item : inventory) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public void increaseLife(int amount) {
        this.life += amount;
    }

    public void decreaseLife(int amount) {
        if(this.life - amount >= 0) {
            this.life -= amount;
        }else{
            this.life = 0;
        }
    }

    public void increasePower(int amount){
        this.power += amount;
    }

    public int getPower() {
        return power;
    }

    public void attack(Player enemy){
        enemy.decreaseLife(getPower());
    }

    @Override
    public String toString() {
        return "Player{" +
                "life=" + life +
                ", power=" + power +
                ", inventory=" + inventory +
                '}';
    }
}
