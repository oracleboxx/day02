package day02;

public class for_test {

	public static void main(String[] args) {
		/* f11 : 디버깅 실행 모드
		 * f6  : 한 줄 실행
		 * ctrl+f2 : 디버깅 종료
		 * f8 : run(다음 브레이크 포인터에서 멈춤)
		 * f5 : 한 줄 실행(메소드를 만나면 해당 코드로 )
		 */
		System.out.println("test");
		int sum = 0;
			for(int i=0; i < 10000 ; i++) {
				sum += i;
			}
	}

}
