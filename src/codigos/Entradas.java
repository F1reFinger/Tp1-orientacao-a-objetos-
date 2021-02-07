package codigos;

import java.util.*;

public class Entradas {

	public static void EntradaTemp(int flag){

        	Scanner ler = new Scanner(System.in);

        	for(int i = 0; i < flag; i++){
            		System.out.println("Digite a temperatura do dia " + (i+1) + ":");
					Globals.a[i] = ler.nextInt();

					if(Globals.a[i] < Globals.minimo){
						Globals.minimo = Globals.a[i];
					}
					if(Globals.a[i] > Globals.maxima){
						Globals.maxima = Globals.a[i];
					}
        	}
    	}

    	public static double Media(int tam){

			Globals bruce = new Globals();
			Globals.soma = 0;
			for(int i = 0; i < tam; i++){
				Globals.soma += bruce.a[i];
			}
			return Globals.soma/tam;
		}

		public static void MediaMin(int tam){
					for(int i = 0; i < tam; i++){
						if(Globals.a[i] <= Globals.minimo) {
							Globals.minimos[i] = 1;
						}
						else{
							Globals.minimos [i] = 0;
						}
					}
		}

		public static void MediaMax(int tam){
			for(int i = 0; i < tam; i++){
				if(Globals.a[i] >= Globals.maxima) {
					Globals.maximos[i] = 1;
				}
				else{
					Globals.maximos [i] = 0;
				}
			}
		}

		public static void Relatorio(int tam){
			for(int i = 0; i < tam; i++){
				System.out.println("Dia:" + (i+1) + " Media Diaria: " + Globals.a[i]);
			}
			System.out.println("Minimas:");
			for(int i = 0; i < tam; i++){
				if(Globals.minimos[i] == 1){
					System.out.println("Dia:" + (i+1) + " Minima: " + Globals.a[i]);
				}
			}
			System.out.println("Maximas:");
			for(int i = 0; i < tam; i++){
				if(Globals.maximos[i] == 1){
					System.out.println("Dia:" + (i+1) + " Maxima: " + Globals.a[i]);
				}
			}
			System.out.println("Media Mensal:" + Globals.media);

		}
}