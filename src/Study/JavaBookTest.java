package Study;

import java.util.Scanner;

public class JavaBookTest {
	//음료수 값을 모아놓은 클래스 
	public static class DrinkMoney	{
		static int coke = 1950;
		static int sidar = 1900;
		static int fanta = 1800;
		static int monster = 2300;
	
	//입력값 받아 음료수 가격을 리턴하는 메소드인데 아래 현금을 받고 가격이 맞는지 판별하는 메소드와 교류가 가능했으면 좋겠음.
		//클래스로 바꿔야 할까? 클래스로 바꾸면 return이 안 될 텐데.
		public static String drink() {
			Scanner sc=new Scanner(System.in);
			System.out.println("무슨 음료가 먹고싶노");
			String getmenu=sc.nextLine();
			if(getmenu.equals("콜라")) {
				getmenu ="콜라는 " + DrinkMoney.coke + "원 입니다.";
				return getmenu;
			}
				else if (getmenu.equals("사이다")){
				getmenu = "사이다는 " + DrinkMoney.sidar + "원 입니다.";
				return getmenu;
				}
				else if (getmenu.equals("환타")) {
					getmenu= "환타는 " + DrinkMoney.fanta + "원 입니다.";
					return getmenu;
				}
				else if (getmenu.equals("몬스터")){
					getmenu= "몬스터는 " + DrinkMoney.monster + "원 입니다.";
					return getmenu;
				}
			return getmenu;
			}
		public static int getMoney() {
			drink.getmenu = new getMenu;//일단 객체생성 안 먹힘. drink가 메소드라 그런 듯
			Scanner sc =  new Scanner(System.in);
			System.out.println("현금을 투입구에 넣어주세요.");
			int bills = sc.nextInt();
			if(bills==)
		}
		
		public static void main(String[] args) {
			System.out.println(drink());//이것도 drink를 클래스로 바꾸면 못 써먹잔슴
		}

	}
}