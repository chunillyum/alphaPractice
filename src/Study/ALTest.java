package Study;
import java.util.ArrayList;
public class ALTest {
//ArrayList는 배열의 크기를 정하지 않고 선언할 수 있는 컬렉션 프레임워크의 한 종류.
	public static void main(String[] args) {
		ArrayList<String> hi = new ArrayList<String>();//ArrayList<타입> 변수명 = new ArrayList<타입>()로 정의
		//즉 ArrayList<타입>의 클래스를 현재 클래스의 메소드에 담는다
		hi.add("one");//배열 인덱스를 추가할 땐 변수명.add 예약어를 사용
		hi.add("two");
		hi.add("three");
			System.out.println(hi.get(1));//사용할 땐 변수명.get 예약어를 사용
		
	}

}
