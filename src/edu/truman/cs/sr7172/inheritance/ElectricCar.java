package edu.truman.cs.sr7172.inheritance;

public class ElectricCar extends Car
{
    public String carName;
    public int modelNumber;

    public ElectricCar(int speed, int marketPrice, String carName, int modelNumber)
    {
        super(marketPrice,speed);
        this.carName = carName;
        this.modelNumber = modelNumber;
    }

    @Override
    public String toString()
    {
        return (super.toString()
                +"\n Car name is "+carName
                +"\n Model number of this car is "+modelNumber);

    }
}
