/* Encapsulamento */
// public
// private
// protected
// package
public class Aluno {
    
    //variáveis = atributos
    //características
    private String nome; //atributo do tipo do Texto
    private int idade; // atributo do tipo Número
    private int temFaculdade; // atributo do tipo Booleano (0 e 1)
    public Aluno(){

    }
    public Aluno(String nome, int idade, int temFaculdade) {
        this.nome = nome;
        this.idade = idade;
        this.temFaculdade = temFaculdade;
    }

    public String getNome() { // método para pegar o nome
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() { // método para pegar a idade
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTemFaculdade() { // método para pegar a faculdade
        return temFaculdade;
    }

    public void setTemFaculdade(int temFaculdade) {
        this.temFaculdade = temFaculdade;
    }

    
    // classes Wrappers
    /*
     * Considerando a explicação do professor:
     * tipo primitivo x classes wrappers
     * 
     * Você tem que descobrir quantos alunos
     * tem faculdade (Sim ou Não)
     * temFaculdade
     * Sim/Não - 0 ou 1
     * Como declarar um atributo booleano?
     */ 
    
}



