package codigos;

import java.util.Scanner; //leitura de dados

public class ValidaData {

    public static int Validetor(int dia, int mes, int ano){

        if(dia == 1){
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o mes:\n");
            mes = ler.nextInt();
            System.out.println("Digite o ano:\n");
            ano = ler.nextInt();
        }

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


}