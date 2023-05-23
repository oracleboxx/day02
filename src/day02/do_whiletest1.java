package day02;

public class do_whiletest1 {

	public static void main(String[] args) {
		int su=0 ,sum=0;
		do {
			su ++;
			sum += su;
			
		}while(su<9);
		System.out.println(sum);
		
		 su=0;sum=0;
		 	do{
			su ++;
			sum += su;
			
		} while(su<9);
		System.out.println("d"+sum);
	}

}
