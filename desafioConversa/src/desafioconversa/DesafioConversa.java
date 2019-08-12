package desafioconversa;

public class DesafioConversa {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("João", 20, "Feliz");
        Pessoa pessoa2 = new Pessoa("Gustavo", 22, "Triste");
        Pessoa pessoa3 = new Pessoa("Eliana", 19, "Precisando ir no banheiro");
        
        pessoa1.Saudacao();
        pessoa1.Apresentacao();
        pessoa1.Sentimento();
        
        pessoa2.Saudacao();
        pessoa2.Apresentacao();
        pessoa2.Sentimento();
        
        pessoa3.Saudacao();
        pessoa3.Apresentacao();
        pessoa3.Sentimento();
    }
}
