package desafioconversa;

import java.util.ArrayList;

public class PessoaFeliz extends Pessoa{
    
    public PessoaFeliz(String Nome, int Idade, String Humor) {
        super(Nome, Idade, Humor);
        bancohumores = new ArrayList<>();
        bancohumores.add("feliz");
        bancohumores.add("contente");
        bancohumores.add("satisfeito");
        bancohumores.add("alegre");
        bancohumores.add("eufórico");
        bancohumores.add("legal");
    }
    
    @Override
    protected void Saudacao() {
        System.out.println("Olá!!! Como vai???");
    }
    
    ArrayList<String> bancohumores;
}
