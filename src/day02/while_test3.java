package day02;

import java.util.Scanner;

public class while_test3 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int num =0 , sum =0;
	while(true) {
		System.out.println("10~20부터 수 입력");
		num =sc.nextInt();
		if(num>=10 && num<=20) {
			break;	
		}
		System.out.println("다시");
	}
	System.out.println("num:"+num);
	
	while(true) {
		System.out.println("10~20부터 수 입력");
		num =sc.nextInt();
		if(num>=10 && num<=20) {
			break;	
		}
		System.out.println("다시");
	}
	System.out.println("num:"+num);


}
}
