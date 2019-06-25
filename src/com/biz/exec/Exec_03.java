package com.biz.exec;

import com.biz.exec.service.AddService;

public class Exec_03 {

	public static void main(String[] args) {

		AddService as = new AddService();
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				//i가 0일때 j는 0 ~ 9까지 반복하고
				//i가 1이 되면 다시 j는 0~9까지 반복한다
				//i가 2가 되면 다시 j는 0~9까지 반복한다
				
				as.add(i, j);
				//i가 0일떄 j는 0~9까지 반복
				//i가 1일떄 j는 다시 0~9까지 반복
				//i가 9일때까지 j는 i마다 0~9까지 반복
				
				//j는 총 100번 실행
				
				//i와 j는 for문 안에서만 사용가능
			}
		}
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum = sum + as.add(0, i+1);
			//num1에는 0이라는 숫자를 계속 담아두고
			//num2의 값은 1 ~ 10까지 보내면서
			//0+1,0+2,0+3....0+10 실행
			
			System.out.println("sum : " + sum);
		}
		
		sum = 0;
		for(int i = 0; i < 10; i++) {
			sum = sum + (i+1);
		}
		//위 for문과 같은 말 
		
	}

}
