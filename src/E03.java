import java.util.Scanner;
public class E03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite dois números inteiros\nPrimeiro número:");
		A = leitor.nextInt();
		System.out.println("Segundo número:");
		B = leitor.nextInt();
		
		A = A + B;
		B = A - B;
		A = A - B;
		
		System.out.println("Agora o primeiro número é o segundo kkkk\n" + A);
		System.out.println("E o segundo é o primeiro kkkk\n" + B);		
		
		leitor.close();
	}
	

}
