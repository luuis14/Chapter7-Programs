import java.util.Scanner;

public class BarcodeTest {
	
	public static void main(String[] args){
		
		boolean run = false;
		while(!run){
			
			Scanner console = new Scanner(System.in);
			System.out.println("Enter zip code, type 0 to cancel: ");
			String zip = console.nextLine();
			System.out.println("Zip Entered: " + zip);
			
			BarcodeNum number = new BarcodeNum();
			number.breakup(zip);
			
			BarcodeMaker maker = new BarcodeMaker();
			
			
			System.out.println("|" + maker.make(number.getA()) + maker.make(number.getB()) + maker.make(number.getC()) + maker.make(number.getD()) + maker.make(number.getE()) + maker.fixer(number.getA(), number.getB(), number.getC(), number.getD(), number.getE()) + "|");
		}
	}
}
