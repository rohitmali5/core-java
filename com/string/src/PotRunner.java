package com.string.src;

public class PotRunner {
	

	public static void main(String[] args) {
		
		 
		String state = "Karanataka";
		System.out.println(state);
		String upperState = state.toUpperCase();
		System.out.println(upperState);
		
		String lower = state.toLowerCase();
		System.out.println(lower);
		
		char charAt  = state.charAt(4);
		System.out.println(charAt);
		
		String replace = state.concat(" is a state");
		System.out.println(replace);
		
		
		

	}

}
