/***********************************************************
				Fatoracao Completa de um Numero
				06/02/2015
 ***********************************************************/
import java.util.Scanner;
public class Fatoracao {
	public static void main (String[] args){
		int numero = 0;
		int divisor = 1;
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		while (numero<=1){
			System.out.println("Entre um numero inteiro maior ou igual a 2: ");
			numero = scan.nextInt();
		}
//	*** Procura por fatores 2 no numero entrado ***
		do {
			if (numero%2 == 0) {
				System.out.print("2 x ");
				numero = numero/2;
			}
			else 
				flag = true;
		}
		while (flag == false);
	}
}