package algorithm_problem;

import java.util.Scanner;

public class QuickChange_Dovlet {
	public static int target;
	public static int quarter, dime, nickles, penny;
	public static void change(){
		quarter = target / 25;
		target = target % 25;
		dime = target / 10;
		target = target % 10;
		nickles = target / 5;
		target = target % 5;
		penny = target / 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		target = scan.nextInt();
		change();
		System.out.println(quarter + " QUARTER(S), " + dime + " DIME(S), " + nickles + " NICKEL(S), " + penny + " PENNY(S)");
	}

}
