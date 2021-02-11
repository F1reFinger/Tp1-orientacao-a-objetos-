package codigos;

import java.util.Scanner; //leitura de dados

public class ValidaData {

    public static int Validetor(int dia, int jhonsons, int billi){

        if(dia == 1){
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o mes:\n");
            Globals.mes = ler.nextInt();
            System.out.println("Digite o ano:\n");
            Globals.ano = ler.nextInt();
        }

        if (Globals.mes >= 1 && Globals.mes <= 12) {
            // Data Válida
            if (Globals.mes == 1 || Globals.mes == 3 || Globals.mes == 5 || Globals.mes == 7 || Globals.mes == 8 || Globals.mes == 10 || Globals.mes == 12) {
                if (dia >= 1 && dia <= 31) {
                    //5 mes com 31 dias
                    return 5;
                } else {
                    // Dia inválido
                    return 0;
                }
            } else if (Globals.mes == 4 || Globals.mes == 6 || Globals.mes == 9 || Globals.mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    return 4;
                } else {
                    // Dia inválido
                    return 0;
                }
            } else if (Globals.mes == 2) {
                // Se o mês é fevereiro, é necessário saber se o ano é bissexto ou não, ou seja,
                // se fevereiro tem 28 ou 29 dias.
                if (((Globals.ano % 4 == 0) && (Globals.ano % 100 != 0)) || (Globals.ano % 400 == 0)) {
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