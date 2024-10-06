package org.example.builders;

import org.example.equipment.Chesplate;

/**
 * This class implements the design patterns Builder for the class {@link Chesplate}
 * @author BloodSlayer-404
 */
public class ChesplateBuilder implements Builder<Chesplate> {
    private Chesplate chesplate;

    /**
     * The constructor initialize the boots variable with a new object of {@link Chesplate} class
     */
    public ChesplateBuilder(){
        chesplate = new Chesplate();
    }

    /**
     * Set the name of the Chesplate in the builder
     * @param name : The name of the Chesplate to create
     * @return This object
     */
    public ChesplateBuilder chesplateName(String name) {
        chesplate.setChesplateName(name);
        return this;
    }

    /**
     * Set the protection points of the Chesplate in the builder
     * @param protectionPoints : The protection points  of the Chesplate to create
     * @return This object
     */
    public ChesplateBuilder protectionPoints(double protectionPoints) {
        chesplate.setProtectionPoints(protectionPoints);
        return this;

    }

    /**
     * Set the durability of the Chesplate in the builder
     * @param durability : The name of the Chesplate to create
     * @return This object
     */
    public ChesplateBuilder durability(int durability) {
        chesplate.setDurability(durability);
        return this;
    }

    /**
     * Create the chesplate specified by the other methods and reset the chesplate in the builder
     * @return The Chesplate that the builder have
     */
    @Override
    public Chesplate build() {
        Chesplate chesplate =  this.chesplate;
        reset();
        return chesplate;
    }

    /**
     * Set a new object of {@link Chesplate} class to the boots of the builder
     */
    private void reset() {
        chesplate = new Chesplate();
    }
}
