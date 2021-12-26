public class contaCorrente extends Conta{

    public contaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        imprimirInformacoes();
    }
}
