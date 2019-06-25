package com.biz.exec;

import com.biz.exec.service.AddService;

public class Exec_02 {

	public static void main(String[] args) {

		AddService as = new AddService();
		
		for(int i = 0; i < 10 ; i++) {
			as.add();
		}
		//0 ~ 9까지 명령문(as.add();)을 10번 실행
		
		for(int i = 0; i < 10 ; i++) {
			as.add(3, i);
		}
		//0~9까지 명령문(as.add(3,i))를 실행하여
		//3+i (3+0,3+1,3+2,......3+9)를 실행
		//i 값이 0부터 1씩 증가되면서
		//add(num1, num2) 메서드에 보내서
		//num2에 담기게 된다
	
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += as.add(4, i);
			//sum = sum + as.add(4,i)와 같은것
			//sum에 값을 계속 누적
		}
		System.out.println("sum : " + sum );
		//4+0 ~ 4+9까지 덧셈을 하도록 
		//add( num1, num2) 메서드를 호출하고
		//return한 값을 sum 변수에 누적시키고
		//sum 변수 값을 콘솔에 보이기
	}
}
