package com.lightspeed;

public class AKAquamarine extends PlayerDecorator {
    public AKAquamarine(Player SanyaSimple) {
        super(SanyaSimple);
    }

    public String equip() {
        return super.equip() + decoratorAKAquamarine();
    }

    public String decoratorAKAquamarine() {
        return " also i won AK-47 aquamarine";
    }
}
