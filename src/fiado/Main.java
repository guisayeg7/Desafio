package fiado;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// conjunto finito e ordenado
		int[] fiados = new int[10];
//      fiados[0] = 12
//      fiados[3] = 87
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		System.out.println("Informe o valor da compra: ");
		fiados[0] = Integer.valueOf(scanner.nextLine());
        System.out.println("Informe seu número de telefone: ");
        String tel = scanner.nextLine();
        
		
		int total = somawhile(fiados);
		
		if (total > 100) {
			System.out.println("Cliente " + nome + " deve: " + total + " ganhou um brinde!");
		} else {
			System.out.println("Cliente " + nome + " deve: " + total);		
		}
		
		System.out.println("Cliente " + nome + ", número de telefone é: " + tel);
		// CTRL+SHIFT+F = ajeita codigo
		System.out.println("Total: " + total);

	}

	private static String formatString(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int somawhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total = total + fiados[i];
			System.out.println(fiados[i]);
			i++;
		}
		return total;
	}
	
}




	
	
	
	
	
	
	
	
	
	
