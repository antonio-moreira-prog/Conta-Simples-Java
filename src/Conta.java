class Conta{
  int numero;
  Cliente titular;
  double saldo;
  Endereco endereco;
  

  /*void saca(double quantidade){
    double novoSaldo = this.saldo - quantidade;
    this.saldo = novoSaldo;
    String mensagemSaque = "=-=-=-=- SAQUE REALIZADO =-=-=-=-";
    System.out.println(mensagemSaque);
    System.out.printf("Saldo  .: R$%.2f", this.saldo);
  }*/
  boolean saca(double valor){
    if(this.saldo < valor){
      return false;
    }else {
      this.saldo = this.saldo - valor;
      return true;
    }
  }

  void deposita(double quantidade){
    this.saldo += quantidade;
  }

  /*void transfere(Conta destino, double valor){
    this.saldo = this.saldo - valor;
    destino.saldo = destino.saldo + valor;
    String mensagemTransferencia = "=-=-=-=- TRANSFERÊNCIA REALIZADO =-=-=-=-";
    System.out.println(mensagemTransferencia);
    System.out.printf("Saldo  .: R$%.2f", this.saldo);
  }*/

  boolean transfere(Conta destino, double valor){
    boolean retirou = this.saca(valor);
    if(retirou == false){
      return false;
    }else{
      destino.deposita(valor);
      return true;
    }
  }
}