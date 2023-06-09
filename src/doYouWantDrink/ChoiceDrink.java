package doYouWantDrink;

import java.util.Scanner;

import doYouWantDrink.DrinkPrice;
import doYouWantDrink.DrinkInfomation;


public class ChoiceDrink {
	
    public static void drink() {
        Scanner sc = new Scanner(System.in);
        System.out.println("음료를 선택해주세요.");
        String getmenu = sc.nextLine();
        while (true) {
            System.out.println("음료를 선택해주세요.");
            if (getmenu.equals("콜라")) {
                System.out.println(DrinkInfomation.cokeInfo + "\n가격: " + DrinkPrice.coke + "원");
            } else if (getmenu.equals("사이다")) {
                System.out.println(DrinkInfomation.sidarInfo + "\n가격: " + DrinkPrice.sidar + "원");
            } else if (getmenu.equals("환타")) {
                System.out.println(DrinkInfomation.fantaInfo + "\n가격: " + DrinkPrice.fanta + "원");
            } else if (getmenu.equals("몬스터")) {
                System.out.println(DrinkInfomation.monsterInfo + "\n가격: " + DrinkPrice.monster + "원");
            } else {
                System.out.println("잘못된 음료입니다. 다시 선택해주세요.");
                continue;  // 다시 반복문의 처음으로 돌아감
            }

            System.out.println("주문하시겠습니까? (예/아니오)");
            String answer = sc.nextLine();
            
            if (answer.equals("아니오")) {
            }
            else if (answer.equals("예")) {
            } break;
        }
        System.out.println("현금을 투입구에 넣어주세요.");
        int bills = sc.nextInt();
        if(bills==(getmenu)) {
        	System.out.println("맛있게 드세요");
        }
        else if(bills<DrinkPrice.monster) {
        	System.out.println("금액이 부족합니다.");
        }
        else if(bills>DrinkPrice.monster) {
        	System.out.println("잔돈 " + (bills - DrinkPrice.monster) + "원을 받으세요");
        }
        sc.close();
    }

	public static void main(String[] args) {
        drink();
    }
}

