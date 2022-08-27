import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Conta minhaConta;
        minhaConta = new Conta();
        ////
        Conta netoConta;
        netoConta = new Conta();

        Conta ThiagoMane;
        ThiagoMane = new Conta();

        ThiagoMane.numero = 0003;
        ThiagoMane.titular = "Thiago Mané";
        ThiagoMane.saldo = 0.24;

        minhaConta.numero = 0001;
        minhaConta.titular = "Antonio";
        minhaConta.saldo = 2600.36;
        
        netoConta.numero = 0002;
        netoConta.titular = "Neto";
        netoConta.saldo = 600.00;
        
        System.out.printf("Titular.: %s\nSaldo  .: R$%.2f\n", minhaConta.titular, minhaConta.saldo);
        
        minhaConta.transfere(netoConta, 100);
        //minhaConta.saca(1000.00);
        System.out.println(" ");
        System.out.printf("Titular.: %s\nSaldo  .: R$%.2f\n", netoConta.titular, netoConta.saldo);
  }
}

