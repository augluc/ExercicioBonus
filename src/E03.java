import java.util.Scanner;
public class E03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite dois n�meros inteiros\nPrimeiro n�mero:");
		A = leitor.nextInt();
		System.out.println("Segundo n�mero:");
		B = leitor.nextInt();
		
		A = A + B;
		B = A - B;
		A = A - B;
		
		System.out.println("Agora o primeiro n�mero � o segundo kkkk\n" + A);
		System.out.println("E o segundo � o primeiro kkkk\n" + B);		
		
		leitor.close();
	}
	

}
