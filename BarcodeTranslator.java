import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BarcodeTranslator {
	
	public static void main(String[] args) throws FileNotFoundException{

		FileReader file = new FileReader("src/barcodes.txt");
		Scanner reader = new Scanner(file);
		boolean run = false;
		while(reader.hasNextLine()){
			String code = reader.nextLine();
			
			BarcodeBreaker breaker = new BarcodeBreaker();
			BarcodeDecode decode = new BarcodeDecode();
			
			
			if(decode.decode1(code) == 909 || decode.decode2(code) == 909 || decode.decode3(code) == 909 || decode.decode4(code) == 909 || decode.decode5(code) == 909){
				System.out.println(code);
				System.out.println("Not a real postal code");
			}else{
				System.out.println(code);
				System.out.print(decode.decode1(code));
				System.out.print(decode.decode2(code));
				System.out.print(decode.decode3(code));
				System.out.print(decode.decode4(code));
				System.out.println(decode.decode5(code));
			}
		}
	}
}
