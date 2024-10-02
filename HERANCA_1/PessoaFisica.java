public class PessoaFisica extends Pessoa {


    private String cpf;

    public PessoaFisica(String nome, String cpf, String endereco, String email) {
        super(nome, endereco, email); // Chama o construtor da classe mãe
        this.cpf = cpf;
    }


    //getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

  //sobrescreve o metodo
    @Override
    public String status() {
        return super.status() + ", CPF: " + cpf;
    }
}
