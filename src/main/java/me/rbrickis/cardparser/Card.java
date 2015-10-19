package me.rbrickis.cardparser;

import me.rbrickis.cardparser.types.CardType;

public class Card {

    /**
     * Every card has a name, and a description
     */
    private String name;
    private String description;


    /**
     * This determines the type of card. (Spell, Trap, Monster)
     */
    private CardType cardType;


    public Card(CardType type, String name, String description) {
        this.cardType = type;
        this.name = name;
        this.description = description;
    }

    //<editor-fold desc="Getters & Setters">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
    //</editor-fold>
}
