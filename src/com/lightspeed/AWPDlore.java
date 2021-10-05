package com.lightspeed;

public class AWPDlore extends PlayerDecorator {
    public AWPDlore (Player SanyaSimple) {
        super(SanyaSimple);
    }

    public String equip() {
        return super.equip() + decoratorAWPDlore();
    }

    public String decoratorAWPDlore() {
        return " plus subscriber gave me AWP dragon lore";
    }
}
