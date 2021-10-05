package com.lightspeed;

public class KnifeBayonet extends PlayerDecorator {
    public KnifeBayonet(Player SanyaSimple) {
        super(SanyaSimple);
    }

    public String equip() {
        return super.equip() + decoratorKnifeBayonet();
    }

    public String decoratorKnifeBayonet() {
        return " and i have bayonet fade";
    }
}
