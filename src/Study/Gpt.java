package Study;
import java.util.Scanner;
public class Gpt {
	
	//좀 더 꼬아보기
	static Scanner sc = new Scanner(System.in);
	static class MyLife{
		static String[] getMyFriends() {
			String[] eleFriends = {"hobin", "dongwoo"};
			return eleFriends;
	}
	}
	public static void main(String[] args) {
		System.out.println("enter your name");
		String heName = sc.nextLine();
		heName = heName.replaceAll("\\s+", "");
		boolean isFriends = false;
		for (String friends : MyLife.getMyFriends()) {
			if(friends.equals(heName)) {
				isFriends = true;
				break;
			}
		}
		if(isFriends) {
			System.out.println("Hi blacknut");
		}
		else {
			System.out.println("ㅗ");
		}
		
	}

}
