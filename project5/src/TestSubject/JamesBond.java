package TestSubject;

import java.util.Scanner;

public class JamesBond {
	public Boolean bondRegex(String input){
		Scanner scan = new Scanner(input);
		int i=0;
		while(scan.hasNextInt()){
			i++;
		}
		if(i>=5) return true;
		return false;
	}
}
