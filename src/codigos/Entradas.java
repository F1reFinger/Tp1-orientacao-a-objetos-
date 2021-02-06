package codigos;

import java.util.Scanner; //leitura de dados

public class Entradas {

	public static void EntradaTemp(){

			Globals benner = new Globals();

        	Scanner ler = new Scanner(System.in);

        	for(int i = 0; i < 10; i++){
            		System.out.println("Digite a temperatura do dia:\n");
				benner.a[i] = ler.nextInt();
        	}
    	}

    	public static int Media(){
			Globals bruce = new Globals();
			int soma = 0;
			Entradas.EntradaTemp();
			for(int i = 0; i < 10; i++){
				soma += bruce.a[i];
			}
			return soma/10;
		}
}