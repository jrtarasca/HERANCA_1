public class Funcionario extends Pessoa {


    private String cpf;
    private double salario;



    public Funcionario(String nome, String cpf, String endereco, String email, double salario) {
        super(nome, endereco, email); // Chama o construtor da classe mãe
        this.cpf = cpf;
        this.salario = salario;
    }


    //getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    
    @Override
    public String status() {
        return super.status() + ", CPF: " + cpf + ", Salário: " + salario;
    }
}
