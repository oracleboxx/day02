package day02;

public class while_test1 {

	public static void main(String[] args) {
		/*
		 * while(조건식){
		 *  종속문장;
		 * }
		 * 
		 * 
		 */
		int sum =0, i=1;
		while(i<10) {
			
			sum += i;
			i++;
			
		}
		System.out.println("1~10 합:"+sum);
	

	}
}
