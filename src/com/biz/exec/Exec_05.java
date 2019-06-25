package com.biz.exec;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Exec_05 {

	public static void main(String[] args) {

		Map<Integer,Integer> intMap = new TreeMap<Integer,Integer>();
		Random rnd = new Random();
		//몇번째인지가 아닌 값이 있는지 없는지만 찾고싶을때
		//Map을 쓰게될 경우 몇번째인지를 찾으려면 코드가 복잡해짐
		//Map을 쓸때 키값을 찾는 Map을 쓸 떄는 TreeMap이 가장 효율적이다.
		
		
		for(int i = 0; i < 50; i++) {
			int intR = rnd.nextInt(50)+1;
			intMap.put(intR, intR);
			//key값과 value값을 같게 만듬
		}
		
		int myInt = 23;
		
		Integer sInt = intMap.get(myInt);
		//키를 찾아서 있으면 숫자값 , 없으면 null을 넘겨줌
		//만약 23이 있다면 sInt는 23이 된다
		//int에 null이 올 수 없으나 Integer에서는 가능
		if(sInt == null) System.out.println("없음");
		else System.out.println("찾았음");
		
	}

}
