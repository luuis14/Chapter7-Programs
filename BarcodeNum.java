
public class BarcodeNum {
	
	//Instance Fields
	String input;
	int a;
	int b;
	int c;
	int d;
	int e;
	
	//Methods
	public void breakup(String Input){
		
		input = Input;
		
		a = Integer.parseInt(input.substring(0,1));
		b = Integer.parseInt(input.substring(1,2));
		c = Integer.parseInt(input.substring(2,3));
		d = Integer.parseInt(input.substring(3,4));
		e = Integer.parseInt(input.substring(4,5));
	}
	
	public int getA(){
		return a;
	}
	public int getB(){
		return b;
	}
	public int getC(){
		return c;
	}
	public int getD(){
		return d;
	}
	public int getE(){
		return e;
	}
}
