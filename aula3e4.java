import java.util.Scanner;

public class aula3e4{


public static void main(String [] args){
    Scanner dadoDigitadoUsuario = new Scanner(System.in);

    int n1 = 0, n2 = 0, res = 0;
    String nome;

    System.out.print("Digite seu nome: ");
    nome = dadoDigitadoUsuario.nextLine();

    System.out.println("Digite um numero!");

    n1 = dadoDigitadoUsuario.nextInt();

    System.out.println("Digite outro numero para a soma.");

    n2 = dadoDigitadoUsuario.nextInt();

    res = n1 + n2;

    System.out.printf("%s, o resultado da soma de %d com %d, é: %d", nome, n1, n2, res);


}
    public static void aula3(String[] args){
       /* int nota = 70;
        int media = 60;
        int faltas = 13;
        String resultado;

        resultado = (nota >= media ? "Aprovado! \n\n\n" : "Reprovado. \n\n\n");

        System.out.println("Você está: " + resultado);
        

    if(nota >= media && faltas < 20){
        System.out.print("Você foi Aprovado! Parabéns.\n\n\n");
    } else if(nota < 60 && faltas < 20){
        System.out.println("Você está recuperação, consulte a coordenação para saber o cronograma.\n\n\n");
    } else {
        System.out.println("Você está REPROVADO!\n\n\n");
    }


    System.out.println("Linha final do programa.____________________________"); */

    /*  SWITCH  */

        int posicao = 1;

        switch(posicao){
            case 1:
                System.err.println("Primeiro Lugar!");
                break;
            case 2 :
                System.err.println("segundo lugar!");
                break;
            case 3:
                System.err.println("Terceiro lugar.");
                break;
            default:
                System.err.println("Não subiu no podio...");
        }

    }
}