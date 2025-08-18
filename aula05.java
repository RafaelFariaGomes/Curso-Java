import java.util.Scanner;

public class aula05{
    public static void main(String[] args){
        //FOR
        for(int cont = 0; cont <= 10; cont++){
            System.out.println("Zika do bagui, numero do cont: " + cont);
        }

          
          Scanner scan = new Scanner(System.in);

          //WHILE
        
        int cont = 0;
        System.out.println("Digite o numero maximo: ");
        int max = scan.nextInt();
        while(cont < max){
            cont++;
            System.out.println("(usando while), Numero do cont: "+cont);
        }



        //DO WHILE
        //int cont = 0;

        do{
            System.out.println("Numero do cont: "+cont);
        }while(cont < 0);{
            cont++;
        }
        
    }
}