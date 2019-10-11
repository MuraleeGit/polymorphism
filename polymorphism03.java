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

class OverloadEx2{
	
	static void m(Integer i){
		System.out.println(i+ " intger");
	}
	static void m(String s){
		System.out.println(s+ " String");
	}
	static void m(Object o){
		System.out.println(o+"Object");
	}
}

class OverloadTest{
	
	public static void main(String...abc){
		//OverloadEx2.m((Integer)null);
		OverloadEx2.m((String)null);
	}
}