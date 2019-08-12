package desafioconversa;

import java.util.ArrayList;

public class Pessoa {

    //informações
    String Nome;
    int Idade;
    String Humor;

    ArrayList<String> banconomes;

    public Pessoa() {
        
        banconomes = new ArrayList<>();
        banconomes.add("João");
        banconomes.add("Igor");
        banconomes.add("Gustavo");
        banconomes.add("Rafael");
        banconomes.add("Roberta");
        banconomes.add("Eduarda");
        banconomes.add("Karol");
        banconomes.add("Cida");
    }

    public Pessoa(String Nome, int Idade, String Humor) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Humor = Humor;
    }

    protected void Saudacao() {
        System.out.println("Oi!");
    }

    protected void Apresentacao() {
        System.out.printf("Meu nome é " + Nome + ", tenho %s anos! ", Idade);
    }

    protected void Sentimento() {
        System.out.println("Hoje estou me sentindo " + Humor);
    }
}
