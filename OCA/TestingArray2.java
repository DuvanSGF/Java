package clase;

public class TestingArray2 {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2 = new int[3];
		int[] arr3 = {'a'};
		int[] arr4 = {'b'};
		int[] arr5 = {'c'};
		int[] arr6 = {'d'};
		int[] arr7 = {'@'};
		int[] arr8 = {'a','b','c','d','@'};
		arr1=arr2;
		arr1=arr8;
		System.out.println(arr3);
		System.out.println(arr4);
		System.out.println(arr5);
		System.out.println(arr6);
		System.out.println(arr7);
		System.out.println(arr1[0]+":"+ arr1[1]+":"+arr1[2]+":"+ arr1[3]+":"+ arr1[4]);

	}

}
