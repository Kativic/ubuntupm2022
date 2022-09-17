
import java.util.Scanner;
public class Loja {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String codigo[] = {"grp06-01", "grp06-02","grp06-03","grp06-04","grp06-05","grp06-06","grp06-07","grp06-08","grp06-09","grp06-010"};
		String produtos[] = {"Cluth", "Scarpan","Coturno","Enxarpe","Blusa","Spencer", "Touca","Casaco", "Calça", "S.Pele"};
		double preco [] = {150, 289, 270, 59, 239, 128, 49, 295, 137, 35};
		int estoque [] = new int[10];
		int carrinho[]= new int[10];
		char compra = 'N';
		String auxcodigo="";
		int posicao = 0;
		
		for(int i=0;i<9;i++) {
			estoque[i]=10;
		}
		
		do {
			System.out.println("Loja SK Store");
			System.out.println("A moda é você quem faz!!");
			
			System.out.print("Deseja realizar um pedido S/N: ");
			compra=leia.next().toUpperCase().charAt(0);
			if(compra == 'N') {
				break;
			} 
			else if(compra=='S') {
				System.out.println("----------------------------------------------");
				System.out.println("CÓDIGO\t\tPRODUTO\tPREÇO\tESTOQUE");
				System.out.println("----------------------------------------------");
				for(int i=0;i<10;i++) {
					System.out.println(codigo[i]+"\t"+produtos[i]+"\t" + preco[i]+"\t"+estoque[i]);
				}
				System.out.println();
				System.out.print("Digite o codigo do produto : ");
				auxcodigo=leia.next();
				for(int i=0;i<10;i++) {
					if(auxcodigo.equals(codigo[i])) {
						posicao=i;
						System.out.println("----------------------------------------------");
						System.out.println("CÓDIGO\t\tPRODUTO\tPREÇO\tESTOQUE");
						System.out.println("----------------------------------------------");
						System.out.println(codigo[i]+"\t"+produtos[i]+"\t" + preco[i]+"\t"+estoque[i]);
					}
					
				}
				if(estoque[posicao]==0) {
					System.out.println("Produto indisponivel");
				} else {
					System.out.println("Digite a quantidade: ");
					carrinho[posicao]=leia.nextInt();
					while(carrinho[posicao]<=0 ||carrinho[posicao]>estoque[posicao]) {
						System.out.println("Digitação Invalida!!");
						System.out.println("Digite a quantidade: ");
						carrinho[posicao]=leia.nextInt();
					}
					
				}
				
				
			} 
			else {
				System.out.println("Digitação invalida, saindo do programa!!!");
			}
			
			
			
		} while(compra=='S');
		
		System.out.println("Ate breve");
			
	
	}

}
