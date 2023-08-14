package src;

import src.model.Hero;
import src.model.Item;

public class App {
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

        Item pot = new Item();
        pot.name = "血瓶";
        pot.price = 50;

        Item shoe = new Item();
        shoe.name = "草鞋";
        shoe.price = 300;

        Item sword = new Item();
        sword.name = "长剑";
        sword.price = 350;

        garen.addSpeed(100);
    }
}
