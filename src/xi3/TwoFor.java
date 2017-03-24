package xi3;

import java.util.Scanner;

import org.junit.Test;

public class TwoFor {
	@Test
	/**
	 * 打印出一个矩形
	 */
	public void test(){
	
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 6; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	@Test
	public void triangle(){ //打印三角形
		for(int i = 0; i < 5;i++){
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

 /**
  * 1
  *	12
  *	123
  *	1234
  * 12345
  */
	@Test
	public void test1(){
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++){
			arr[i] = i + 1;
		}
		for(int i = 0; i < 5; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
	@Test
	/**
	 * 打印九九乘法表
	 */
	public void test2(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数字:");
		int num = scanner.nextInt();
		if(num < 1){
			System.out.println("输入的数字无效！");
		}
		table(num);
	}
	public void table(int num){
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j +"*" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
	@Test
	/**
	 * 倒直角三角
	 */
	public void test3(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三角形的高度:");
		int num = scanner.nextInt();
		for(int i = 0; i <= num; i++){
			for(int j = num - i; j >= 0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/**
	 * 打印出等腰三角形
	 */
	@Test
	public void test4(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入等腰三角形的高度:");
		int num = scanner.nextInt();
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= num - i; j++){
				System.out.print(" ");
			}
			for(int k = 1;k <= 2 * i - 1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	@Test
	/**
	 * 打印倒等腰三角形
	 */
	public void test5(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入倒等腰三角形的高度:");
		int num = scanner.nextInt();
		for(int i = 1; i <= num; i++){
			for(int j = 1;j < i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k <= 2 * (num + 1 - i)-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("打印完毕");
	}
}
