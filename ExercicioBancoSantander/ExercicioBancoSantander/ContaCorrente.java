package ExercicioBancoSantander;

public class ContaCorrente extends Contas {
    private double chequeEspecial = 1000;
    private String cliente;
     public  ContaCorrente (String cliente){
         this.cliente = cliente;
     }





    public void depositarCheque(double valorDoCheque, String bancoEmissor, int dataPagamento){
        this.setSaldo(getSaldo() + valorDoCheque) ;
    }

    public double depositar(int valorDepositado ){
        System.out.println("Deposito realizado com sucesso!");
        setSaldo(valorDepositado + getSaldo());
        return getSaldo();
    }

    public double sacar(int valorSacado) {
        if (valorSacado > getSaldo()) {
            if(valorSacado>chequeEspecial){
                System.out.println("Transação nao autorizada");
                return 0;
            }
            System.out.println("Saldo insuficiente");
            System.out.println("Entrando no cheque especial");
            chequeEspecial = chequeEspecial - (valorSacado - getSaldo());
            System.out.println("Saldo do cheque especial " + chequeEspecial);



        } else {
            System.out.println("Saque efetuado com sucesso!" );
             setSaldo( getSaldo() - valorSacado);
        }

        return getSaldo();
    }
}

