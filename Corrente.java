public class Corrente extends Conta{
  private float limite;

  @Override
  public float consultaSaldo(){
    return this.getSaldo() + this.limite;
  }
  @Override
  public void realizaSaque(float valor){
    if((this.getSaldo()+this.getLimite())<valor){
      System.out.println("Valor do Saldo+Limite insuficiente para saque de "+valor);
      System.out.println("Saldo+Limite: " +(this.getSaldo()+this.getLimite()));
    }else{
      this.setSaldo((getSaldo()-valor));
      System.out.println("Saque de " + valor + " realizado");
      System.out.println("Restante na conta: " + (this.getSaldo()+this.getLimite()));
    }
  }
  @Override
  public void realizaDeposito(float valor){
    if(valor<=0){
      System.out.println("ERRO, valor invalido");
    }else{
      this.setSaldo((this.getSaldo()+valor));
      System.out.println("Deposito de " + valor + " realizado");
      System.out.println("Saldo+Limite: " +(this.getSaldo()+this.getLimite()));
    }
  }
  
  public float getLimite(){
    return this.limite;
  }
  public void setLimite(float limite){
    this.limite = limite;
  }
}