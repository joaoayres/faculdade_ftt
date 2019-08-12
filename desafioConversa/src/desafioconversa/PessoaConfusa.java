package desafioconversa;

import java.util.ArrayList;

public class PessoaConfusa extends Pessoa {
    
    public PessoaConfusa(String Nome, int Idade, String Humor) {
        super(Nome, Idade, Humor);
        bancohumores = new ArrayList<>();
        bancohumores.add("confuso");
        bancohumores.add("meio estranho");
        bancohumores.add("esquisito");
        bancohumores.add("diferente");
        bancohumores.add("que tô off");
        bancohumores.add("nada a ver");
    }
    
    @Override
    protected void Saudacao() {
        System.out.println("Você é...?");
    }
    
    ArrayList<String> bancohumores;
}
