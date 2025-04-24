import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.File;
import java.io.FileOutputStream; // aaaa
import java.io.FileWriter; //classe para escrever no arquivo
import java.io.IOException; // classe para tratar exceções no arquivo
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome; // referencia
        int opcaoTransporte; // camelCasing
        String meioTransporte = "";
        
        
        // classe para teclado
        Scanner scanner = new Scanner (System.in);

        System.out.println("\n-----------------------------");
        System.out.println("Pesquisa de Transporte Diário");
        System.out.println("-----------------------------");
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Como você vai ao trabalho? ");
        // utf-8 - nome
        System.out.println("-----------------------------");
        System.out.println("1-Metrô");
        System.out.println("2-Ônibus");
        System.out.println("3-Caminhada");
        System.out.println("4-Uber");
        System.out.println("5-Táxi");
        System.out.println("6-Carro");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção (1-6)");
        opcaoTransporte = scanner.nextInt();
        
        while (opcaoTransporte < 1 || opcaoTransporte > 6) {
          System.out.print("Opção Inválida, Tente Novamente: ");
          opcaoTransporte = scanner.nextInt();          
        }
        
        switch (opcaoTransporte) {
            case 1:
                 meioTransporte = "Metrô";break;
            case 2:
                 meioTransporte = "Ônibus";break;
            case 3:
                 meioTransporte = "Caminhada";break;
            case 4:
                 meioTransporte = "Uber";break;
            case 5:
                 meioTransporte = "Táxi";break;
            case 6:
                 meioTransporte = "Carro";break;
        }
        
        // Task de amanhã: salvar os dados no arquivo.txt.
        // Task no GitHub (git e github)
        System.out.println("-----------------------------");
        System.out.println("Nome: "+nome+"\nMeio de Transporte: "+meioTransporte);
        System.out.println("-----------------------------");
       
        try(BufferedWriter escritor = new BufferedWriter(
                new OutputStreamWriter(
                    new FileOutputStream("dados.txt", true), StandardCharsets.UTF_8))){

                    escritor.write(nome+","+meioTransporte+"\n");
                    System.out.println("Dados gravados com sucesso");

        }catch (IOException e){
           System.out.println("Erro ao gravar os dados"+e.getMessage());
        }
        System.out.println("Você digitou: " + nome);
     }
}