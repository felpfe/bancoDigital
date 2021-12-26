public class Main {
    public static void main (String [] args){

        Cliente felipe = new Cliente();
        felipe.setNome("Felipe");

        Cliente carla = new Cliente();
        carla.setNome("Carla");

        Conta cc = new contaCorrente(felipe);
        Conta poupanca = new contaPoupanca(felipe);


        Conta cc2 = new contaCorrente(carla);
        Conta poupanca2 = new contaPoupanca(carla);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();

    }

}
