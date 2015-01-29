/* Solicitar dois numeros via teclado, verificar se o maior é multiplo do menor
	e mostrar o resultado em uma caixa de mensagem.
****************************************************************************** */
//
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Multiplo{
	public static void main(String[] args){
		int a,b,resto;
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre o primeiro numero: ");
		a = scan.nextInt();
		System.out.println("Entre o segundo numero: ");
		b = scan.nextInt();
		if (a <= b) {
			resto = b%a;
			if (resto == 0)
				JOptionPane.showMessageDialog(null, b+" e multiplo de "+a);
			else
				JOptionPane.showMessageDialog(null, b+" NAO e multiplo de "+a);
		}
		else { 
			resto = a%b;
			if (resto == 0)
				JOptionPane.showMessageDialog(null, a+" e multiplo de "+b);
			else
				JOptionPane.showMessageDialog(null, a+" nao e multiplo de "+b);
		}
	}
}