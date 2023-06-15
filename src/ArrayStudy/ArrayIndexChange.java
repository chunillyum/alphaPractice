package ArrayStudy;

public class ArrayIndexChange {
	//하나의 배열 속 인덱스 값 교환
		public static void main(String[] args) {
			int[] kakao = {1,3,2,4,5};//1번째 인덱스값과 2번째 인덱스값을 바꿔야 하는 목표 배열
			for(int i = 0; i<kakao.length; i++) {
				System.out.println(kakao[i]);//출력 확인
			}
			System.out.println("====");
			int tmp;//중계인 변수 생성
			tmp=kakao[1];//1번째 인덱스값을 중계인 변수에게 넘겨줌
			System.out.println(tmp);//중계인 변수가 인덱스값을 잘 받았는지 확인
			kakao[1]=kakao[2];//2번째 인덱스값을 1번째 인덱스에게 넘겨줌
			kakao[2] = tmp;//2번째 인덱스는 중계인 변수에게 값을 받음
			System.out.println("=====");
			for(int i=0; i<kakao.length; i++) {
				System.out.println(kakao[i]);//정상 출력 확인
			}
		}

	}
