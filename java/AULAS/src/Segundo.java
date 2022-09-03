import java.util.Scanner;

public class Segundo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//variaveis - tipo de dados
		int anoNascimento;
		int idade =0; 
		char zona ='L';
		double salario= 0.00;
		boolean milionario=false;
		String nome = "Katia Santos";
		
		
		System.out.println(nome);
		System.out.println(zona);
		System.out.println(salario);
		System.out.println(milionario);
		System.out.println(nome + " " +salario+ " "+milionario);
		System.out.println(nome.toUpperCase());
		System.out.println("Digite o ano de Nascimento: ");
		anoNascimento =leia.nextInt();
		System.out.println("Digite o nome: ");
		nome = leia.next();
		leia.next();
		System.out.println("Digite o salario: ");
		salario = leia.nextDouble();
		
		idade = 2020 - anoNascimento;
		
		System.out.println("Oi "+nome+"sua idade é "+idade+ "seu salario é R$"+salario);
		
	}

}
