package ExercicioBancoSantander;

public class Contas {
    private Clientes conta ;
    private double saldo ;

    private String cliente;

    public Contas(){

    }


    public double depositar(int valorDepositado ){
        System.out.println("Deposito realizado com sucesso!");
        saldo = valorDepositado + saldo;
        return saldo;
    }

    public double sacar(int valorSacado) {
        if (valorSacado > saldo) {
            System.out.println("Saldo insuficiente");

        } else {
            System.out.println("Saque efetuado com sucesso!" );
            saldo = saldo - valorSacado;
        }

      return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

