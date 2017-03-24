package xi2;

public class ArraySearch {
	//计算数组元素之和
	public static int getSum(int[] array){
		int sum = 0;
		for(int i = 0;i <array.length; i++){
			sum += array[i];
		}
		return sum;
	} 
	//求数组最大值
	public static int getMax(int[] array){
		int max = array[0];
		for(int i = 1;i <array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}
		return max;
	} 
	//求数组最小值
	public static int getMin(int[] array){
		int min = array[0];
		for(int i = 1;i <array.length; i++){
			if(array[i] < min){
				min = array[i];
			}
		}
		return min;
	} 
	//输出数组
	public static void outPut(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "  ");
		}
	}
	//计算数组中奇数和偶数的个数
	public static void searchCount(int[] array){
		int evencount = 0;
		int oddcount = 0;
		for(int i = 0; i <array.length; i++){
			if(array[i] % 2 == 0){
				evencount++;
			}else{
				oddcount++;
			}
		}
		System.out.println("偶数个数是:" + evencount);
		System.out.println("奇数个数是:" + oddcount);
	}
	public static void main(String[] args) {
		int[] array = {3,4,5,7,8,6,9,1,2,4};
		int sum = getSum(array);
		System.out.println("数组元素之和是:" + sum);
		int max = getMax(array);
		System.out.println("数组中的最大值是:" + max);
		int min = getMin(array);
		System.out.println("数组中的最小值是:" + min);
		searchCount(array);
		outPut(array);
		System.out.println();
		
	}
}
