package Lab8;

import java.util.Scanner;

public class bai1 {
	static Scanner sc = new Scanner(System.in);
	// cho dãy N, viết lại dãy ngược của N

	public static void main(String[] args) {
		int[] arr = inPutArray();
		//outPutArray2(arr);
		//cách kháccccccccccc
		int i = 0;
		int j = arr.length-1;
		while(i<j){
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int k = 0;k<arr.length;k++)
			System.out.print(arr[k]+" ");
	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// Cách 1 hàm gán giá trị ngược lại cho dãy 
	public static int[] dayNguoc(int[] a) {
		int[] arr2 = new int[a.length];
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			arr2[j] = a[i];
			j++;
		}
		return arr2;
	}

	// hàm xuất dữ liệu của array
	public static void outPutArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
	
	//cách 2: đổi 2 gtri đầu và cuối cho nhau
	public static void outPutArray2(int[] a) {
		for (int i = a.length-1; i >=0; i--)
			System.out.print(a[i] + " ");
	}
	
}
