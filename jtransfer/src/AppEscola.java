import java.util.Scanner;

public class AppEscola { //PascalCasing
    // main
    // public = público
    // static = da classe
    // void = retorno vazio
    // main = principal
    // String args [] = parâmetro inicial
    public static void main(String args[]) throws Exception {
        //método principal
        //Classe objeto = new Construtor (parametros);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Faz Faculdade (1-Sim 0-Não): ");
        int temFaculdade = scanner.nextInt();

        Aluno aluno = new Aluno(nome, idade, temFaculdade);
        
        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Idade: "+aluno.getIdade());
        
        if (temFaculdade == 1) {
            System.out.print("Faculdade: Sim");

        }else if (temFaculdade == 0) {
            System.out.print("Faculdade: Não");
        } 
        //Desafio
        /*
         * Implementar uma interface com usuário
         * Scanner. 
         */
    

        }
}
