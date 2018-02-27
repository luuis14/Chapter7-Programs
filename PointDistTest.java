import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PointDistTest {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader reader = new FileReader("src/points.txt");
		Scanner console = new Scanner(reader);
		
		boolean run = false;
		while(console.hasNextDouble()) {
			double x1 = console.nextDouble();
			double y1 = console.nextDouble();
			double x2 = console.nextDouble();
			double y2 = console.nextDouble();
			
			Geometry coordinate = new Geometry();
			
			System.out.printf("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is %4.2f%n",coordinate.pointDistance(x1, y1, x2, y2));
		
		}
	}
}
