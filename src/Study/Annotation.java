package Study;

import lombok.Data;
import lombok.Getter;
public class Annotation {

	public static void main(String[] args) {

	}

}
@Getter
class SayHello{
	String msg;
}
@Data
	class Parent{
		void parentMethod(){}
	}

	class Child extends Parent{
		@Override
	    void parentMethod(){} // 컴파일 에러! 잘못된 오버라이드 스펠링 틀림
}