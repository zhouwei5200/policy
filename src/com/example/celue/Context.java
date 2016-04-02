package com.example.celue;

public class Context {
	private Method method;
	
	public Context(Method method){
		this.method = method;
	}
	public void out(){
		this.method.out();
	}

}
