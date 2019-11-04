package edu.truman.cs.sr7172.inheritance;

public class TestCar

{
    public static void main(String args[])
    {
        ElectricCar ec = new ElectricCar(140, 35000, "Tesla", 3);
        System.out.println(ec.toString());
    }
}
