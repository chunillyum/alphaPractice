package doYouWantDrink2;

import java.util.Scanner;
import doYouWantDrink2.DrinkInfo;
/*문제점
 * 주문하시겠습니까? 에서 아니오를 선택하면 프로그램이 종료됨
 * 아니오 선택시 반복문 처음으로 다시 돌아갔으면 좋겠음.
 * 그리고 DrinkInfo 함수 하나에 너무 많은 로직을 넣은 것 같음
 * 저렇게 만들다 꼬이면 대참사다 아님?
 */
public class OtherDrink {
	static Scanner sc = new Scanner(System.in);

	public static String choice() {
		System.out.println("음료를 선택해주세요");
		String choiceDrink = sc.nextLine();
		return choiceDrink;
	}

	public static String DrinkInfo() {
		String userDrink = choice();
		while (true) {
			if (userDrink.equals("콜라")) {
				System.out.println(DrinkInfo.cokeInfo + "\n가격:" + DrinkInfo.coke + "원");
				break;
			} else if (userDrink.equals("사이다")) {
				System.out.println(DrinkInfo.sidarInfo + "\n가격:" + DrinkInfo.sidar + "원");
				break;
			} else if (userDrink.equals("환타")) {
				System.out.println(DrinkInfo.fantaInfo + "\n가격:" + DrinkInfo.fanta + "원");
				break;
			} else if (userDrink.equals("몬스터")) {
				System.out.println(DrinkInfo.monsterInfo + "\n가격:" + DrinkInfo.monster + "원");
				break;
			} else {
				System.out.println("그건 없습니다.");
			}
			continue;
		}
		//아래 코드들 메소드화 시켜서 분리하는 방법 괜찮은 것 같음.(while문 넣어서 잔액이 부족한 경우 다시 음료 선택 화면으로 돌아가도록.
		System.out.println("주문하시겠습니까? 예/아니오");
		String answer = sc.nextLine();
		if (answer.equals("예")) {
			System.out.println("현금을 투입구에 넣어주세요");
			int amount = sc.nextInt();

			int drinkPrice = 0;
			if (userDrink.equals("콜라")) {
				drinkPrice = DrinkInfo.coke;
			} else if (userDrink.equals("사이다")) {
				drinkPrice = DrinkInfo.sidar;
			} else if (userDrink.equals("환타")) {
				drinkPrice = DrinkInfo.fanta;
			} else if (userDrink.equals("몬스터")) {
				drinkPrice = DrinkInfo.monster;
			}
			if (amount == drinkPrice) {
				System.out.println("맛있게 드세요");
			} else if (amount < drinkPrice) {
				System.out.println("잔액이 부족합니다.");
			} else if (amount > drinkPrice) {
				System.out.println("잔돈은 " + (amount - drinkPrice) + "원 입니다.");
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		DrinkInfo();

	}

}
