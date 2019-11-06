package edu.truman.cs.sr7172.polymorphism;

public class Lizard extends Reptile {
    private double bodySize;
    private String habitat;

    public Lizard(double brainSize, double eggSize, double bodySize, String habitat) {
        super(brainSize, eggSize);
        this.bodySize = bodySize;
        this.habitat = habitat;
    }

    public String toString()
    {
        return super.toString()+ "\nBodysize: " + this.bodySize + "\nHabitat: " + this.habitat;
    }


    public static void main(String[] args) {
        Lizard l = new Lizard(2.5, 4.5, 8.5, "Tropical");
        System.out.println("Lizard's characteristics are given below:");
        System.out.println(l);
    }

}
