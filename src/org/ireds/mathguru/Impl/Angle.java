package org.ireds.mathguru.Impl;

public class Angle {
	
	private int degrees;
    private int minutes;
    private int seconds;

    /**
     * Constructs a new Angle object.
     * 
     * @param degrees the degrees component of the angle
     * @param minutes the minutes component of the angle
     * @param seconds the seconds component of the angle
     */
    public Angle(int degrees, int minutes, int seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
     * Returns the degrees component of the angle.
     * 
     * @return the degrees component of the angle
     */
    public int getDegrees() {
        return degrees;
    }

    /**
     * Sets the degrees component of the angle.
     * 
     * @param degrees the new value for the degrees component of the angle
     */
    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    /**
     * Returns the minutes component of the angle.
     * 
     * @return the minutes component of the angle
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Sets the minutes component of the angle.
     * 
     * @param minutes the new value for the minutes component of the angle
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /**
     * Returns the seconds component of the angle.
     * 
     * @return the seconds component of the angle
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * Sets the seconds component of the angle.
     * 
     * @param seconds the new value for the seconds component of the angle
     */
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    /**
     * Returns a string representation of the angle in degrees, minutes, and seconds.
     * 
     * @return a string representation of the angle in degrees, minutes, and seconds
     */
    @Override
    public String toString() {
        return degrees + "° " + minutes + "' " + seconds + "\"";
    }

}
