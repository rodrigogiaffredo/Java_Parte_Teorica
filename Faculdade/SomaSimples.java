

/**
 * Primeiro exercício da faculdade (12/08/2026): fazendo uma soma simples
 
 * A linha int a = 10; cria uma variável inteira chamada a com valor 10.
 * A linha int b = 25; cria uma variável inteira chamada b com valor 25.
 * A linha int soma = a + b; calcula a soma e guarda o resultado em soma.
 * A linha System.out.println("A soma e: " + soma); imprime um texto e concatena o número ao final.

 * Como rodar pelo terminal:
 * javac SomaSimples.java
 * java SomaSimples
 */

public class SomaSimples {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int soma = a + b;
        System.out.println("A soma é: " + soma);
    }    
}
