package simplealgorithm;

import java.util.Scanner;

public class GuGuDan {
	public static void printTargetGuGudan(int target){
		for(int i = 1;i<=9;i++){
			System.out.println(target + " * " + i + " = " + target * i);
		}
	}
	
	public static void printAllGuGudan(){
		for(int i = 1;i<=9;i++){
			for(int j = 1;j<=9;j++){
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int target = scan.nextInt();
		scan.close();
		printTargetGuGudan(target);
		System.out.println("--------------");
		printAllGuGudan();
	}

}
