/*********************************************************
 *     Faz o produto cartesiano entre dois conjuntos     *
 *                    22/03/2015                         *
 *********************************************************/
import java.util.Scanner;
public class Cartesiano{
	public static void main(String[] args){
		int numElementosDeA, numElementosDeB;
		String[] conjuntoA = new String[100]; 
		String[] conjuntoB = new String[100];
		Scanner scan = new Scanner(System.in);
		System.out.print("Numero de elementos do conjunto A? ");
		numElementosDeA = scan.nextInt();
		System.out.print("Numero de elementos do conjunto B? ");
		numElementosDeB = scan.nextInt();
		System.out.println(" ");
		for(int cont=0; cont<numElementosDeA; cont++){
			System.out.print((cont+1)+".o Elemento de A? ");
			conjuntoA[cont] = scan.next();
		}
		System.out.println(" ");
		for(int cont=0; cont<numElementosDeB; cont++){
			System.out.print((cont+1)+".o Elemento de B:? ");
			conjuntoB[cont] = scan.next();
		}
		for(int cont=0; cont<numElementosDeA; cont++){
			for(int cont1=0; cont1<numElementosDeB; cont1++){
				System.out.println("("+conjuntoA[cont]+","+conjuntoB[cont1]+")");
			}
		}
	}
}