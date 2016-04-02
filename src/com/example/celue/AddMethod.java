package com.example.celue;

public class AddMethod implements Method{
	private int i;
	private int j;
	public AddMethod(int i ,int j){
		this.i = i;
		this.j = j;
	}
//实现方法二，定义一个加法
	@Override
	public int out() {
		// TODO Auto-generated method stub
		int num = i+j;
		return num;
	}

	

}
