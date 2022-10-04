package org.array;

public class Array {
public static void main(String[] args) {	
	int b[][] = new int [2][2];
	b[0][0]=2;b[1][1]=5;b[0][1]=7;b[1][0]=3;
		for (int j = 0; j < b.length; j++) {
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[j][i]);
			}
		for (int[] is : b) {
			for (int i : is) {
				System.out.println(i);
			}
			
		}
	
		
	}
}
}

