//Polymorphism- child will apporach mother first, if mother is not there then father, then randmother like that.
//Overloading - happends in two places- either in the same class or in the child class.
//During overloading we have to consider onlly to things-method name and signature.
//If it overriding - we have to consider access modifier.return type, method name, signature, exception.
//interview question - 
//Overloading applieds to static and non static methods and constructors.
//Overriding applies to non- static methods.
//Overloading always leading to compile time polymorphism.
package com.k2js.polymorphism.practice;

import java.util.Arrays;

class OverloadEx1{
	
	static void m(int i){
		System.out.println(i*i + "primitive");
	}
	
	static void m(Object o){
		System.out.println(o + "Object");
	}
	static void m(Number n){
		System.out.println(n+"number");
	}
	static void m(Integer i){
		System.out.println(i+"Integer");
	}
	static void m(Object...i){
		System.out.println(Arrays.toString(i)+ "is an Array");
	}	
	static void m(Number...n){
		System.out.println(Arrays.deepToString(n)+"I am in Number");
	}
	static void m(Integer...m){
		System.out.println(Arrays.asList(m)+ "is Integer");
	}
	static void m(Integer i, Integer j){
		System.out.println("I am 2 integer"+Arrays.asList(i,j));
	}
}

class OverloadTest{
	public static void main(String...abc){
		int a=10;
		OverloadEx1.m(a);
		Integer b=20;
		OverloadEx1.m(b);
		OverloadEx1.m(b,a);
	}
}