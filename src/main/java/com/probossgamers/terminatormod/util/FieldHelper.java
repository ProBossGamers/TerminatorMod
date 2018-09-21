package com.probossgamers.terminatormod.util;

/**
 * A Field helper designed to assist
 * with calculations.
 */
public class FieldHelper
{

    /**
     * Calculate the actual health given the number
     * of hearts in the Minecraft health bar.
     *
     * @param hearts the hearts
     * @return the double
     */
    public static double calculateHealthFromHearts(double hearts)
    {
        return 2 * hearts;
    }
}
