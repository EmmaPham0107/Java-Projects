package com.basic.bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainScreen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Nhap vao mot so nguyen lon hon 0" + "\r\nN = ");
		int N = input.nextInt();
		
		while (N<=0) {
				System.out.print("Gia tri khong hop le. Vui long nhap lai!" + "\r\nN = ");
				N = input.nextInt();
		}
		
		int tongChan = 0;
		int tongLe = 0;		
		for (int i=0; i<N; i++) {
			if (i%2==0) {
				tongChan = tongChan + i;
			} else {
				tongLe = tongLe + i;
			}
		}
		System.out.println("Tinh tong cac so chan tu 0 den N = " + tongChan);
		System.out.println("Tinh tong cac so le tu 0 den N = " + tongLe);
		
		int count = 0;
		for (int i=0; i<N; i++) {
			if (i%3==0 && i%2!=0) {
				count++;
			}
		}
		System.out.print("Tu 0 den N co " + count + " so chia hết cho 3 nhưng không chia hết cho 2");

	}
}
