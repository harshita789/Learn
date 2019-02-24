package com.searching;

//import org.eclipse.jdt.internal.compiler.batch.Main;

class B{
	 int a=1;
	 void m1(){System.out.println("m1 method");}}
public class A extends B{
  public void m1(){
	  
	  int b=20;
	System.out.println("child class m1 method");
	System.out.println(b);
	b=30;
	System.out.println(b);
}
public static void main(String[] args) {
	final A a=new A();
	a.m1();
	System.out.println(a.a);
}
	
}

	
	
	
	
	
	
	
	