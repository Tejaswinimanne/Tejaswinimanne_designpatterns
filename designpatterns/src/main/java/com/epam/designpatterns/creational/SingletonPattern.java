package com.epam.designpatterns.creational;

class Singleton{
	private static Singleton inst=null;
	public String s;
	private Singleton(){
		s="Constructor of singleton class";
	}
	public static Singleton Singleton() {
		if(inst==null)
			inst=new Singleton();
		return inst;
	}
}
public class SingletonPattern 
{
    public static void main( String[] args )
    {
        Singleton x = Singleton.Singleton(); 
        Singleton y = Singleton.Singleton(); 
        x.s = (x.s).toUpperCase(); 
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        y.s = (y.s).toLowerCase();
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
    }
}