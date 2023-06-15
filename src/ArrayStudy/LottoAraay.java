package ArrayStudy;

import java.util.Random;
import java.util.Scanner;

public class LottoAraay {
	/*
	 * 로또 과제 1등 번호6개, 2등 번호5개+보너스, 3등 5개 4등 4개 5등3개 그 외 꽝
	 */
	public static void main(String[] args) {
		int[] lotto = new int[6];// 로또 숫자를 받을 배열 생성
		int[] userNum = new int[6];
		int same = 0;
		Random ran = new Random();// 랜덤 메소드 이용
		int bonus = ran.nextInt(45) + 1;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ran.nextInt(45) + 1;// 로또 배열 안에 랜덤 메소드를 이용해 생성한 난수를 삽입. 0~44까지의 45가지 수이기 때문에
			// 끝에 +1을 하여 1~45까지로 변경
			for (int j = 0; j < i; j++) {// 중복 번호 제거
				if (lotto[i] == lotto[j]) {// 로또 배열의 i(인덱스값의 숫자)를 j라는 변수가 for문을 돌면서 검사함.
					// 같다면 반복문의 처음으로 되돌아감.
					i--;
					break;
				}
			}
			for (int k = 0; k < lotto.length; k++) {// 보너스 번호와 lotto 난수의 중복을 제거하는 for문
				if (lotto[i] == bonus) {
					i--;
					break;
				}
			}
		}
		for (int lottoNum : lotto) {// 그냥 출력하면 숫자가 중복될 경우 2 번씩 출력되기 때문에 for each에 담아 출력.
			System.out.print(lottoNum + "번 ");
		}
		System.out.println();
		System.out.println("보너스 번호는 " + bonus);
		Scanner sc = new Scanner(System.in);
		System.out.println("고객님의 번호를 입력해주세요");// 유저의 정보를 입력받는 for문
		for (int i = 0; i < userNum.length; i++) {
			userNum[i] = sc.nextInt();// 유저 정보를 userNum배열에 저장
			for (int j = 0; j < i; j++) {// 중복 제거
				if (userNum[i] == userNum[j]) {
					System.out.println("중복된 숫자를 입력하셨습니다");
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {//로또 배열과 유저의 번호 배열을 비교해 같은 값이 있을 수록 same 변수의 값 증가
			for (int j = 0; j < userNum.length; j++) {
				if (lotto[i] == userNum[j] && i != j) {
					same++;
				}
			}
		}
		boolean hasBonus = false;//보너스 번호 확인 유무
		for (int i = 0; i < userNum.length; i++) {
			if (userNum[i] == bonus) {
				hasBonus = true;
				break;
			}
		}

		if (same == 6) {
			System.out.println("축하합니다! 1등입니다.");
		} else if (same == 5 && hasBonus) {
			System.out.println("축하합니다! 2등입니다.");
		} else if (same == 5) {
			System.out.println("축하합니다! 3등입니다.");
		} else if (same == 4) {
			System.out.println("축하합니다! 4등입니다.");
		} else if (same == 3) {
			System.out.println("축하합니다! 5등입니다.");
		} else {
			System.out.println("아쉽지만 꽝입니다.");
		}
	}
}
