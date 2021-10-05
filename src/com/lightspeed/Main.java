package com.lightspeed;

public class Main {
    public static void main(String[] args) {
        Player player = new Sanek();
        player = new AKAquamarine(player);
        System.out.println(player.equip() + "\n");
        player = new AWPDlore(player);
        player = new KnifeBayonet(player);
        System.out.println(player.equip());
    }
}
