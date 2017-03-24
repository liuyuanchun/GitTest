package xi1;

public class Count {
	public static void main(String[] args) {
		int num =0;
		for(int i = 1; i <=100; i++){
			if(i % 7 == 0){
				System.out.print(i + " ");
				num++;
			}
		}
		System.out.println();
		System.out.println("7的倍数的总个数是:" + num);
	}
}
