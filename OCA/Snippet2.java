package clase;

import java.util.ArrayList;

public class Snippet2 {

	public static void main(String[] args) {
		ArrayList <Integer>list = new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		//System.out.println(list);
		for(int x : list) {
			System.out.println(x + ",");
			break;
		}
		

	}

}
