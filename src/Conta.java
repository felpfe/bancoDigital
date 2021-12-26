public abstract class Conta implements iConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static int agencia_padrao = 1;
    private static int sequencial = 1;

    public Conta(Cliente cliente){
    this.agencia = Conta.agencia_padrao;
    this.numero = sequencial++;
    this.cliente = cliente;
}
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void imprimirInformacoes(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: $d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
    saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
