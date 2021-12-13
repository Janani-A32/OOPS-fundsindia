package com;

abstract class Abstract {
    public abstract void message();

}
class Parent extends Abstract{
    public void message(){
        System.out.println("This is first class");
    }
}
class Child extends Abstract{
    public void message(){
        System.out.println("This is second class");
    }
}
