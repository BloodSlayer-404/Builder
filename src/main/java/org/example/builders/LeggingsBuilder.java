package org.example.builders;

import org.example.equipment.Leggings;

/**
 * This class implements the design patterns Builder for the class {@link Leggings}
 * @author BloodSlayer-404
 */
public class LeggingsBuilder implements Builder<Leggings>{
    private Leggings leggings;

    /**
     * The constructor initialize the boots variable with a new object of {@link Leggings} class
     */
    public LeggingsBuilder() {
        leggings = new Leggings();
    }

    /**
     * Set the name of the Leggings in the builder
     * @param name : The name of the Leggings to create
     * @return This object
     */
    public LeggingsBuilder leggingsName(String name) {
        leggings.setLeggingsName(name);
        return this;
    }

    /**
     * Set the protection points of the Leggings in the builder
     * @param protectionPoints : The protection points  of the Leggings to create
     * @return This object
     */
    public LeggingsBuilder protectionPoints(double protectionPoints) {
        leggings.setProtectionPoints(protectionPoints);
        return this;
    }

    /**
     * Set the durability of the Leggings in the builder
     * @param durability : The name of the Leggings to create
     * @return This object
     */
    public LeggingsBuilder durability(int durability) {
        leggings.setDurability(durability);
        return this;
    }

    /**
     * Create the leggings specified by the other methods and reset the leggings in the builder
     * @return The Leggings that the builder have
     */
    @Override
    public Leggings build() {
        Leggings leggings =  this.leggings;
        reset();
        return leggings;
    }

    /**
     * Set a new object of {@link Leggings} class to the boots of the builder
     */
    private void reset() {
        leggings = new Leggings();
    }
}
