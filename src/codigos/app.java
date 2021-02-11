package codigos;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class app {
    public static void main(String args[]){
        //variáveis de funcionamento do menu e de operações necessarias como busca;
        int escolha = 10, flag = 0, valideiro, validado;

        //entradas de funções atravez de arquivos se comunicam com a main;
        ValidaData validador = new ValidaData();
        Entradas insere = new Entradas();
        Globals var = new Globals();
        Ano data = new Ano();

        Component frame = null;

        JOptionPane.showMessageDialog(frame, "Obs caso a opção selecionada não contenha dados eles serão gerados automaticamente." +
                " para continuar clique em ok.");

        //rodando o menu até o ususario decidir desistir;
        while(escolha != 0) {
            System.out.println("Escolha a seguir o que deseja:");
            System.out.println("1 - Entrada de Temperatura.");
            System.out.println("2 - Calculo de Temperatura media.");
            System.out.println("3 - calculo de temperatura minima.");
            System.out.println("4 - Calculo de temperatura maxima.");
            System.out.println("5 - relatorio meteorologico.");
            System.out.println("0 - Sair");

            //escaneia a operação desejada pelo usuário
            Scanner leitura = new Scanner(System.in);
            escolha = leitura.nextInt();

            //condicionais para passar a responsabilidade para as funções
            if(escolha < 0 || escolha > 5){
                System.out.println("Não consigo identificar sua escolha");
            }else{
                switch (escolha){
                    case 1:
                        //case 1 valida uma data e tbm valida a entrada de temperatura
                        Globals.tipo = validador.Validetor(1, Globals.mes, Globals.ano);
                        while(Globals.tipo == 0 || Globals.tipo == 1){
                            Globals.tipo = validador.Validetor(1, Globals.mes, Globals.ano);
                            if(Globals.tipo == 0 || Globals.tipo == 1){
                                System.out.println("Algo de errado aconteceu por favor reinsira os valores!");
                                Globals.tipo = validador.Validetor(1, Globals.mes, Globals.ano);
                            }
                        }
                        switch (Globals.tipo){
                            case 2:
                                flag = Ano.Fevereiro(2);
                                break;
                            case 3:
                                flag = Ano.Fevereiro(3);
                                break;
                            case 4:
                                flag = Ano.MesMedio();
                                break;
                            case 5:
                                flag = Ano.MesMaior();
                        }
                        Entradas.EntradaTemp(flag, Globals.mes);
                        break;

                    case 2:
                        //case 2 valida o mes e o ano em questão pra procurar e calcular a media do ano;
                        Scanner ler = new Scanner(System.in);
                        Globals.media = insere.Media(flag);
                        System.out.println("media: " + Globals.media);
                        break;

                    case 3:
                        insere.MediaMin(flag);
                        System.out.println("Minimas:");
                        for(int i = 0; i < flag; i++){
                            if(Globals.minimos[i] == 1){
                                System.out.println("Dia:" + (i+1) + " Minima: " + Globals.a[Globals.mes][i]);
                            }
                        }
                        break;
                    case 4:
                        insere.MediaMax(flag);
                        System.out.println("Maximas:");
                        for(int i = 0; i < flag; i++){
                            if(Globals.maximos[i] == 1){
                                System.out.println("Dia:" + (i+1) + " Maxima: " + Globals.a[Globals.mes][i]);
                            }
                        }
                        break;
                    case 5:

                        JOptionPane.showMessageDialog(frame, "Obs: essa opção pode apagar ou inserir alguns dados aleatorios." +
                                " se está ciente clique em ok.");

                        Scanner lido = new Scanner(System.in);
                        System.out.println("Digite o mes a ser relatado:");
                        Globals.verifica = lido.nextInt();
                        System.out.println("Digite o ano a ser relatado:");
                        Globals.verificados = lido.nextInt();
                        if(Globals.verifica == Globals.mes && Globals.verificados == Globals.ano){
                            insere.Relatorio(flag,false);
                            Globals.minimo = 100;
                            Globals.maxima = -100;
                        }
                        else if(Globals.verifica != Globals.mes && Globals.verificados != Globals.ano || Globals.verifica != Globals.mes && Globals.verificados == Globals.ano){
                            Globals.mes = Globals.verifica;
                            Globals.ano = Globals.verificados;
                            Globals.tipo = validador.Validetor(2, Globals.mes, Globals.ano);

                            switch (Globals.tipo){
                                case 2:
                                    flag = Ano.Fevereiro(2);
                                    break;
                                case 3:
                                    flag = Ano.Fevereiro(3);
                                    break;
                                case 4:
                                    flag = Ano.MesMedio();
                                    break;
                                case 5:
                                    flag = Ano.MesMaior();
                            }
                            Globals.minimo = 100;
                            Globals.maxima = -100;
                            insere.Relatorio(flag,true);

                        }


                }
            }
        }
    }
}

