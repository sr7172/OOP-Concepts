package edu.truman.cs.sr7172.inheritance;

public class Car
{
    public int speed;
    public double marketPrice;

    public Car(int speed, int marketPrice)
    {
        this.speed = speed;
        this.marketPrice= marketPrice;
    }

    public String toString()
    {
        return ("Price of the given car is  "+marketPrice
                +"\n"
                +"Speed of Car is "+speed);
    }
}
