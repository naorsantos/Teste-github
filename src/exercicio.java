import java.io.IOException;
import java.util.Scanner; // 1. importando a classe Scanner
 
public class exercicio {
private static Scanner ler;

// através da cláusula throws indicamos que não iremos
// tratar possíveis erros na entrada de dados realizada
// através do método "read" do pacote de classes System.in
  public static void main(String[] args) throws IOException  {
ler = new Scanner(System.in);
 	int idade;
    String nome;
    char sexo;
 
    System.out.printf("Informe um nome:\n");
    nome = ler.nextLine(); // 3.5 entrada de dados (lendo uma String)
 
    System.out.printf("\nInforme o sexo (M/F): ");
// 3.7 entrada de dados (lendo um caractere)
    sexo = (char)System.in.read();
    
// 3.6 entrada de dados (lendo um inteiro)
   System.out.println("Informe a sua idade: ");
   idade = ler.nextInt();
   
    
    System.out.printf("\nResultado:\n");
    if ((sexo == 'M') || (sexo == 'm') || (idade >=18))
       System.out.printf("Seja bem vindo Sr. \"%s\".\n", nome);
    else System.out.printf("Seja bem vinda Sra. \"%s\".\n", nome);
  }
 
}