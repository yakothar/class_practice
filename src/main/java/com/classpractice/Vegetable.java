package com.classpractice;

public class Vegetable 
{
    String name="Bottleguard";
    private int price;

    public Vegetable(String name1, int price1) 
    {
        this.name = name1;
        this.price = price1;
    }

    public void Buy() 
    {
        System.out.println("Buy at good price");
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
