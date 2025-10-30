**SCRIPT BASICO - VERSÃO INICIAL**

public class Conta {
      
      private double saldo;
      private Cliente cliente;
      
      public Conta(Cliente cliente) {
            this.cliente = cliente;
      }

      public boolean saca(double valorDoSaque){
            if(getSaldo() < valorDoSaque){
                  return false;
            } else {
                  saldo = saldo - valorDoSaque;
                  return true;
            }
      }

      public void deposita(double valorDepositado){
            saldo = saldo + valorDepositado;
      }
            
      public double getSaldo() {
            
            if(this.cliente.getTipoConta() == TiposConta.CONJUNTA) {
                  
                  return descontoDezPorcento(this.saldo);
                  
            }else if (this.cliente.getTipoConta() == TiposConta.CORRENTE) {
                  
                  return descontoVintePorcento(this.saldo);
                  
            }else if (this.cliente.getTipoConta() == TiposConta.EMPRESARIAL) {
                  
                  return descontoTrintaPorcento(this.saldo);
                  
            }else if (this.cliente.getTipoConta() == TiposConta.ESTUDANTE) {
                  
                  return descontoCincoPorcento(this.saldo);
            }else {
                  
                  throw new RuntimeException("tipo de conta inválida");
            }
            
      }
      
      private double descontoCincoPorcento(double valor) {
            return valor - ( valor * 0.05 );
      }
      
      private double descontoDezPorcento(double valor) {
            return valor - ( valor * 0.1 );
      }
      
      private double descontoVintePorcento(double valor) {
            return valor - ( valor * 0.2 );
      }
      
      private double descontoTrintaPorcento(double valor) {
            return valor - ( valor * 0.3 );
      }

}
