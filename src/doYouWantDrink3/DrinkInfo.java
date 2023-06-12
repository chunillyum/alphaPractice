package doYouWantDrink3;

public class DrinkInfo {
	//메게변수
	private String cokeInfo;
	private String sidarInfo; 
	private String fantaInfo; 
	private String monsterInfo;
	private int coke = 1950;
	private int sidar = 1900;
	private int fanta = 1800;
	private int monster = 2300;
	
	//생성자
	public DrinkInfo(String coke, String sidar, String fanta, String monster) {
		cokeInfo = coke;
		sidarInfo = sidar;
		fantaInfo = fanta;
		monsterInfo = monster;
	}
	
	public void drinkInfo() {
		"코카콜라: 칼로리 130kcal, 당류 46g, 용량 250ml";
		"칠성사이다: 칼로리 83cal, 당류 21g, 용량 250ml";
		 "환타 오렌지: 칼로리 163kcal, 당류 51g, 용량 250ml";
		 "몬스터 에너지 울트라: 칼로리 0kcal, 당류 1g, 용량 355ml";
	}
}
