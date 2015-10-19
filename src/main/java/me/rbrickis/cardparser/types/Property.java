package me.rbrickis.cardparser.types;

import me.rbrickis.cardparser.EquipSpeeds;

public class Property {

    /**
     * Properties of spell cards
     * <p>
     * include card speed?
     */
    public enum Spell {
        NORMAL(EquipSpeeds.SPELL_SPEED_1),
        CONTINUOUS(EquipSpeeds.SPELL_SPEED_1),
        RITUAL(EquipSpeeds.SPELL_SPEED_1),
        QUICK_PLAY,
        FIELD(EquipSpeeds.SPELL_SPEED_1),
        EQUIP(EquipSpeeds.SPELL_SPEED_1);

        private int spellSpeed; // Optional

        Spell() {
            this(0);
        }

        Spell(int speed) {
            this.spellSpeed = speed;
        }
    }


    public enum Trap {

    }

}
