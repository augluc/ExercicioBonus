import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int idade, ano;
		
		System.out.println("Gostaria de saber a idade de alguém? \nDigite o ano de nascimento:");
		ano = leitor.nextInt();
		System.out.println("Calculando idade ...");
		
		idade = 2021 - ano;
		System.out.println("A idade em 31/12/2021 será de " + idade + " :)");
		
		leitor.close();
	}

}
