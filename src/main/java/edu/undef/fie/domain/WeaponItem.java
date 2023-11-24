package edu.undef.fie.domain;

import edu.undef.fie.interfaces.EquipStrategy;
import edu.undef.fie.interfaces.Item;

import java.util.concurrent.ThreadLocalRandom;

public class WeaponItem implements Item {

    private String name;
    private int minimumValue;
    private int maximumValue;

    private EquipStrategy equipStrategy;

    public WeaponItem(String name, int minimumValue, int maximumValue, EquipStrategy equipStrategy) {
        this.name = name;
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.equipStrategy = equipStrategy;
    }

    public EquipStrategy equipStrategy(){
        return this.equipStrategy;
    }

    public int getValue(){
        return ThreadLocalRandom.current().nextInt(this.minimumValue, this.maximumValue);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public EquipStrategy getEquipStrategy() {
        return this.equipStrategy;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", minimumValue=" + minimumValue +
                ", maximumValue=" + maximumValue +
                '}';
    }
}
