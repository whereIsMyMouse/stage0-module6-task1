package com.epam.mjc.stage0;

public class Dog extends Animal{
    private final String color = "brown";
    private final int numberOfPaws = 4;
    private final boolean hasFur = true;

    public Dog() {
        super();
    }

    @Override
    public String getDescription() {

        return ("This animal is mostly brown. It has 4 paws and a fur.");
    }
}
