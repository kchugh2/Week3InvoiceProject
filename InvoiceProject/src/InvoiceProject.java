import java.util.Scanner ;

public class InvoiceProject {
public static void main (String [] args)
{
	double taxrate, total = 0,totalcost=0,tax=0, cost;
	int counter=0;
	String cont="y";

Scanner keyboard = new Scanner(System.in);
System.out.print("Enter the Tax Rate");
taxrate= keyboard.nextDouble();
do
{
	
	counter++;
	System.out.println("Enter the cost of Product " + counter);
	cost= keyboard.nextDouble();
	if (cost == 0)
		cont="n";
	
	keyboard.nextLine();
	tax = tax + (0.01*taxrate*cost);
	total = total + cost;
	
} while (!cont.equals("n"));
System.out.println("Your bill amount is " + total + "\nYour tax is " + tax + "\nYour total amount due is " + (total+tax));
}
}