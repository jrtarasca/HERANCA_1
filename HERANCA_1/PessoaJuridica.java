public class PessoaJuridica extends Pessoa {


    private String cnpj;

    public PessoaJuridica(String nome, String cnpj, String endereco, String email) {
        super(nome, endereco, email); // Chama o construtor da classe mãe
        this.cnpj = cnpj;
    }


    //getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    //Sobscreve o metódo 
    @Override
    public String status() {
        return super.status() + ", CNPJ: " + cnpj;
    }
}
