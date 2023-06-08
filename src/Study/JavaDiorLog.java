package Study;//계산기 만들기
import java.util.Scanner;
//입력값을 받는다-입력값을 모아둔 클래스를 만든다-그곳에 입력값을 저장한다-저장된 입력값을 꺼내 계산하는 메소드를 만든다.
//-

public class JavaDiorLog {
	static Scanner sc = new Scanner(System.in);
	 static String input = sc.next();
	    static String[] tokens = input.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

	    public static void main(String[] args) {
	        int num1 = Integer.parseInt(tokens[0]);
	        String str = tokens[1];
	        int num2 = Integer.parseInt(tokens[2]);
	        int result = 0;
	        switch(str) {
	        case "+" :
	        	result = num1 + num2;
	        	break;
	        case "-" :
	        	result = num1 - num2;
	        	break;
	        case "*" :
	        	result = num1 * num2;
	        	break;
	        case "/" :
	        	result = num1 / num2;
	        	break;
	        }
	        System.out.println(result);
	        }
}
