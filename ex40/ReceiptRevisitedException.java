import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisitedException {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		PrintWriter fileout;
		double gallons, ppGallon, total;

		System.out.print("Gallons: ");
		gallons = kb.nextDouble();
		System.out.print("Price per gallon: ");
		ppGallon = kb.nextDouble();

		total = gallons * ppGallon;

		try {
			fileout = new PrintWriter("receipt.txt");
		}
		catch ( IOException err ) {
			System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
			System.out.println("Maybe the file exists and is read-only?");
			fileout = null;
			System.exit(1);
		}

		fileout.println( "+-----------------------+ " );
		fileout.println( "                         " );
		fileout.println( "      CORNER STORE 1     " );
		fileout.println( "                         " );
		fileout.println( "      2016-04-02         " );
		fileout.println( "                         " );
		fileout.println( "     Gallons:  " + gallons   );
		fileout.println( "    Price/gallon: " + ppGallon );
		fileout.println( "                         " );
		fileout.println( "   Fuel total: $ " + total   );
		fileout.println( "                         " );
		fileout.println( "+-----------------------+ " );

		fileout.close();
	}

}
