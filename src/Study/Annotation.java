package Study;

import lombok.Data;

public class Annotation {

	public static void main(String[] args) {

	}

}
@Data
	class Parent{
		void parentMethod(){}
	}

	class Child extends Parent{
		@Override
	    void parentMethod(){} // 컴파일 에러! 잘못된 오버라이드 스펠링 틀림
}