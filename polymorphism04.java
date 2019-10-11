
package com.k2js.polymorphism.practice;

import java.util.Arrays;

class A{
	int i;
	private A() throws Exception{
		
	}
	A(int i) throws Exception{
		this();
	}
}
class B extends A{
	
}