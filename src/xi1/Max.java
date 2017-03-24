package xi1;

import java.util.Scanner;

public class Max {
	//返回最大的数
	public static int getMax(int num1, int num2){
		int max;
		if(num1 > num2){
			max = num1;
		}else{
			max = num2;
		}
		return max;
	}
	//判断是否相等
	public static boolean equals(int num1,int num2){
		
		if(num1 == num2){
			return true;
		}else{
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个数:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int max = getMax(num1,num2);
		System.out.println("最大的数为:" + max);
		System.out.println("请再次输入两个数:");
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		boolean f = equals(num3,num4);
		if(f == true){
			System.out.println("两个数相等");
		}else{
			System.out.println("两个数不相等");
		}
	}
}
