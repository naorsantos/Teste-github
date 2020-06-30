import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		int A;
		System.out.println("Entre com o valor de um numero para saber seu antecessor e sucessor:");
		A= ler.nextInt();
		A++;
		System.out.println("O sucessor é:"+A);
		A=A-2;
		System.out.println("O antecessor é:"+A);
		
		
		
		

	}

}
