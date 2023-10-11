package com.stringcheck.academy;

public class Main {

	public static void main(String[] args) {
		
		String[] countries = {"China", "Philippines", "Sud Korea"};
		
		
		String input = "Philiphine’s Island";
		
		for (String c: countries) {
			if(input.contains(c)) {
				input = c;
				System.out.println(input);
			}
	
		}

	}

}
