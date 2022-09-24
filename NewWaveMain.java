import java.util.Scanner;

public class NewWaveMain {



	public static void main(String[] args) {

		// TODO Auto-generated method stub	

	//Variables for prices - won't change I just don't want to write the numbers over and over again lol
	double PC;
	double memoryCard;
	double diskDrive;
	double software;

	PC = 675.00;
	memoryCard = 69.95;
	diskDrive = 198.50;
	software = 34.98;

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
	numMemCard = sc.nextInt();
	System.out.println("    ");
	System.out.println("Quanity of Disk Drive(s)... ");
	numDisk = sc.nextInt();
	System.out.println("    ");
	System.out.println("Quanity of Software(s)... ");
	numSoftware = sc.nextInt();

	double sumPC;
	double sumMemCard;
	double sumDisk;
	double sumSoftware;
	
	//Total cost of EACH item brought
	sumPC = numPC * PC;
	sumMemCard = numMemCard * memoryCard;
	sumDisk = numDisk * diskDrive;
	sumSoftware = numSoftware * software;

	double total;
	total = sumPC + sumMemCard + sumDisk + sumSoftware;

	//Receipt 
	System.out.println("****************************************************************");
	System.out.println(" ");
	System.out.printf("New Wave Computers");
	System.out.println(" ");
	System.out.printf("CUSTOMER: " + name );
	System.out.println( );
	System.out.println( );
	System.out.printf("Quanity   ITEM                  COST");
	System.out.println(" ");
	System.out.printf("1  NW-PC                     "+ sumPC );
	System.out.println(" ");
	System.out.printf("2  Memory Card               "+sumMemCard     );
	System.out.println(" ");
	System.out.printf("3  Disk Drive                "+sumDisk  );
	System.out.println(" ");
	System.out.printf("4  Software                  "+sumSoftware  );
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("    TOTAL                   "+total  );


	System.out.println("****************************************************************")
	

	}



}
