
/**
 */
public class Main
{
    public static void main (String[] args){
        /**
         * Criando as contas com seus respectivos descontos
         */
        Conta contaConjunta = new ContaConjunta(new Cliente("Henrique do Santos"), new DescontoCincoPorcento());
        contaConjunta.deposita(2000);
        
        Conta contaCorrente = new ContaCorrente(new Cliente("Alexandre Dias"), new DescontoVintePorcento());
        contaCorrente.deposita(4000);
        
        Conta contaEmpresarial = new ContaEmpresarial(new Cliente("Jozé Costa"), new DescontoDezPorcento());
        contaEmpresarial.deposita(10000);
        
        Conta contaEstudante = new ContaEstudante(new Cliente("Elizabet Santine"), new DescontoTrintaPorcento());
        contaEstudante.deposita(1200);
        
        
        /**
         * Mostrando o saldo de todas as contas
         */
        System.out.println("Saldo da Conta Conjunta: " + contaConjunta.getSaldo());
        System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da Conta Empresarial: " + contaEmpresarial.getSaldo());
        System.out.println("Saldo da Conta Estudante: " + contaEstudante.getSaldo());
    }
}
