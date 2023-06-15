package ArrayStudy;


public class ArrayAdd {

	public static void main(String[] args) {
		int[]kakao = {1,2,3,4};//1번째 배열
		int[]toss = {5,6,7,8};//2번째 배열
		int[]naver = new int[8];//1번 배열과 2번 배열을 합쳐서 담을 왕배열
		
		for(int i = 0; i<kakao.length; i++) {
			naver[i] = kakao[i];//왕배열에 1번배열의 값을 담음
			System.out.println(naver[i]);
		}
		System.out.println("====");
		for(int i = 0; i<4; i++) {
			naver[i+4] = toss[i];//왕배열의 1번배열 이후 값부터 2번배열의 값을 담음
			System.out.println(naver[i+4]);
		}
		System.out.println("=====");
		for(int i=0; i<naver.length; i++) {
			System.out.println(naver[i]);//출력
		}

	}

}