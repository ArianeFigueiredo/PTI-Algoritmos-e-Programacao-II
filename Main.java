import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe a quantidade de elementos que serão lidos pelo vetor:");
    int Num = sc.nextInt();
    int[] vetor = new int[Num];
    for (int i = 0; i < Num; i++) {
      int numeros = sc.nextInt();
      vetor[i] = numeros;
    }
    System.out.println("A maior diferença entre 2 números distintos do vetor é: " + DiferencaElemento(vetor, Num));
    System.out.println();
    if (OrdemCrescente(vetor, Num) == 1) {
      System.out.println("Verdadeiro, está em ordem crescente!");
    } else
      System.out.println("Falso, não está em ordem crescente!");
    sc.close();
  }
  static int DiferencaElemento(int[] vetor, int Num) {
    int diferenca = 0;
    int maior = vetor[0];
    for (int i = 0; i < Num; i++) {
      if (vetor[i] > maior) {
        maior = vetor[i];
      }
    }
    int menor = vetor[0];
    for (int i = 0; i < Num; i++) {
      if (vetor[i] < menor) {
        menor = vetor[i];
      }
    }
    return diferenca = maior - menor;
  }
  static int OrdemCrescente(int[] vetor, int Num) {
    for (int i = 1; i < Num; i++) {
      if (vetor[i - 1] > vetor[i]) {
        return 0;
      }
    }
    return 1;
  }
}