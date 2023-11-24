package edu.undef.fie.domain;

import edu.undef.fie.interfaces.EquipStrategy;
import edu.undef.fie.interfaces.Item;

public class DefenseItem implements Item {

    private String name;
    private int value;
    private EquipStrategy equipStrategy;

    public DefenseItem(String name, int value, EquipStrategy equipStrategy) {
        this.name = name;
        this.value = value;
        this.equipStrategy = equipStrategy;
    }

    public EquipStrategy getEquipStrategy() {
        return this.equipStrategy;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Defense{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
