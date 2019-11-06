package edu.truman.cs.sr7172.polymorphism;

public class Reptile extends Vertebrae {

    private double eggSize;

    public Reptile(double brainSize, double eggSize) {
        super(brainSize);
        this.eggSize = eggSize;

    }

    public String toString()
    {
        return super.toString() + "\nEgg size: " + this.eggSize;
    }

    public static void main(String[] args)
    {
        Reptile r = new Reptile(.7,2.5);
        System.out.println("Reptile's characteristics are given below:");
        System.out.println(r);
    }
}
