
public class BarcodeMaker {
	
	//Methods
	public String make(int x){
		switch(x){
		case 1: return ":::||";
		case 2: return "::|:|";
		case 3: return "::||:";
		case 4: return ":|::|";
		case 5: return ":|:|:";
		case 6: return ":||::";
		case 7: return "|:::|";
		case 8: return "|::|:";
		case 9: return "|:|::"; 
		case 0: return "||:::"; 
		default: return "000"; 
		}
	}

	public String fixer(int x, int y, int z, int u, int t){
		int all = x + y + z + u + t;
		int check = 10;
		
		if((x + y + z + u + t) % check != 0){
			check += 10;
		}else{
			check = check;
		}
		
		int fin = check - all;
		
		switch(fin){
		case 1: return ":::||";
		case 2: return "::|:|";
		case 3: return "::||:";
		case 4: return ":|::|";
		case 5: return ":|:|:";
		case 6: return ":||::";
		case 7: return "|:::|";
		case 8: return "|::|:";
		case 9: return "|:|::"; 
		case 0: return "||:::"; 
		default: return "000"; 
		}
	}
}






/**
public String b(){
	switch(b){
	case 1: return ":::||";
	case 2: return "::|:|";
	case 3: return "::||:";
	case 4: return ":|::|";
	case 5: return ":|:|:";
	case 6: return ":||::";
	case 7: return "|:::|";
	case 8: return "|::|:";
	case 9: return "|:|::"; 
	case 0: return "||:::"; 
	default: return "000"; 
	}
}

public String c(){
	switch(c){
	case 1: return ":::||";
	case 2: return "::|:|";
	case 3: return "::||:";
	case 4: return ":|::|";
	case 5: return ":|:|:";
	case 6: return ":||::";
	case 7: return "|:::|";
	case 8: return "|::|:";
	case 9: return "|:|::"; 
	case 0: return "||:::"; 
	default: return "000"; 
	}
}

public String d(){
	switch(d){
	case 1: return ":::||";
	case 2: return "::|:|";
	case 3: return "::||:";
	case 4: return ":|::|";
	case 5: return ":|:|:";
	case 6: return ":||::";
	case 7: return "|:::|";
	case 8: return "|::|:";
	case 9: return "|:|::"; 
	case 0: return "||:::"; 
	default: return "000"; }
}

public String e(){
	switch(e){
	case 1: return ":::||";
	case 2: return "::|:|";
	case 3: return "::||:";
	case 4: return ":|::|";
	case 5: return ":|:|:";
	case 6: return ":||::";
	case 7: return "|:::|";
	case 8: return "|::|:";
	case 9: return "|:|::"; 
	case 0: return "||:::"; 
	default: return "000"; }
}**/
