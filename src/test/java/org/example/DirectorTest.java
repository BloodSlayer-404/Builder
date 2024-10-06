package org.example;

import org.example.equipment.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;

class DirectorTest {
    Director director;

    @BeforeEach
    void setUp() {
        director = new Director();
    }

    @Test
    void hardZombieTest(){
        Zombie zombie = director.constructZombieHard();
        assertEquals("Diamond Boots", zombie.getBoots().getBootsName());
        assertEquals("Diamond Leggings", zombie.getLeggings().getLeggingsName());
        assertEquals("Diamond Chestplate", zombie.getChesplate().getChesplateName());
        assertEquals("Diamond Helmet", zombie.getHelmet().getHelmetName());
        assertEquals("Trident", zombie.getWeapon().getWeaponName());
        assertEquals("Hard Zombie", zombie.getName());
        assertEquals(40, zombie.getHealthPoints());
    }

    @Test
    void normalZombieTest(){
        Zombie zombie = director.constructZombieNormal();
        assertEquals("Golden Boots", zombie.getBoots().getBootsName());
        assertEquals("Iron Leggings", zombie.getLeggings().getLeggingsName());
        assertEquals("Golden Chestplate", zombie.getChesplate().getChesplateName());
        assertEquals("Iron Helmet", zombie.getHelmet().getHelmetName());
        assertEquals("Shield", zombie.getWeapon().getWeaponName());
        assertEquals("Normal Zombie", zombie.getName());
        assertEquals(20, zombie.getHealthPoints());
    }

    @Test
    void easyZombieTest(){
        Zombie zombie = director.constructZombieEasy();
        assertNull(zombie.getBoots());
        assertNull(zombie.getLeggings());
        assertNull(zombie.getChesplate());
        assertNull(zombie.getHelmet());
        assertNull(zombie.getWeapon());
        assertEquals("Easy Zombie", zombie.getName());
        assertEquals(10, zombie.getHealthPoints());
    }
}