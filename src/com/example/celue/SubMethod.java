package com.example.celue;

public class SubMethod implements Method {
	private int i;
	private int j;
	public SubMethod(int i ,int j){
		this.i = i;
		this.j = j;
	}
//ʵ�ַ�����������һ������
	@Override
	public int out() {
		// TODO Auto-generated method stub
		int num = i-j;
		return num;
	}

	

}