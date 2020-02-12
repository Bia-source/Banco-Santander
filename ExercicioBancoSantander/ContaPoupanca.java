package ExercicioBancoSantander;

public class ContaPoupanca  extends Contas{
  private double rendimento;
  private double saldo;
  private String cliente ;
  public ContaPoupanca(String cliente) {
    this.cliente = cliente;
  }

  public double recolherJuros (){
     rendimento = saldo + (saldo * 20/100);
    return rendimento;
  }

}
