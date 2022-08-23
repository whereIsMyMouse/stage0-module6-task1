package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal() {
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public String getDescription() {
        String hasFurString;
        String numberOfPawsString;
        hasFurString = hasFur ? "a" : "no";
        numberOfPawsString = numberOfPaws > 1 ? " paws" : " paw";
        return ("This animal is mostly " + color + ". It has " + numberOfPaws +
                numberOfPawsString + " and " + hasFurString + " fur.");

    }

}
