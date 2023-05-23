package day02;

import java.util.Scanner;

public class while_test4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("돈을 설정해주세요");
		int money = input.nextInt();//money 입금

		System.out.println("지갑 금액: "+money);
		int num/*menu 선택*/ ,num2=0/*;hot ice 설정*/  ,num3=0/*금액 선택*/, num4=0/*개수 선택*/;
		 double total=0;//할인
		double T;
		while(true) {
			 int price =0;
			 
		System.out.println("1.아메키라노 2000");
		System.out.println("2.커피라떼 3500");
		System.out.println("3.딸기 스무디 4000");
		System.out.println("4.청포도 에이드 3800");
		num = input.nextInt();
			switch(num) {
			
			case 1:
					System.out.println("1.Hot 2.Ice 골라주세요");
					
					num2 =input.nextInt();
					System.out.println("개수를 정해주세요");
					num3 =input.nextInt();
					
				
					
					if(num2 == 1) {
						System.out.println("따듯한 아메리카노 나왔습니다");
					
						System.out.println("금액을 눌러주세요");
						num4 =input.nextInt();
						
						if(num4>=5) {
							total= (num3 * num4) / 10;
							 T=((num3 * num4)-total);
							 
							money -= T;
							System.out.printf("할인한 가격된 금액:  %.2f원\n",total);
							System.out.printf("총 가격 :%.2f\n",T);
							System.out.println(money+"원 나머지 돈입니다\t");
							System.out.println("=================");
						}
						else {
							num3 *= num4;
							  price=num3;
							money -= price;
							System.out.println("할인이 안된 가격 금액"+price);
							System.out.println(money+"나머지 돈입니다\t");
							System.out.println("=================");
						}
					
					
					}
					
					else if(num2 ==2) {
						
						System.out.println("금액을 눌러주세요");
						num4 =input.nextInt();
						if(num3>=5) {
							total= (num3 * num4) / 10;
							 T=((num3 * num4)-total);
							money -= T;
							System.out.println("할인된 금액:"+total);
							System.out.println("총 가격:"+T);
							System.out.println(money+"원 잔돈 입니다");
						}
						else {
							total = num3 * num4;
							money -= total;
							System.out.println("정상가 :"+total);
							System.out.println(money+"원 잔돈 입니다");
						}
					}
					else {
				System.out.println("다시 골라주세요");
				
					}
					continue;
				
			case 2:
					System.out.println("1.Hot 2.Ice");
					num2 =input.nextInt();
					
					if(num2 == 1) {
						
					
					System.out.println("개수를 입력해주세요");
					num4 =input.nextInt();
					System.out.println("금액 입력 해주세요");
					num3 =input.nextInt();
					total = num3 * num4;
						if(total>=10000) {
							total /= 10;
							 T=((num3 * num4)-total);
							 money -= T;
							 System.out.println("할인된 가격 :"+total);
							 System.out.println("총 가격:"+T);
							 System.out.println(money+"원 잔돈 입니다");
						}
					
						else {
							total = num3 * num4;
							money -= total;
							System.out.println("정상가 :"+total);
							System.out.println(money+"원 잔돈 입니다");
						}
						}
					else if(num2 ==2) {
						System.out.println("아이스 카페라뗴 나왔습니다");
						System.out.println("3500원 입니다");
						num3 = input.nextInt();
						price = num3;
						money -= price;
						System.out.println(money+"잔돈 입니다\t");
						System.out.println("=================");
					}
				break;
			case 3:
					System.out.println("딸기 스무디 나왔습니다");
					System.out.println("4000원 입니다");
					num3 = input.nextInt();
					price = num3;
					money -= price;
					System.out.println(money+"잔돈 입니다\t");
					System.out.println("=================");
					break;
			case 4:
				System.out.println("딸기 스무디 나왔습니다");
				System.out.println("3800원 입니다");
				num3 = input.nextInt();
				price = num3;
				money -= price;
				System.out.println(money+"잔돈 입니다\t");
				System.out.println("=================");
				break;
			
					
					
			}// switch
		}//while
		}//main
}
//class

