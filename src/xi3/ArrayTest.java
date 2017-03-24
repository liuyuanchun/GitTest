package xi3;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[]{10,5,7,9,9,0};
		System.out.print("[");
		for(int i = 0; i < arr.length; i++){
			if(i == arr.length - 1){
				System.out.print(arr[i]);
				break;
			}
			System.out.print(arr[i] + ",");
		}
		System.out.println("]");
		
	}
}
