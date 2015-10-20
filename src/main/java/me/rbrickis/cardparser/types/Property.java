package me.rbrickis.cardparser.types;

import me.rbrickis.cardparser.SpellSpeeds;

public class Property {

    /**
     * Properties of spell cards
     * <p>
     */
    public enum Spell {
        NORMAL(SpellSpeeds.SPELL_SPEED_1),
        CONTINUOUS(SpellSpeeds.SPELL_SPEED_1),
        RITUAL(SpellSpeeds.SPELL_SPEED_1),
        QUICK_PLAY,
        FIELD(SpellSpeeds.SPELL_SPEED_1),
        EQUIP(SpellSpeeds.SPELL_SPEED_1);

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
