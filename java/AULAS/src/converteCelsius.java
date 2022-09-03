import java.util.Scanner;

public class converteCelsius {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		double tempCelsius;
		double tempfahre;
		
		System.out.println("Digite o nome: ");
		nome = leia.nextLine();
		System.out.println("Digite a Temperatura em grauCelsisus: ");
		tempCelsius = leia.nextDouble();
		
		tempfahre = ((1.8*tempCelsius)+32);
		
		System.out.println("Oi " +nome.toUpperCase()+" a temperatura em fahrenheit esta em: " +tempfahre);
		

	}

}
