package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * <<배열>>
		 * -int[] number = new int[5]; //기본값으로 초기화된다.
		 * -int[] number = new int[]{10, 20, 30, 40, 50};
		 * -intp[ number = {10 ,20 ,30 ,40, 50};
		 */
		
		//배열은 참조형 타입입니다.
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//배열 초기화시 기본값이 저장된다.
		
		System.out.println(array);
		
		System.out.println(array[0]); //실제 값에 접근하기 위해서는 index를 지정해줘야 한다.
		//index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		
		String arraystr = Arrays.toString(array);
		//배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arraystr);
		
		int[] iArray1 = new int[]{1, 2, 3};
		//값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1, 2, 3}; //선언과 초기화를 동시에 해야한다.
//		int[] iArray3;
//		iArray3 = {1 ,2 ,3}; //컴파일 에러 발생
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50; //마지막 인텍스는 '배열의 길이 -1'이다
		
		//정수를 저장 할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		int[] array2 = new int[10];
		
		//모든 인덱스에 있는 값을 변경해주세요.
		array2[0] = 10;
		array2[1] = 11;
		array2[2] = 12;
		array2[3] = 13;
		array2[4] = 14;
		array2[5] = 15;
		array2[6] = 16;
		array2[7] = 17;
		array2[8] = 18;
		array2[9] = 19;
		
		//모든 인덱스에 있는 값의 합계를 출력해주세요.
		int sum = 0;
		sum += array2[0];
		sum += array2[1];
		sum += array2[2];
		sum += array2[3];
		sum += array2[4];
		sum += array2[5];
		sum += array2[6];
		sum += array2[7];
		sum += array2[8];
		sum += array2[9];
		System.out.println(sum);
		
		//index는 1씩 증가하는 규칙이 있어 for문과 함께 사용하기 좋다.
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
	}

}
