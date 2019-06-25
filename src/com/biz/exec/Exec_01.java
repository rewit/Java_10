package com.biz.exec;

import com.biz.exec.service.AddService;

public class Exec_01 {

	public static void main(String[] args) {
//add를 객체로 선언
//콘솔에 표기하는 일만 하고 있음
		//AddService에 선언된
		//add(int num1,int num2)메서드를 사용하기 위한 준비작업
		AddService as = new AddService();
		
		as.add(30, 40);
		as.add(100,200);
		
		int sum = as.add(200, 300);
		//200과 300을 주면 덧셈을 해서 다시 받아서 sum에 저장 (AddService return)
		System.out.println("sum : " + sum);
		
		System.out.println("num1+num2 : "+ as.add(1000, 2000));
		//sum이 아닌 java만 알고있는 장소에 저장하고 보여줌 
		
		as.add();
		
//		as.add(100, 200, 300);
		//만든 add 매서드는 매개변수가 2개 혹은 없는 변수
		//create mathod add
		
//		sum = as.add(100, 200, 300);
//		add(num1,num2,num3) method는 type void 형이기 때문에
//		변수에 값을 대입하는 문장을 사용할수 없다
		
		
	}

}
