package org.example.builders;

import org.example.equipment.Boots;

/**
 * This class implements the design patterns Builder for the class {@link Boots}
 * @author BloodSlayer-404
 */
public class BootsBuilder implements Builder<Boots>{
    private Boots boots;

    /**
     * The constructor initialize the boots variable with a new object of {@link Boots} class
     */
    public BootsBuilder(){
        boots = new Boots();
    }

    /**
     * Set the name of the Boots in the builder
     * @param name : The name of the Boots to create
     * @return This object
     */
    public BootsBuilder bootsName(String name) {
        boots.setBootsName(name);
        return this;
    }

    /**
     * Set the protection points of the Boots in the builder
     * @param protectionPoints : The protection points  of the Boots to create
     * @return This object
     */
    public BootsBuilder protectionPoints(double protectionPoints) {
        boots.setProtectionPoints(protectionPoints);
        return this;
    }

    /**
     * Set the durability of the Boots in the builder
     * @param durability : The name of the Boots to create
     * @return This object
     */
    public BootsBuilder durability(int durability) {
        boots.setDurability(durability);
        return this;
    }

    /**
     * Create the boots specified by the other methods and reset the boots in the builder
     * @return The Boots that the builder have
     */
    @Override
    public Boots build() {
        Boots boots =  this.boots;
        reset();
        return boots;
    }

    /**
     * Set a new object of {@link Boots} class to the boots of the builder
     */
    private void reset() {
        this.boots = new Boots();
    }
}
