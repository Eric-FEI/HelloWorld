package com.eric.test;

public class HelloWorld {
    public static void main(String[] args)
    {
        PetDog dog = new PetDog();
        dog.service();
    }
}


class Animal
{
    public void say()
    {
        System.out.println("Animal.say");
    }
}

class Dog extends Animal
{
    public void service()
    {
        say();
    }

    public void say()
    {
        System.out.println("Dog.say");
    }
}

class PetDog extends Dog
{

    public void say()
    {
        System.out.println("PetDog.say");
    }
}


