package com.lightspeed;

public abstract class PlayerDecorator implements Player {
    private Player SanyaSimple;

    @Override
    public String equip() {
        return SanyaSimple.equip();
    }

    public PlayerDecorator(Player SanyaSimple) {
        this.SanyaSimple = SanyaSimple;
    }
}
