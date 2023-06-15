package ArrayStudy;
public class ArrayChange {
//서로 다른 두 배열의 값을 교환하는 방법
	public static void main(String[] args) {
		int[] jyp = {1,2,3,4,5};//1번 배열
		int[] sm = {6,7,8,9,10};//2번 배열
		int[]tmp = new int[5];//중계인 배열
		
		for(int i=0; i<jyp.length; i++) {
			System.out.println(jyp[i]);//1번 배열의 값 정상 출력 되는지 확인
		}
		System.out.println("=======");
		for(int i=0; i<sm.length; i++) {
			System.out.println(sm[i]);//2번 배열의 값 정상 출력 되는지 확인
		}
		System.out.println("------");
		tmp = jyp;//1번 배열이 중계인 배열에게 값을 넘겨줌.
		jyp=sm;//2번 배열이 1번 배열에게 값을 넘겨줌
		sm=tmp;//중계인 배열이 2번 배열에게 1번 배열한테 받은 값을 넘겨줌
		for(int i = 0; i<jyp.length; i++) {
			System.out.println(jyp[i]);//정상적으로 바뀌었음
		}


	}

}
