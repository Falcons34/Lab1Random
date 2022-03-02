import java.util.Scanner;

public class PrintLoop {
	public void Run(){
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("How many rows you want in this pattern:");
		}while(!input.hasNextInt());
		int val = input.nextInt();
		Printer(val);
	}
		private static void Printer(int value){
			int count = 1;
			for (int i = 0; i < value; i++) {
				for (int j = 1; j <= count; j++) {
					System.out.printf("%d ",j);
				}
				count++;
				System.out.println("");
			}
		}
	}

