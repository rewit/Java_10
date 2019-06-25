package com.biz.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exec_04 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		//리스트 생성
		Random rnd = new Random();
		//랜덤변수
		for(int i = 0 ; i < 50 ; i++) {
			intList.add(rnd.nextInt(50)+1);
			//rnd객체에 있는 nextint의 1~50의 랜덤한 숫자호출
			//그 값을 바로 List에 추가 (50번 반복) (List 50개 생성)
			
		}
		
		int size = intList.size();
		
		for(int i = 0; i < size; i++) {
			System.out.print(intList.get(i));
			//intList에 있는 1~50의 값을 콘솔에 보여줘라
			if((i+1)%5 == 0) System.out.println();
			//i+1을 5로 나누어 0이 되면 줄바꿈을 하고
			else System.out.print("\t");
			//그렇지 않다면 탭(띄어쓰기)을 하여 보여라
		}
		
		int myInt = 33;
		//intList로 부터 최초로 33값을 찾아서
		//몇번째에 있는지 표시하고
		//없으면 없다고 표시
		size = intList.size();
		int index = 0; //변수 생성
		//index와 사이즈를 비교하기 위해
		for(index = 0; index < size; index++) {
			if(intList.get(index) == myInt) break;
			//intList의 index번째 값이 myInt값과 같다면 브레이크
		}
		
		if(index >= size ) System.out.println("없음");
		//만약 없어서 for문이 다 실행됬다면 index는 size보다 항상 크다
		//만약 없다면 "없음"을 표시
		else System.out.println(index + "번째에서 찾음");
		//그게 아니라면 index번째의 위치주소를 보여준다
		//위의 if문에 break를 만나서 최초의 myInt의 위치만 표시
		
	}

}
