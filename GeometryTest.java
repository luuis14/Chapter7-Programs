import java.util.Scanner;

public class GeometryTest {
	public static void main(String[] args){
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("The radius entered is: ");
		double radius = console.nextDouble();

		System.out.print("The height entered is: ");
		double height = console.nextDouble();
		System.out.println(" ");
		
		Geometry shape = new Geometry();
		
		System.out.printf("   The volume of the sphere is: %9.2f%n", shape.sVolume(radius));
		System.out.printf("   The surface area of the sphere is: %9.2f%n", shape.sSurface(radius));
		
		System.out.printf("   The volume of the cylinder is: %9.2f%n", shape.cyVolume(radius, height));
		System.out.printf("   The surface area of the cylinder is: %9.2f%n", shape.cySurface(radius, height));
		
		System.out.printf("   The volume of the cone is: %9.2f%n", shape.cVolume(radius, height));
		System.out.printf("   The surface area of the cone is: %9.2f%n", shape.cSurface(radius, height));
	}
}
