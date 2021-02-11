package codigos;

public class Ano {
	public static int MesMaior(){
	    System.out.println("Mes selecionado: contem 31 dias");
        return 31;
    }
    public static int MesMedio(){
	    System.out.println("Mes selecionado: contem 30 dias");
        return 30;
    }
    public static int Fevereiro(int flag){
        if(flag == 3){
            System.out.println("Mes selecionado: Fevereiro de ano bisexto");
            return 29;
        }
        else if(flag == 2){
            System.out.println("Mes selecionado: Fevereiro de ano regular");
        }
        return 28;
    }

}