package codigos;

import java.util.ArrayList;

public class Ano {
	public static int MesMaior(){
        for(int i = 0; i < 31; i++){

        }
        System.out.println("mes com 31 dias:");
        return 31;
    }
    public static int MesMedio(){
        for(int i = 0; i < 30; i++){
        }
        System.out.println("mes com 30 dias:");
        return 30;
    }
    public static int Fevereiro(int flag){
        if(flag == 3){
            for(int i = 0; i < 29; i++) {

            }
            System.out.println("Fevereirp 29");
            return 29;
        }
        else if(flag == 2){
            for(int i = 0; i < 28; i++){

            }
            System.out.println("fevereiro 28");
        }
        return 28;
    }

}