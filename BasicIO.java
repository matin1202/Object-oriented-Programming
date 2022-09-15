import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class BasicIO {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		
		System.out.print("Enter your age: ");
		int years = stdin.nextInt();

		System.out.print("Enter your height: ");
		int height = stdin.nextInt();
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String formatedNow = now.format(formatter);		
		
		
		System.out.printf("%s 현재 %s(%d)의 키는 %d cm입니다.", formatedNow, name, years, height);
		}
}