package edu.undef.fie.domain;

import edu.undef.fie.domain.Player;
import edu.undef.fie.interfaces.EquipStrategy;
import edu.undef.fie.interfaces.Item;

public class WeaponEquip implements EquipStrategy {
    @Override
    public void equip(Player player, Item item) {
        player.increasePower(item.getValue());
    }
}
