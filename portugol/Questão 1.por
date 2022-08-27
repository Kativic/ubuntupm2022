programa
{
	
	funcao inicio()
	{
		inteiro num1=0, num2=0, num3=0
		inteiro maior=0, menor=0, meio=0

		escreva("Digite um Numero : ")
		leia(num1)
		
		escreva("Digite um Numero : ")
		leia(num2)
		
		escreva("Digite um Numero : ")
		leia(num3)
		
		se(num1>=num2 e num1>=num3)
		{
			escreva("numero 1 é o maior valor")
			maior=num1
			se(num2>=num3)
			{
				meio=num2
				menor=num3
			}
			senao
			{
				meio=num3
				menor=2
			}
						
		}
		senao se (num2>=num1 e num2>=num3)
		{
			escreva("numero 2 é o maior valor")
			maior=num2
			se(num1>=num3)
			{
				meio=num1
				menor=num3
			}
			senao
			{
				meio=num3
				menor=1
			}
			
		}
		senao se (num3>=num1 e num3>=num2)
		{
			escreva("numero 3 é o maior valor")
			maior=num3
			se(num2>=num1)
			{
				meio=num2
				menor=num1
			}
			senao
			{
				meio=num1
				menor=num2
				
			}
		}
	 	escreva("\n",maior," ",meio," ",menor)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 880; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */