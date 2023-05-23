package day02;

public class while_test2 {

	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			i++;
			if(i==3) {
				System.out.println(3333);
				continue;
			}
			
			System.out.println("i: "+i);
		}
	}

}
