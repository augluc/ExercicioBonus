import java.util.Scanner;
public class E05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double peso1, peso2, peso3;
		
		System.out.println("Qual é o peso dos volumes a ser carregado?\nPeso 1:");
		peso1 = leitor.nextDouble();
		System.out.println("Peso 2:");
		peso2 = leitor.nextDouble();
		System.out.println("Peso 3:");
		peso3 = leitor.nextDouble();
		
		if(peso1>peso2 && peso1>peso3) {
			System.out.println("Carregar Peso 1");
		} else {
			if (peso2>peso1 && peso2>peso3) {
				System.out.println("Carregar Peso 2");
			}else {
				System.out.println("Carregar Peso 3");
			}
		}
		
		leitor.close();
	} 
}
