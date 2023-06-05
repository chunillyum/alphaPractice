package Study;

public class DimensionalArray {//2차원 배열

	public static void main(String[] args) {
		int [][] arrayData = {
				{10, 20, 30},{40, 50, 60}
		};//2차원 배열 선언. 기존 1차원 배열처럼 선언하나 두 배열을 구분하기 위해 배열과 배열 사이 , 를 찍어줌 
		for(int i=0; i<arrayData.length; i++) {
			for(int j=0; j<arrayData[i].length; j++) {
				System.out.println(arrayData[i][j]);
			}//i는 배열의 행에 접근. j는 i가 접근한 행의 열을 뽑아 출력하는 역할을 함.
			//고로 i는 0번째와 1번째 행에만 접근하였고 2번만 실행 되었음. j는 i가 접근한 0번째 행의 10,20,30을 출력한 후
			//i가 접근한 1번째 행의 40,50,60을 출력함......;;
		}
	}

}
