/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minibanco;

/**
 *
 * @author Hanne
 */
public class MiniBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ContaCorrente minhaConta = new ContaCorrente(12345, 500);
    
    
    System.out.println("Numero da Conta: " +  minhaConta.obterNumero());
    System.out.println("Saldo: " + minhaConta.consultarSaldo());
    
    minhaConta.alterarLimite(1000);
    System.out.println("Limite: " + minhaConta.consultarLimite());
    System.out.println("Saldo Total: " + minhaConta.consultarSaldoTotal());
    
    minhaConta.depositar(300);
    System.out.println("Saldo após depósito: " + minhaConta.consultarSaldo());
    System.out.println("Saldo total após depósito: " + minhaConta.consultarSaldoTotal());
    
    if (minhaConta.sacar(1200)) {
        System.out.println("Saldo após saque: " + minhaConta.consultarSaldo());
        System.out.println("Saldo total após saque: " + minhaConta.consultarSaldoTotal());
        }
    else
            System.out.println("NÃ£o foi possÃ­vel realizar operaÃ§Ã£o. Saldo total disponÃ­vel Ã© de " + minhaConta.consultarSaldoTotal());
    
    if (minhaConta.sacar(700)) {
        System.out.println("Saldo total apÃ³s saque: " + minhaConta.consultarSaldoTotal());
        }
        else
        System.out.println("Não foi possível realizar operação. Saldo total disponível de " + minhaConta.consultarSaldoTotal());
        }
}//Fim da classe MainBanco