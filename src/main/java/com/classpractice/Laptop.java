package com.classpractice;

public class Laptop 
{
    String name="Lenovo";
    private int price;

    public Laptop(String name1, int price1) 
    {
        this.name = name1;
        this.price = price1;
    }

    public void calc() 
    {
        System.out.println("Some math function calculate");
    }

    public String getName() 
    {
        return name;
    }

    public int getPrice() 
    {
        return price;
    }
}    