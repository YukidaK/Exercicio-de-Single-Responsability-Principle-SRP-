
/**
 * 
 */
public class ContaConjunta implements Conta
{
    private double saldo;
    private Cliente cliente;
    private Desconto desconto;
    
    public ContaConjunta(Cliente cliente, Desconto desconto){
        this.cliente = cliente;       
        this.desconto = desconto;
    }
    
    public boolean saque(double valorSaque){
        if(getSaldo() < valorSaque){
            return false;
        }
        else {
            saldo = saldo - valorSaque;
            return true;
        }
    }
    
    public double deposita(double valorDepositado){
        return saldo = saldo + valorDepositado;
    }
    
    public double getSaldo(){
        return desconto.desconto(saldo);
    }
}
