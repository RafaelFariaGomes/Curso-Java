public class aula09 {
    
    // Aprendendo sobre os Métodos

    public static void main(String[] args){ // modificador de acesso, retorno, nome  e parametros
        soma(60, 6); // chamando o método soma e passando os parametros 60 e 6
        System.out.println(soma(60,6)); // desntro do print está o retorno do metodo soma com os parametros passados.
        
        
    }
    public static void msg(String m, int l){
        for(int i=0; i<l; i++){
            System.out.println(m);

        }
    }

    public static int soma(int n1, int n2){
        int resultado = n1+n2;

        return resultado;
    }
}
