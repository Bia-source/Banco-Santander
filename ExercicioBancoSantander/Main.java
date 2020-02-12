package ExercicioBancoSantander;

public class Main {
    public static void main(String[] args) {
        Clientes clienteNovo = new Clientes(29137812,"Ferreira dos Santos", 273628763, 329423432);
        ContaCorrente cliente2 = new ContaCorrente("bia");
        System.out.println(cliente2.depositar(30));
        System.out.println(cliente2.sacar(10));
        System.out.println(cliente2.sacar(50));

       // System.out.println(clienteNovo.getContaCorrente().depositar(29));
       // System.out.println(clienteNovo.getContaPoupanca().recolherJuros());

    }
}
