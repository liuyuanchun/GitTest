package xi1;

import java.util.Scanner;

import org.junit.Test;

public class Mounth {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("请输入月份:");
		int m = scanner.nextInt();
		if(m < 1||m >12){
			System.out.println("输入的月份不符合规定");
			return;
		}
		if((m == 3)||(m == 4)||(m == 5)){
			System.out.println("此月份属于春季");
		}else if((m == 6)||(m == 7)||(m == 8)){
			System.out.println("此月份属于夏季");
		}else if((m == 9)||(m == 10)||(m == 11)){
			System.out.println("此月份属于秋季");
		}else {
			System.out.println("此月份属于冬季");
		}
	}
	@Test
	public void test1(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份:");
		int m = scanner.nextInt();
		if(m < 1||m > 12){
			System.out.println("输入的月份不符合规定");
			return;
		}
		switch(m){
		case 3:
		case 4:
		case 5:
			System.out.println("此月份是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("此月份是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("此月份是秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("此月份是冬季");
			break;
			default:System.out.println("Default");
			break;
		}
	}
}
