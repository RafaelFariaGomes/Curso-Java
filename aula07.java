import java.util.Arrays;

public class aula07 {
    public static void main(String[] args) {

        int tam = 10;
        int[] num = { 9, 2, 7, 1, 8, 5, 3, 4, 0, 6 };
        int i = 0;
        int[] arrayTeste = new int[tam];

        Arrays.fill(arrayTeste, 10); // serve para adicionar valores aos espaços do array
        Arrays.sort(num); // serve para ordenar o Array
        System.arraycopy(num, 0, arrayTeste, 0, tam); // faz a cópia de um Array para outro

        System.out.printf("Arrays são iguais? %s", Arrays.equals(num, arrayTeste) ? "SIM" : "NÃO");

        // o Arrays equals serve para fazer a verificação de um Array a outro,
        // comparando os valores dos dois entre si

        for (int n : num) // FOR para ler/percorrer elementos de um Array (chamado de FOR EACH)
        {
            System.out.printf("Elemento %d do Array: %d \n", i, num[i]);
            i++;
        }
    }
}
