package me.rbrickis.cardparser.cards.monster;

import me.rbrickis.cardparser.Card;
import me.rbrickis.cardparser.types.CardType;
import me.rbrickis.cardparser.types.MonsterCardType;

public class MonsterCard extends Card {

    //<editor-fold desc="Fields">
    private MonsterCardType monsterType; // Is it normal? effect? xyz? synchro?
    private int level; // The level or rank (in the case of XYZ)
    //</editor-fold>

    public MonsterCard(String name, String description, MonsterCardType type, int level) {
        super(CardType.MONSTER, name, description);
    }


}
