
public class BarcodeDecode {
	
	//Methods
	public int decode1(String input){
		
		String a = input.substring(1,6);
		String b = input.substring(6,11);
		String c = input.substring(11,16);
		String d = input.substring(16,21);
		String e = input.substring(21,26);
		
		
		switch(a){
		case ":::||": return 1;
		case "::|:|": return 2;
		case "::||:": return 3;
		case ":|::|": return 4;
		case ":|:|:": return 5;
		case ":||::": return 6;
		case "|:::|": return 7;
		case "|::|:": return 8;
		case "|:|::": return 9;
		case "||:::": return 0;
		default: return 909;
		}
		
	}
	
	public int decode2(String input){
		
		String a = input.substring(1,6);
		String b = input.substring(6,11);
		String c = input.substring(11,16);
		String d = input.substring(16,21);
		String e = input.substring(21,26);
		
		
		switch(b){
		case ":::||": return 1;
		case "::|:|": return 2;
		case "::||:": return 3;
		case ":|::|": return 4;
		case ":|:|:": return 5;
		case ":||::": return 6;
		case "|:::|": return 7;
		case "|::|:": return 8;
		case "|:|::": return 9;
		case "||:::": return 0;
		default: return 909;
		}
		
	}
	
	public int decode3(String input){
		
		String a = input.substring(1,6);
		String b = input.substring(6,11);
		String c = input.substring(11,16);
		String d = input.substring(16,21);
		String e = input.substring(21,26);
		
		
		switch(c){
		case ":::||": return 1;
		case "::|:|": return 2;
		case "::||:": return 3;
		case ":|::|": return 4;
		case ":|:|:": return 5;
		case ":||::": return 6;
		case "|:::|": return 7;
		case "|::|:": return 8;
		case "|:|::": return 9;
		case "||:::": return 0;
		default: return 909;
		}
		
	}
	
	public int decode4(String input){
		
		String a = input.substring(1,6);
		String b = input.substring(6,11);
		String c = input.substring(11,16);
		String d = input.substring(16,21);
		String e = input.substring(21,26);
		
		
		switch(d){
		case ":::||": return 1;
		case "::|:|": return 2;
		case "::||:": return 3;
		case ":|::|": return 4;
		case ":|:|:": return 5;
		case ":||::": return 6;
		case "|:::|": return 7;
		case "|::|:": return 8;
		case "|:|::": return 9;
		case "||:::": return 0;
		default: return 909;
		}
		
	}
	
	public int decode5(String input){
		
		String a = input.substring(1,6);
		String b = input.substring(6,11);
		String c = input.substring(11,16);
		String d = input.substring(16,21);
		String e = input.substring(21,26);
		
		
		switch(e){
		case ":::||": return 1;
		case "::|:|": return 2;
		case "::||:": return 3;
		case ":|::|": return 4;
		case ":|:|:": return 5;
		case ":||::": return 6;
		case "|:::|": return 7;
		case "|::|:": return 8;
		case "|:|::": return 9;
		case "||:::": return 0;
		default: return 909;
		}
		
	}
}
