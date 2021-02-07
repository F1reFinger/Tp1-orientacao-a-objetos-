package codigos;

import java.util.Scanner; //leitura de dados

public class ValidaData {

    public static int Validetor(int dia, int mes, int ano){

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o mes:\n");
        mes = ler.nextInt();
        System.out.println("Digite o ano:\n");
        ano = ler.nextInt();

        if (mes >= 1 && mes <= 12) {
            // Data Válida
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 1 && dia <= 31) {
                    //5 mes com 31 dias
                    return 5;
                } else {
                    // Dia inválido
                    return 0;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    return 4;
                } else {
                    // Dia inválido
                    return 0;
                }
            } else if (mes == 2) {
                // Se o mês é fevereiro, é necessário saber se o ano é bissexto ou não, ou seja,
                // se fevereiro tem 28 ou 29 dias.
                if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
                    if (dia >= 1 && dia <= 29) {
                        return 3;
                    } else {
                        // mes invalido
                        return 0;
                    }
                } else {
                    if (dia >= 1 && dia <= 28) {
                        // 2 significa que o mês ta válido mas que tem 28 dias
                        return 2;
                    } else {
                        //invalido
                        return 0;
                    }
                }

            }
        } else{
            // Mes invalido
            return 0;
        }
        return 1;
    }



    public static int MesAno(){
        int mesv, anov;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o mes em seguida o ano nessa respectiva ordem");
        mesv = ler.nextInt();
        anov = ler.nextInt();

        if (mesv >= 1 && mesv <= 12) {
            // Data Válida
            if (mesv == 1 || mesv == 3 || mesv == 5 || mesv == 7 || mesv == 8 || mesv == 10 || mesv == 12) {
                    return 31;
            }
            else if (mesv == 4 || mesv == 6 || mesv == 9 || mesv == 11) {
                return 30;
            }
            } else if (mesv == 2) {
                if (((anov % 4 == 0) && (anov % 100 != 0)) || (anov % 400 == 0)) {
                     return 29;
                } else {
                   return 28;
                }

            } else{
            System.out.println("Não é um mes/ano valido!");
            return 0;
        }
        return 0;
    }
}