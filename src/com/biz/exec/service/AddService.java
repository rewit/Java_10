package com.biz.exec.service;

public class AddService {
	
	//num1과 num2는 호출하는곳에서
	//전달한 2개의 값(정수값)을 받는 바구니역할
	public int add(int num1,int num2) {
		
		System.out.print("num1 : " + num1);
		System.out.println("\tnum2 : " + num2);
		
		return num1+num2;
		
		//리턴 타입이 있는 경우에는 호출한 쪽에서 = 을 중심으로 수신할수있는 변수 설정 가능
	}
	
	public void add() {
		//매개변수가 없고 리턴타입이 void형
		//리턴타입이 void = return문이 필요가 없다
		
	System.out.println("나는 아무것도 하지 않는다네");
	
	}

	public void add(int num1, int num2, int num3) {

		int sum = num1 + num2 + num3;
		System.out.println("sum :" + sum);
	}

}
