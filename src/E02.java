import  java.util.Scanner;

public class E02 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double hora, minuto, segundo;
		
		System.out.println("Ai ai, gostaria de saber a dura��o de um filme em horas ou segundos?\nDigite aqui a dura��o em minutos:");
		minuto = leitor.nextDouble();
		System.out.println("Calculando a dura��o do filme ...");
		
		hora = minuto/60;
		segundo = minuto*60;
		
		System.out.println("O filme tem a dura��o de " + hora + " hora(s)\nE de " + segundo + " segundos");
		
		leitor.close();			
		}

}
