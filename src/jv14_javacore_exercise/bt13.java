package jv14_javacore_exercise;

import java.util.Scanner;

public class bt13 {
	public static void main(String[] args) {
		int size; 
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Nhập vào độ dài của mảng: ");
	    size= scanner.nextInt();
	         

	    int[] array = new int[size];
	         

	    for (int i = 0; i < size; i++) {
	        System.out.println("Nhập vào phần tử thứ " + i + ": ");
	        array[i] = scanner.nextInt();   // nhập giá trị cho phần tử
	    }
	       
	    // tinh trung binh
	    float abs = 0f;
	    int sum = 0;
	    for (int i = 0; i < size; i++) {
	        sum += array[i];
	        abs = (float)sum/size;
	    }
	    System.out.println("Gia tri trung binh cua day la "+ abs);
	    
	    // tinh min max
	    int min =array[0];
	    int max = array[0];
	    
	    for (int i = 1; i < size ; i ++) {
	    	if (min > array[i]) {
	    		min = array[i];
	    	}
	    	if (max < array[i]) {
	    		max = array[i];
	    	}
	    }
	    System.out.println("Gia tri min " +min);
	    System.out.println("Gia tri max " +max);
	    
	    // tim phan tu am lon nhat va nho nhat trong mang
	    int minAm =array[0];
	    int maxAm = array[0];

	    for (int i = 1; i < size ; i ++) {
	    	if (array[i] < 0) {
	    		if (minAm > array[i]) {
	    			minAm = array[i];
	    		}
	    		if (maxAm < array[i]) {
	    			maxAm = array[i];
	    		}
	    	}
	    }
	    if (minAm >=0 && maxAm >=0) {
	    	System.out.println("Khong co phan tu am nao");
	    } else if (minAm == maxAm){
	    	System.out.println("Co duy nhat 1 phan tu am" + minAm);
	    } else {
	    	System.out.println("Phan tu am nho nhat " + minAm);
	    	System.out.println("Phan tu am lon nhat " + maxAm);
	    }
	   
	    // tim phan tu duong lon nhat va nho nhat trong mang
	    
	    int minD =array[0];
	    int maxD = array[0];

	    for (int i = 1; i < size ; i ++) {
	    	if (array[i] > 0) {
	    		if (minD > array[i]) {
	    			minD = array[i];
	    		}
	    		if (maxD < array[i]) {
	    			maxD = array[i];
	    		}
	    	}
	    }
	    if (minD <=0 && maxD <=0) {
	    	System.out.println("Khong co phan tu duong nao");
	    } else if (minD == maxD){
	    	System.out.println("Co duy nhat 1 phan tu duong" + minD);
	    } else {
	    	System.out.println("Phan tu duong nho nhat " + minD);
	    	System.out.println("Phan tu duong lon nhat " + maxD);
	    }
	    
	    // in cac phan tu chan le
	    
	    System.out.println("In cac phan tu chan");
	    for (int i = 0; i < size; i ++) {
	    	if (array[i]%2 ==0) {
	    		System.out.print(array[i]+" ,");
	    	}
	    }
	    System.out.println("");
	    System.out.println("In cac phan tu le");
	    for (int i = 0; i < size; i ++) {
	    	if (array[i]%2 !=0) {
	    		System.out.print(array[i]+" ,");
	    	}
	    }
	    
	    
	    for (int i = 0; i < size; i++) {
	        System.out.println("Phần tử thứ " + i + ": " + array[i]);
	    }
	}
}
