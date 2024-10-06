package org.example.builders;

import org.example.Zombie;
import org.example.equipment.*;

/**
 * This class implements the design patterns Builder for the class {@link Zombie}
 * @author BloodSlayer-404
 */
public class ZombieBuilder implements Builder<Zombie>{
    private Zombie zombie;

    /**
     * The constructor initialize the boots variable with a new object of {@link Zombie} class
     */
    public ZombieBuilder(){
        zombie = new Zombie();
    }

    /**
     * Set the name of the Zombie in the builder
     * @param name : The name of the Zombie to create
     * @return This object
     */
    public ZombieBuilder name(String name) {
        zombie.setName(name);
        return this;
    }

    /**
     * Set the health points of the Zombie in the builder
     * @param healthPoints : The health points of the Zombie to create
     * @return This object
     */
    public ZombieBuilder healthPoints(double healthPoints) {
        zombie.setHealthPoints(healthPoints);
        return this;
    }

    /**
     * Set the weapon of the Zombie in the builder
     * @param weapon : The weapon of the Zombie to create
     * @return This object
     */
    public ZombieBuilder weapon(Weapon weapon) {
        zombie.setWeapon(weapon);
        return this;
    }

    /**
     * Set the helmet of the Zombie in the builder
     * @param helmet : The helmet of the Zombie to create
     * @return This object
     */
    public ZombieBuilder helmet(Helmet helmet) {
        zombie.setHelmet(helmet);
        return this;
    }

    /**
     * Set the chesplate of the Zombie in the builder
     * @param chesplate : The chesplate of the Zombie to create
     * @return This object
     */
    public ZombieBuilder chesplate(Chesplate chesplate) {
        zombie.setChesplate(chesplate);
        return this;
    }

    /**
     * Set the leggings of the Zombie in the builder
     * @param leggings : The leggings of the Zombie to create
     * @return This object
     */
    public ZombieBuilder leggings(Leggings leggings) {
        zombie.setLeggings(leggings);
        return this;
    }

    /**
     * Set the boots of the Zombie in the builder
     * @param boots : The boots of the Zombie to create
     * @return This object
     */
    public ZombieBuilder boots(Boots boots) {
        zombie.setBoots(boots);
        return this;
    }

    /**
     * Create the zombie specified by the other methods and reset the zombie in the builder
     * @return The Zombie that the builder have
     */
     @Override
    public Zombie build(){
        Zombie zombie =  this.zombie;
        reset();
        return zombie;
    }

    /**
     * Set a new object of {@link Zombie} class to the boots of the builder
     */
    public void reset(){
        zombie = new Zombie();
    }
}
