public class Poupanca extends Conta {
  private float taxaJuro;

  @Override
  public float consultaSaldo(){
    return this.getSaldo();
  }
  @Override
  public void realizaSaque(float valor){
    if(this.getSaldo()<valor){
      System.out.println("Valor do Saldo insuficiente para saque de "+valor);
      System.out.println("Saldo: " + this.getSaldo());
    }else{
      this.setSaldo((getSaldo()-valor));
      System.out.println("Saque de R$" + valor + " realizado");
      System.out.println("Restante na conta: " + this.getSaldo());
    }
  }
  @Override
  public void realizaDeposito(float valor){
    if(valor<=0){
      System.out.println("ERRO, valor invalido");
    }else{
      this.setSaldo((this.getSaldo()+valor));
      System.out.println("Deposito de " + valor + " realizado");
      System.out.println("Saldo: " +this.getSaldo());
    }
  }
  public float geTaxaJuro(){
    return this.taxaJuro;
  }
  public void setTaxaJuro(float taxaJuro){
    this.taxaJuro = taxaJuro;
  }
}