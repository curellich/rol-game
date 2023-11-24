package edu.undef.fie.domain;

import edu.undef.fie.domain.Player;
import edu.undef.fie.interfaces.EquipStrategy;
import edu.undef.fie.interfaces.Item;

public class DefenseEquip implements EquipStrategy {

    @Override
    public void equip(Player player, Item item) {
        player.increaseLife(item.getValue());
    }
}
