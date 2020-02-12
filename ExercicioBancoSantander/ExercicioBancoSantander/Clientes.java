package ExercicioBancoSantander;

public class Clientes  {
    private int numeroCliente;
    private String sobrenome;
    private double rg;
    private double cpf;
    private ContaCorrente contaCorrente ;
    private ContaPoupanca contaPoupanca;

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public Clientes(int numeroCliente, String sobrenome, int rg, int cpf) {
        this.numeroCliente = numeroCliente;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }


}
