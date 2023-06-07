package Study;//계산기 만들기
import java.util.Scanner;
//입력값을 받는다-입력값을 모아둔 클래스를 만든다-그곳에 입력값을 저장한다-저장된 입력값을 꺼내 계산하는 메소드를 만든다.
//-

public class JavaDiorLog {
	static Scanner sc = new Scanner(System.in);
	static class Scan {
		static int num1 = sc.nextInt();
		static String str = sc.nextLine().replaceAll("\\s+","");
		static int num2 = sc.nextInt();
	}
		
		public static void Add() {
			if(Scan.str.equals("+")){
				int result = Scan.num1+Scan.num2;
				System.out.println(result);
		}
		}
		

	public static void main(String[] args) {
		Add();
	}
		
}