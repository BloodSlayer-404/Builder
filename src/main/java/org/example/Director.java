package org.example;

import org.example.builders.*;
import org.example.equipment.*;

/**
 * This class has the recipes for all the objects that apply the Builder design pattern
 * @author BloodSlayer-404
 */
public class Director {
    private ZombieBuilder zb;
    private WeaponBuilder wb;
    private HelmetBuilder hb;
    private ChesplateBuilder cb;
    private LeggingsBuilder lb;
    private BootsBuilder bb;

    public Director(){
        zb = new ZombieBuilder();
        wb = new WeaponBuilder();
        hb = new HelmetBuilder();
        cb = new ChesplateBuilder();
        lb = new LeggingsBuilder();
        bb = new BootsBuilder();
    }

    /**
     * Generates a zombie with: <p>
     *      {@link Boots}: bootsName = "Diamond Boots", protectionPoints = 3, durability = 429
     *      <p>
     *      {@link Chesplate}: chesplateName = "Diamond Chestplate", protectionPoints = 8, durability = 528
     *      <p>
     *      {@link Leggings}: leggingsName = "Diamond Leggings", protectionPoints = 6, durability = 495
     *      <p>
     *      {@link Helmet}: helmetName = "Diamond Helmet", protectionPoints = 3, durability = 363
     *      <p>
     *      {@link Weapon}: weaponName = "Trident", damage= 9, durability = 250
     *      <p>
     *      healthPoints = 40
     *      <p>
     *      name = "Hard Zombie"
     * @return A {@link Zombie} with high level equipment
     */
    public Zombie constructZombieHard(){
        return zb.name("Hard Zombie")
                .healthPoints(40)
                .weapon(constructTrindet())
                .helmet(constructDiamondHelmet())
                .chesplate(constructDiamondChesplate())
                .leggings(constructDiamondLeggings())
                .boots(constructDiamondBoots())
                .build();
    }

    /**
     * Generates a zombie with: <p>
     *      {@link Boots}: bootsName = "Golden Boots", protectionPoints = 1, durability = 91
     *      <p>
     *      {@link Chesplate}: chesplateName = "Golden Chestplate", protectionPoints = 5, durability = 112
     *      <p>
     *      {@link Leggings}: leggingsName = "Iron Leggings", protectionPoints = 5, durability = 225
     *      <p>
     *      {@link Helmet}: helmetName = "Iron Helmet", protectionPoints = 2, durability = 165
     *      <p>
     *      {@link Weapon}: weaponName = "Shield", damage= 2, durability = 336
     *      <p>
     *      healthPoints = 20
     *      <p>
     *      name = "Normal Zombie"
     * @return A {@link Zombie} with medium level equipment
     */
    public Zombie constructZombieNormal(){
        return zb.name("Normal Zombie")
                .healthPoints(20)
                .weapon(constructShield())
                .helmet(constructIronHelmet())
                .chesplate(constructGoldChesplate())
                .leggings(constructIronLeggings())
                .boots(constructGoldBoots())
                .build();
    }

    /**
     * Generates a zombie with: <p>
     *      {@link Boots}: null
     *      <p>
     *      {@link Chesplate}: null
     *      <p>
     *      {@link Leggings}: null
     *      <p>
     *      {@link Helmet}: null
     *      <p>
     *      {@link Weapon}: null
     *      <p>
     *      healthPoints = 10
     *      <p>
     *      name = "Easy Zombie"
     * @return A {@link Zombie} without equipment
     */
    public Zombie constructZombieEasy(){
        return  zb.name("Easy Zombie")
                .healthPoints(10)
                .build();
    }


    /**
     * Generates a weapon with: <p>
     * weaponName = "Trident" <p>
     * damage = 9 <p>
     * durability = 250
     * @return A high level {@link Weapon} called "Trident"
     */
    private Weapon constructTrindet() {
        return wb.weaponName("Trident")
                .durability(250)
                .damage(9)
                .build();
    }

    /**
     * Generates a weapon with: <p>
     * weaponName = "Shield" <p>
     * damage = 2 <p>
     * durability = 336
     * @return A medium level {@link Weapon} called "Shield"
     */
    private Weapon constructShield() {
        return wb.weaponName("Shield")
                .durability(336)
                .damage(2)
                .build();
    }

    /**
     * Generates a helmet with: <p>
     * helmetName = "Diamond Helmet" <p>
     * protectionPoints = 3 <p>
     * durability = 363
     * @return A {@link Helmet} made of diamond
     */
    private Helmet constructDiamondHelmet() {
        return hb.helmetName("Diamond Helmet")
                .durability(363)
                .protectionPoints(3)
                .build();
    }

    /**
     * Generates a helmet with: <p>
     * helmetName = "Golden Helmet" <p>
     * protectionPoints = 2 <p>
     * durability = 77
     * @return A {@link Helmet} made of gold
     */
    private Helmet constructGoldHelmet() {
        return hb.helmetName("Golden Helmet")
                .durability(77)
                .protectionPoints(2)
                .build();
    }

    /**
     * Generates a helmet with: <p>
     * helmetName = "Iron Helmet" <p>
     * protectionPoints = 2 <p>
     * durability = 165
     * @return A {@link Helmet} made of iron
     */
    private Helmet constructIronHelmet() {
        return hb.helmetName("Iron Helmet")
                .durability(165)
                .protectionPoints(2)
                .build();
    }

    /**
     * Generates a chesplate with: <p>
     * helmetName = "Diamond Chestplate" <p>
     * protectionPoints = 8 <p>
     * durability = 528
     * @return A {@link Chesplate} made of diamond
     */
    private Chesplate constructDiamondChesplate() {
        return cb.chesplateName("Diamond Chestplate")
                .durability(528)
                .protectionPoints(8)
                .build();
    }

    /**
     * Generates a chesplate with: <p>
     * helmetName = "Golden Chestplate" <p>
     * protectionPoints = 5 <p>
     * durability = 112
     * @return A {@link Chesplate} made of gold
     */
    private Chesplate constructGoldChesplate() {
        return  cb.chesplateName("Golden Chestplate")
                .durability(112)
                .protectionPoints(5)
                .build();
    }

    /**
     * Generates a chesplate with: <p>
     * helmetName = "Iron Chestplate" <p>
     * protectionPoints = 6 <p>
     * durability = 240
     * @return A {@link Chesplate} made of iron
     */
    private Chesplate constructIronChesplate() {
        return cb.chesplateName("Iron Chestplate")
                .durability(240)
                .protectionPoints(6)
                .build();
    }

    /**
     * Generates a leggings with: <p>
     * helmetName = "Diamond Leggings" <p>
     * protectionPoints = 6 <p>
     * durability = 495
     * @return A {@link Leggings} made of diamond
     */
    private Leggings constructDiamondLeggings() {
        return lb.leggingsName("Diamond Leggings")
                .durability(495)
                .protectionPoints(6)
                .build();
    }

    /**
     * Generates a leggings with: <p>
     * helmetName = "Golden Leggings" <p>
     * protectionPoints = 3 <p>
     * durability = 105
     * @return A {@link Leggings} made of gold
     */
    private Leggings constructGoldLeggings() {
        return lb.leggingsName("Golden Leggings")
                .durability(105)
                .protectionPoints(3)
                .build();
    }

    /**
     * Generates a leggings with: <p>
     * helmetName = "Iron Leggings" <p>
     * protectionPoints = 5 <p>
     * durability = 225
     * @return A {@link Leggings} made of iron
     */
    private Leggings constructIronLeggings() {
        return lb.leggingsName("Iron Leggings")
                .durability(225)
                .protectionPoints(5)
                .build();
    }

    /**
     * Generates a boots with: <p>
     * helmetName = "Diamond Boots" <p>
     * protectionPoints = 3 <p>
     * durability = 429
     * @return A {@link Boots} made of diamond
     */
    private Boots constructDiamondBoots() {
        return bb.bootsName("Diamond Boots")
                .durability(429)
                .protectionPoints(3)
                .build();
    }

    /**
     * Generates a boots with: <p>
     * helmetName = "Golden Boots" <p>
     * protectionPoints = 1 <p>
     * durability = 91
     * @return A {@link Boots} made of gold
     */
    private Boots constructGoldBoots() {
        return bb.bootsName("Golden Boots")
                .durability(91)
                .protectionPoints(1)
                .build();
    }

    /**
     * Generates a boots with: <p>
     * helmetName = "Iron Boots" <p>
     * protectionPoints = 2 <p>
     * durability = 195
     * @return A {@link Boots} made of iron
     */
    private Boots constructIronBoots() {
        return bb.bootsName("Iron Boots")
                .durability(195)
                .protectionPoints(2)
                .build();
    }
}
