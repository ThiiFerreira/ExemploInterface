public abstract class Conta implements IOperacoes {
  private int id;
  private String numero;
  private float saldo;

  public int getId(){
    return this.id;
  }
  public void setId(int id){
    this.id = id;
  }

  public String getNumero(){
    return this.numero;
  }
  public void setNumero(String numero){
    this.numero = numero;
  }

  public float getSaldo(){
    return this.saldo;
  }
  public void setSaldo(float saldo){
    this.saldo = saldo;
  }
} 