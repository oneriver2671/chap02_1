package chap02_1;

public class VariableUseExample {
	public static void main(String[] args) {
//		int hour = 3;
//		int minute = 5;
//		System.out.println(hour + "시간" + minute + "분");
//		
//		int totalMinute = (hour*60) + minute;
//		System.out.println(totalMinute + "분");
		
		
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
	
	}
}