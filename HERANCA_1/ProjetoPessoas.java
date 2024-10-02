public class ProjetoPessoas {

    public static void main(String[] args) {

        //instância e atribui os objetos Pessoas e Funcionário
        PessoaFisica cliente1 = new PessoaFisica("José", "111.111.111.111", "Rua alameda , 777", "jose@gmail.com");
        PessoaFisica cliente2 = new PessoaFisica("Marcelo", "999.999.999-00", "Rua rosas", "marcelo@gmail.com");
        


        PessoaJuridica empresa1 = new PessoaJuridica("Facens", "222.222.222/222-22", "Av. armando panunzio, 1000", "facens@gmail.com");
        PessoaJuridica empresa2 = new PessoaJuridica("Uniso", "222.222.222/2222-00", "Av. don aguirre , 1000", "uniso@gmail.com");
        


        Funcionario funcionario1 = new Funcionario("Emanuel", "333.333.333-33", "JD simus", "emanuel@gmail.com", 500.00);
        Funcionario funcionario2 = new Funcionario("Galli", "44444444444", "vila barão", "galli@gmail.com", 500.00);


        
        //mostra na tela as informacoes
        System.out.println("Clientes Pessoa Física:");
        System.out.println(cliente1.status());
        System.out.println(cliente2.status());

        System.out.println("\nClientes Pessoa Jurídica:");
        System.out.println(empresa1.status());
        System.out.println(empresa2.status());

        System.out.println("\nFuncionários:");
        System.out.println(funcionario1.status());
        System.out.println(funcionario2.status());
    }
}
