package codigos;

import java.util.Scanner; //leitura de dados

public class Entradas {

	public static void EntradaTemp(){

			Globals benner = new Globals();

        	Scanner ler = new Scanner(System.in);

        	for(int i = 0; i < 10; i++){
            		System.out.println("Digite a temperatura do dia:");
				benner.a[i] = ler.nextInt();
        	}
    	}

    	public static void Media(){
			Globals bruce = new Globals();
			int soma = 0;
			for(int i = 0; i < 10; i++){
				soma += bruce.a[i];
				System.out.println("soma =" + soma);
			}
			soma = soma/10;
			System.out.println("Soma =" + soma);
		}
}