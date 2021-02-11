package codigos;

import java.util.*;
import java.util.Random;

public class Entradas {

	public static void EntradaTemp(int flag, int mes){

        	Scanner ler = new Scanner(System.in);

        	for(int i = 0; i < flag; i++){
            		System.out.println("Digite a temperatura do dia " + (i+1) + ":");
					Globals.a[mes][i] = ler.nextInt();

					if(Globals.a[mes][i] < Globals.minimo){
						Globals.minimo = Globals.a[mes][i];
					}
					if(Globals.a[mes][i] > Globals.maxima){
						Globals.maxima = Globals.a[mes][i];
					}
        	}
    	}

    	public static double Media(int tam){

			Globals.soma = 0;
			for(int i = 0; i < tam; i++){
				Globals.soma += Globals.a[Globals.mes][i];
			}
			return Globals.soma/tam;
		}

		public static void MediaMin(int tam){
					for(int i = 0; i < tam; i++){
						if(Globals.a[Globals.mes][i] <= Globals.minimo) {
							Globals.minimos[i] = 1;
						}
						else{
							Globals.minimos [i] = 0;
						}
					}
		}

		public static void MediaMax(int tam){
			for(int i = 0; i < tam; i++){
				if(Globals.a[Globals.mes][i] >= Globals.maxima) {
					Globals.maximos [i] = 1;
				}
				else{
					Globals.maximos [i] = 0;
				}
			}
		}

		public static void Relatorio(int tam, boolean genis){
			if(genis){
				Generator(tam);
			}

			for(int i = 0; i < tam; i++){
				Globals.media = Media(tam);
				System.out.println("Dia:" + (i+1) + " Media Diaria: " + Globals.a[Globals.mes][i]);
			}
			System.out.println("Minimas:");
			MediaMin(tam);
			for(int i = 0; i < tam; i++){
				if(Globals.minimos[i] == 1){
					System.out.println("Dia:" + (i+1) + " Minima: " + Globals.a[Globals.mes][i]);
				}
			}
			System.out.println("Maximas:");
			MediaMax(tam);
			for(int i = 0; i < tam; i++){
				if(Globals.maximos[i] == 1){
					System.out.println("Dia:" + (i+1) + " Maxima: " + Globals.a[Globals.mes][i]);
				}
			}
			System.out.println("Media Mensal:" + Globals.media);

		}

		public static void Generator(int flag){
			Random rand = new Random();
			double braia;
			for(int i = 0; i < flag; i++){
				if(i % 5 == 0){
					braia = rand.nextInt(44);
					Globals.a[Globals.mes][i] = braia * (-1);
				}
				else{
					Globals.a[Globals.mes][i] = rand.nextInt(44);
				}
				if(Globals.a[Globals.mes][i] < Globals.minimo){
					Globals.minimo = Globals.a[Globals.mes][i];
				}
				if(Globals.a[Globals.mes][i] > Globals.maxima){
					Globals.maxima = Globals.a[Globals.mes][i];
				}
			}
		}
}