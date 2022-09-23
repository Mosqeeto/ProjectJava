import java.util.Scanner;

public class NewWaveMain {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

	//Variables for prices - won't change I just don't want to write the numbers over and over again lol
	double PC = 675.00;
	double memoryCard = 69.95;
	double diskDrive = 198.50;
	double software = 34.98;

	//User-interactive name and items brought.

	String name;

	//Prints for name

	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your full name.");
	name = sc.nextLine();

	

	//Variables for the different amounts customer is ordering.
	int numPC;
	int numMemCard;
	int numDisk;
	int numSoftware;

	

	System.out.println("Hello, " + name + "! How much of each item would you like to order? :D");
	System.out.println("    ");
	System.out.println("Quanity of NW-PCs(s)... ");
	numPC = sc.nextInt();
	System.out.println("    ");
	System.out.println("Quanity of MemoryCard(s)... ");
	memoryCard = sc.nextInt();
	System.out.println("    ");
	System.out.println("Quanity of Disk Drive(s)... ");
	memoryCard = sc.nextInt();
	System.out.println("    ");
	System.out.println("Quanity of Software(s)... ");
	software = sc.nextInt();

	
	double sumPC = numPC * PC;
	double sumMemCard;
	double sumDisk;
	double umSoftware;

	

	//Receipt 

	System.out.println("****************************************************************");
	System.out.printf("New Wave Computers");
	System.out.println(" ");
	System.out.printf("CUSTOMER: " + name );
	System.out.println( );
	System.out.println( );
	System.out.printf("Quanity   ITEM                  COST");
	System.out.println(" ");
	System.out.printf("1  NW-PC"       );
	System.out.println(" ");
	System.out.printf("2  Memory Card"       );
	System.out.println(" ");
	System.out.printf("3  Disk Drive"       );
	System.out.println(" ");
	System.out.printf("4  Software"       );
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("    TOTAL"                   );
	System.out.println("****************************************************************");


	}



}
