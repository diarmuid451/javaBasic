package e_oop;

import c_statement.Baseball;

public class OOP {

	

	public static void main(String[] args) {
		/*
		 * << OOP(object Oriented Programming) : 객체지향 프로그래밍>>
		 * -프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * <<객체 생성(인스턴스화)>>
		 * - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것.
		 * - new 클래스명(); > 객체가 저장된 메모리 주소 반환.
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * - 객체는 생성될 때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재 할 수 있다.
		 */
			
		SampleClass sc = new SampleClass();
		
		sc.method1();
		
		sc.method2(5);
		
		String returnString = sc.method3();
		System.out.println(returnString);	
		
		int returnInt = sc.method4(7, 15);
		System.out.println();
		
		//test1() 호출시 출력되는 문장에 번호를 붙여주세요.
		sc.test1();
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		
		ClassMaker cm = new ClassMaker();
		//객체가 저장된 변수를 통해 메서드들을 호출해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 념겨주시고, 리턴타입이 있는 메서드는 리턴받은 값을 출력해주세요.
		
		cm.salted();
		
		int delicious = cm.caramel();
		System.out.println(delicious);
		
		
		cm.chocholate(520);
		
		int fat = cm.Sandwich(50, 13);
		System.out.println(fat);
		
		
		Calculator cl = new Calculator();
		
		int plus = (int)cl.plus(12, 154);
		System.out.println(plus);
		
		double minus = cl.minus(355.6, 21.2);
		System.out.println(minus);
		
		double multifly = cl.multifly(23, 11.5);
		System.out.println(multifly);
		
		double divide = cl.divide(15, 3);
		System.out.println(divide);
		
		int reminder =(int)cl.reminder(17, 3);
		System.out.println(reminder);
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		double result = cl.plus(123456, 654321);
		System.out.println(result);
		//2. 1번의 결과값 * 123456
		result = cl.multifly(result, 123456);
		System.out.println(result);
		//3. 2번의 결과값 / 123456
		result = cl.divide(result, 123456);
		System.out.println(result);
		//4. 3번의 결과값 - 654321
		result = cl.minus(result, 654321);
		System.out.println(result);
		//5. 4번의 결과값 % 123456
		result = cl.reminder(result, 123456);
		System.out.println(result);
		System.out.println((int)result);
	
	}
		
		
}
