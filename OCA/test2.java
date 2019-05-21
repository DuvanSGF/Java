package clase;

public class test2 {

	public static void main(String[] args) {
		
		String[][] arr = {{"1","2","3"}, {"4","5"}, {"6","7"}};
		
		for(int i = 0; i < arr[i].length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
			System.out.println(arr[i][j] + " ");
			if(arr[i][j].equals("2")) {
				break;
			}
		}
			}
		}
	}
