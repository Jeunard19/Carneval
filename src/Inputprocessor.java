import java.util.Scanner;

public class Inputprocessor {

	public String getInput() {
		System.out.print("Input: ");
		Scanner scanner = new Scanner(System.in);
		String input=scanner.nextLine();
		return input;	
			
	}
}
