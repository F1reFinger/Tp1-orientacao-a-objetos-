package codigos;

import java.util.Scanner;

public class app {
    public static void main(String args[]){
        int escolha = 10;
        ValidaData validador = new ValidaData();
        Entradas insere = new Entradas();
        Globals var = new Globals();


        while(escolha != 0) {
            System.out.println("Escolha a seguir o que deseja:");
            System.out.println("1 - Entrada de Temoeratura.");
            System.out.println("2 - Calculo de Temperatura media.");
            System.out.println("3 - calculo de temperatura minima.");
            System.out.println("4 - Calculo de temperatura maxima.");
            System.out.println("5 - relatorio meteorologico.");
            System.out.println("0 - Sair");

            Scanner leitura = new Scanner(System.in);
            escolha = leitura.nextInt();


            if(escolha < 0 || escolha > 5){
                System.out.println("Não consigo identificar sua escolha\n\n");
            }else{
                switch (escolha){
                    case 1:
                        Entradas.EntradaTemp();
                        break;
                    case 2:
                        insere.Media();
                        break;
                }
            }

        }
    }
}

