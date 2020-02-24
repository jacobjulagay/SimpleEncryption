import java.util.Scanner;
public class PPMImageDriver {

	public static void main(String[] args) {

		// the program expects one command line argument
		// if there is no command line argument, exit the program
		if (args.length != 1) {
			System.exit(1);
		}

		// create an img object
		PPMImage img = new PPMImage(args[0]);
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("What would you to do?");
		System.out.println(" a.) Hide a message");
		System.out.println("\n b.) Recover a message");
		System.out.println("\n c.) Exit");
		System.out.println("Enter a selection:");
		String input = sc.nextLine();

	

		// Save into another PPM File
		img.write2PPM("out.ppm");

		System.out.println("--Good Bye--");

	}

}
