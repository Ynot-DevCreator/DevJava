import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class AppEscola { //PascalCasing
    // main
    // public = público
    // static = da classe
    // void = retorno vazio
    // main = principal
    // String args[] = parâmetro inicial
    public static void main(String args[]) throws Exception {
        //método principal
        //Classe objeto = new Construtor (parametros);
        int continuar;
        int fazfacul = 0;
        
        File file = new File("faculdade.txt");
        if (file.exists()) {
            Scanner fileReader = new Scanner(file);
            if (fileReader.hasNextInt()) {
                fazfacul = fileReader.nextInt();
                
            }
            fileReader.close();
        }
        
        do {
            
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Alunos Java----------");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Faz Faculdade (1-Sim 0-Não): ");
        int temFaculdade = scanner.nextInt();

        if (temFaculdade == 1) {
            fazfacul++;
            
        }
        
        while (temFaculdade > 1 || temFaculdade < 0) {
            System.out.print("Opção Inválida, Tente Novamente: ");
            temFaculdade = scanner.nextInt();
        }
        Aluno aluno = new Aluno(nome, idade, temFaculdade);
        
        System.out.println("-------------Aluno-------------");
        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Idade: "+aluno.getIdade());
        
        if (temFaculdade == 1) {
            System.out.println("Faculdade: Sim");

        }else if (temFaculdade == 0) {
            System.out.println("Faculdade: Não");
        }
        System.out.println("-------------------------------");
        System.out.print("Você quer Continuar(1-Sim 2-Não): ");
        continuar = scanner.nextInt();
        
        } while (continuar == 1);
        
        FileWriter escritor = new FileWriter("faculdade.txt");
        escritor.write("Fazem faculdade: "+ fazfacul);
        escritor.close();

        System.out.println("Programa finalizado. Quantidade salva no arquivo!");
        //Desafio
        /*
         * Implementar uma interface com usuário
         * Scanner. 
         */
    

        }
}
