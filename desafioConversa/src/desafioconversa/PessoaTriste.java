package desafioconversa;

import java.util.ArrayList;

public class PessoaTriste extends Pessoa{
    
    public PessoaTriste(String Nome, int Idade, String Humor) {
        super(Nome, Idade, Humor);
        bancohumores = new ArrayList<>();
        bancohumores.add("triste");
        bancohumores.add("pra baixo");
        bancohumores.add("cansado");
        bancohumores.add("depressivo");
        bancohumores.add("nada bem");
        bancohumores.add("chateado");
    }
    
    @Override
    protected void Saudacao() {
        System.out.println("Opa...");
    }
    
    ArrayList<String> bancohumores;
}
