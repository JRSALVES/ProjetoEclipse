package AulaIntroducao;

public class Calculadora {

    public static void main(String[] args) {
        int a = 1;
        int b = 10;

        // Chamando o método somar e imprimindo o resultado
//        int resultado = somar(numero01, numero02);
        System.out.println("Resultado da soma: " + somar(a, b));
    }

    // Método para somar dois números
    public static int somar(int numero1, int numero2) {
        int soma1 = 0;

        if (numero1 > 0) {
            soma1 = numero1 + numero2;
        } else {
            soma1 = (numero1 + 5) + numero2; // Parênteses extras desnecessários removidos
        }

        return soma1;
    }   
   
}
