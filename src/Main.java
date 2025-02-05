import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);

	public Main() {
		
		//arithmetic
//		try {
//			arithmetic();
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("finally block");
//		}
		
		//io
//		try {
//			FileReader file = new FileReader("test.txt");
//		} catch (IOException e) {
//			System.out.println(e);
//		}
		
		
		//number format
		String test = "123";
		int num = Integer.parseInt(test);
		try {
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void arithmetic() throws ArithmeticException{
		int a = 20;
		int b;
		b = scan.nextInt(); scan.nextLine();
		
		int c = a/b;
		System.out.println("Hasil = " + c);
	}

	public static void main(String[] args) {
		new Main();
	}

}
