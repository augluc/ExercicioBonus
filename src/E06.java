import java.util.Scanner;
public class E06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double valor, totalCompra;
		String cupom;
		
		System.out.println("Digite o valor da compra:");
		valor = leitor.nextDouble();
		System.out.println("Digite o cupom de desconto:");
		cupom = leitor.next();
		
		if(cupom.equalsIgnoreCase("DIADEFESTA")) {
			totalCompra= 0.97*valor;
			System.out.println("Valor a ser pago:" + totalCompra);
		}else {
			totalCompra = valor;
			System.out.println("Valor a ser pago:" + totalCompra);
		}
		
		
		
		
		leitor.close();
	}

}
