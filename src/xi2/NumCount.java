package xi2;

import org.junit.Test;

public class NumCount {
	public static void main(String[] args) {
		int[] array = {0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0};
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		for(int i = 0; i < array.length; i++){
			switch(array[i]){
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			case 4:
				count4++;
				break;
			case 5:
				count5++;
				break;
			case 6:
				count6++;
				break;
			case 7:
				count7++;
				break;
			case 8:
				count8++;
				break;
			case 9:
				count9++;
				break;
				default:System.out.println("Default");
				break;
			}
		}
		System.out.println("0的个数为:" + count0);
		System.out.println("1的个数为:" + count1);
		System.out.println("2的个数为:" + count2);
		System.out.println("3的个数为:" + count3);
		System.out.println("4的个数为:" + count4);
		System.out.println("5的个数为:" + count5);
		System.out.println("6的个数为:" + count6);
		System.out.println("7的个数为:" + count7);
		System.out.println("8的个数为:" + count8);
		System.out.println("9的个数为:" + count9);
		
	}
	@Test
	public void test1(){
		int[] array = {0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0};
		int count[] = new int[10];
		for(int i = 0; i <count.length; i++){
			count[i] = 0;
		}
		for(int i = 0; i < array.length; i++){
			for(int  j = 0;j < array.length; j++){
				if(array[j] == i)
					count[i]++;
			}
		}
		for(int i = 0; i < count.length; i++){
			System.out.println(i + "的个数是：" + count[i]);
		}
	}
}
