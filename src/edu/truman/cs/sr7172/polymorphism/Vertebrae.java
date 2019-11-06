package edu.truman.cs.sr7172.polymorphism;

public class Vertebrae {

    private double brainSize;

    public Vertebrae(double brainSize)
    {
        this.brainSize = brainSize; //in cubic centimeters
    }

    public String toString()
    {
        return "Brain size: " + this.brainSize;
    }
}
