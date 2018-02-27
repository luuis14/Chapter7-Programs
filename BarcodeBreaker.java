
public class BarcodeBreaker {
	
	//Methods
	public String breaker(String input, int digit){
		
		switch(digit){
		case 1: return input.substring(1,6);
		case 2: return input.substring(6,11);
		case 3: return input.substring(11,16);
		case 4: return input.substring(16, 21);
		case 5: return input.substring(21, 26);
		case 6: return input.substring(26, 31);
		default: return "ERR";
		}
	}
}
