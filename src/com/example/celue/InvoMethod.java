package com.example.celue;

public class InvoMethod implements Method {
	private int i;
	private int j;

	public InvoMethod(int i,int j) {

		this.i = i;
		this.j = j;
	}

	// 实现方法三，定义一个乘法法
	@Override
	public int out() {
		// TODO Auto-generated method stub
		int num = i * j;
		return num;
	}

}
