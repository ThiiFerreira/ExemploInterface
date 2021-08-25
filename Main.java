class Main {
  public static void main(String[] args) {
  //exemplo conta corrente
  Corrente c = new Corrente();
    c.setId(1);
    c.setNumero("123456-7");
    c.setSaldo(500f);
    c.setLimite(200f);
    
    System.out.println(c.consultaSaldo());
    c.realizaSaque(300f);//teste de saque permitido
    c.realizaSaque(800f);//teste de saque não permitido
    c.realizaDeposito(300f);//realizar deposito
    c.realizaDeposito(0f);//realizar deposito invalido
    
    //exemplo conta poupança
    Poupanca p = new Poupanca();
    p.setId(2);
    p.setNumero("123456-8");
    p.setSaldo(500f);
    p.setTaxaJuro(0.04f);
    
    p.realizaSaque(300f);//teste de saque permitido
    p.realizaSaque(800f);//teste de saque não permitido
    p.realizaDeposito(300f);//realizar deposito
    p.realizaDeposito(0f);//realizar deposito invalido
    
  }
}