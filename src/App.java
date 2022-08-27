
class App{
  public static void main(String[] args) {
    System.out.println("\n");
    Conta minhaConta;
    minhaConta = new Conta();
    ////
    Conta contaCliente;
    contaCliente = new Conta();

    Cliente cliente1 = new Cliente();
    minhaConta.titular = cliente1;

    Cliente cliente2 = new Cliente();
    contaCliente.titular = cliente2;
    
    minhaConta.titular.nome = "Antonio";
    contaCliente.titular.nome = "Jorge";

    Endereco enderecoCliente1 = new Endereco();
    minhaConta.endereco = enderecoCliente1;

    Endereco enderecoCliente2 = new Endereco();
    contaCliente.endereco = enderecoCliente2;
    
    minhaConta.endereco.cidade = "Parnaiba";
    contaCliente.endereco.cidade = "Cocal";

    minhaConta.numero = 0001;
    minhaConta.saldo = 2600.36;
    
    contaCliente.numero = 0002;
    contaCliente.saldo = 600.00;
    
    System.out.println("\n");
    System.out.printf("Titular.: %s\nSaldo  .: R$%.2f\nCidade.: %s", minhaConta.titular.nome, minhaConta.saldo, minhaConta.endereco.cidade);
    
    minhaConta.transfere(contaCliente, 100);
    
    System.out.println("\n");
    System.out.println(" ");
    System.out.printf("Titular.: %s\nSaldo  .: R$%.2f\nCidade.: %s", contaCliente.titular.nome, contaCliente.saldo, contaCliente.endereco.cidade);
  }
}
