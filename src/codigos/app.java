package codigos;

import java.util.Scanner;

public class app {
    public static void main(String args[]){
        //variáveis de funcionamento do menu e de operações necessarias como busca;
        int escolha = 10, flag = 0, caca_ano, caca_mes;

        //entradas de funções atravez de arquivos se comunicam com a main;
        ValidaData validador = new ValidaData();
        Entradas insere = new Entradas();
        Globals var = new Globals();
        Ano data = new Ano();

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
                        flag = validador.Validetor(1, var.mes, var.ano);
                        while(flag == 0 || flag == 1){
                            flag = validador.Validetor(var.dia, var.mes, var.ano);
                            if(flag == 0 || flag == 1){
                                System.out.println("Algo de errado aconteceu por favor reinsira os valores!");
                                flag = validador.Validetor(var.dia, var.mes, var.ano);
                            }
                        }
                        switch (flag){
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
                        Entradas.EntradaTemp(flag);
                        break;

                    case 2:
                        //case 2 valida o mes e o ano em questão pra procurar e calcular a media do ano;
                        Scanner ler = new Scanner(System.in);
                        System.out.println("Digite o mes em seguida o ano");
                        caca_mes = leitura.nextInt();
                        caca_ano = leitura.nextInt();
                        flag = validador.MesAno();

                        System.out.println("media: " + insere.Media(flag));
                        break;

                    case 3:
                        System.out.println("não ta pronto ainda");
                        break;
                }
            }

        }
    }
}

