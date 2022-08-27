programa
{
	
	funcao inicio()
	{
	
		inteiro contadoresTres=0
		inteiro contadoresCinco=0
		
		para(inteiro x=1 ;x<=50 ;x++){

			se(x%3==0){
			escreva("\n",x)
			contadoresTres = contadoresTres + 1
			}
		}
		para(inteiro y=51; y<=100 ; y++){

			se(y%5==0){
			escreva ("\n",y)
			contadoresCinco = contadoresCinco + 1
			
			
	    }
		}
		escreva("\n O total dos contador 3 é ", contadoresTres)
		escreva("\n O total dos contador 5 é ", contadoresCinco)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 250; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */