package org.example.builders;

import org.example.Zombie;
import org.example.equipment.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildersTest {

    @Test
    void buildHelmetTest() {
        HelmetBuilder bb = new HelmetBuilder();
        Helmet helmet1 = bb.helmetName("Paco").durability(1000).protectionPoints(2).build();
        Helmet helmet2 = bb.helmetName("Paco").build();
        assertNotEquals(helmet1.toString(), helmet2.toString());

    }

    @Test
    void buildChesplateTest() {
        ChesplateBuilder cb = new ChesplateBuilder();
        Chesplate chesplate1 = cb.chesplateName("Paco").durability(1000).protectionPoints(2).build();
        Chesplate chesplate2 = cb.chesplateName("Paco").build();
        assertNotEquals(chesplate1.toString(), chesplate2.toString());
    }

    @Test
    void buildLeggingsTest() {
        LeggingsBuilder lb = new LeggingsBuilder();
        Leggings leggings1 = lb.leggingsName("Paco").durability(1000).protectionPoints(2).build();
        Leggings leggings2 = lb.leggingsName("Paco").build();
        assertNotEquals(leggings1.toString(), leggings2.toString());
    }

    @Test
    void buildBootsTest() {
        BootsBuilder bb = new BootsBuilder();
        Boots boots1 = bb.bootsName("Paco").durability(1000).protectionPoints(2).build();
        Boots boots2 = bb.bootsName("Paco").build();
        assertNotEquals(boots1.toString(), boots2.toString());
    }

    @Test
    void buildWeaponTest() {
        WeaponBuilder wb = new WeaponBuilder();
        Weapon weapon1 = wb.weaponName("Paco").durability(1000).damage(7).build();
        Weapon weapon2 = wb.weaponName("Paco").build();
        assertNotEquals(weapon1.toString(), weapon2.toString());
    }

    @Test
    void buildZombieTest() {
        ZombieBuilder zb = new ZombieBuilder();
        Zombie zombie1 = zb.name("Paco").healthPoints(10).build();
        Zombie zombie2 = zb.name("Paco").build();
        assertNotEquals(zombie1.toString(), zombie2.toString());
    }
}