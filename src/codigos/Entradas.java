package codigos;

import java.util.*;

public class Entradas {

	public static void EntradaTemp(int flag){

			Globals benner = new Globals();

        	Scanner ler = new Scanner(System.in);

        	for(int i = 0; i < flag; i++){
            		System.out.println("Digite a temperatura do dia:");
				benner.a[i] = ler.nextInt();
        	}
    	}

    	public static int Media(int tam){

			Globals bruce = new Globals();
			int soma = 0;
			for(int i = 0; i < tam; i++){
				soma += bruce.a[i];
			}
			return soma/tam;
		}

		public static int MediaMin(){
			Globals bruce = new Globals();
			int menor = 0;
			for(int i = 0; i < 10; i++){
				menor = bruce.a[i];
			}
			return menor;
		}
}