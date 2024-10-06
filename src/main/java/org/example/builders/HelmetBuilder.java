package org.example.builders;

import org.example.equipment.Helmet;

/**
 * This class implements the design patterns Builder for the class {@link Helmet}
 * @author BloodSlayer-404
 */
public class HelmetBuilder implements Builder<Helmet>{
    private Helmet helmet;

    /**
     * The constructor initialize the boots variable with a new object of {@link Helmet} class
     */
    public HelmetBuilder() {
        helmet = new Helmet();
    }

    /**
     * Set the name of the Helmet in the builder
     * @param name : The name of the Helmet to create
     * @return This object
     */
    public HelmetBuilder helmetName(String name) {
        helmet.setHelmetName(name);
        return this;
    }

    /**
     * Set the protection points of the Helmet in the builder
     * @param protectionPoints : The protection points  of the Helmet to create
     * @return This object
     */
    public HelmetBuilder protectionPoints(double protectionPoints) {
        helmet.setProtectionPoints(protectionPoints);
        return this;
    }

    /**
     * Set the durability of the Helmet in the builder
     * @param durability : The name of the Helmet to create
     * @return This object
     */
    public HelmetBuilder durability(int durability) {
        helmet.setDurability(durability);
        return this;
    }

    /**
     * Create the helmet specified by the other methods and reset the helmet in the builder
     * @return The Helmet that the builder have
     */
    @Override
    public Helmet build() {
        Helmet helmet =  this.helmet;
        reset();
        return helmet;
    }

    /**
     * Set a new object of {@link Helmet} class to the boots of the builder
     */
    private void reset() {
        helmet = new Helmet();
    }

}
