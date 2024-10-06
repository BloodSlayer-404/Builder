package org.example.builders;

import org.example.equipment.Weapon;

/**
 * This class implements the design patterns Builder for the class {@link Weapon}
 * @author BloodSlayer-404
 */
public class WeaponBuilder implements Builder<Weapon>{
    private Weapon weapon;

    /**
     * The constructor initialize the boots variable with a new object of {@link Weapon} class
     */
    public WeaponBuilder(){
        weapon = new Weapon();
    }

    /**
     * Set the name of the Weapon in the builder
     * @param name : The name of the Weapon to create
     * @return This object
     */
    public WeaponBuilder weaponName(String name) {
        weapon.setWeaponName(name);
        return this;
    }

    /**
     * Set the damage that deals the Weapon in the builder
     * @param damage : The damage that deals the Weapon to create
     * @return This object
     */
    public WeaponBuilder damage(double damage) {
        weapon.setDamage(damage);
        return this;
    }

    /**
     * Set the durability of the Weapon in the builder
     * @param durability : The name of the Weapon to create
     * @return This object
     */
    public WeaponBuilder durability(int durability) {
        weapon.setDurability(durability);
        return this;
    }

    /**
     * Create the weapon specified by the other methods and reset the weapon in the builder
     * @return The Weapon that the builder have
     */
    @Override
    public Weapon build() {
        Weapon weapon =  this.weapon;
        reset();
        return weapon;
    }

    /**
     * Set a new object of {@link Weapon} class to the boots of the builder
     */
    private void reset() {
        weapon = new Weapon();
    }
}
