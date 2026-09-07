import java.util.Scanner;
public class App {
       
    //Atividade aula 06 - exercício 07
    // Turma: ADS1AN-ESA1-90834648
    // Curso: Análise e desenvolvimento de sistemas
    // Professor: Alexandre de Oliveira 
    // Aluno: Guilherme Michelsen Silva de Oliveira 
    // Data: 07/09/2026

    public static void main(String[] args) throws Exception {
       Scanner leitor = new Scanner(System.in);

       // ENTRADA
       System.out.print("Informe seu número:");
       int numero = leitor.nextInt();

       //PROCESSAMENTO
       
    if (numero>= 0) {
        System.out.println("Positivo");
    } else {
        System.out.println("Negativo"); 
 }

 leitor.close(); 
}

}
