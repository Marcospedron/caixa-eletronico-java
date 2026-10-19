/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caixa;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class CAIXA {

    public static void main(String[] args) {
        
        Scanner le = new Scanner(System.in);
        
        int x;
        
        conta m = new conta(22052006);
        
        ArrayList<String> extratos = new ArrayList<>();
        
        do{
        System.out.println("Caixa Eletronico");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Extrato");
        System.out.println("0 - Sair");
        
        x = le.nextInt();
        
        
        switch (x) {
            case 1:
             System.out.printf("%.2f%n", m.getSaldo());
             break;
            case 2: 
             System.out.printf("Valor do deposito: %n");
             double j = le.nextDouble();
              if(m.depositar(j)){
            extratos.add(String.format("Deposito: R$ %.2f   // Saldo: R$ %.2f", j, m.getSaldo()));
             } else {
             System.out.println("Operacao Mal Sucedida");
             }
            break;    
            case 3: 
             System.out.printf("Valor do saque: %n");
             double n = le.nextDouble();
             if(m.sacar(n)){
             extratos.add(String.format("Saque: R$ %.2f   // Saldo: R$ %.2f", n, m.getSaldo()));
             } else {
             System.out.println("Operacao Mal Sucedida");
             }
            break; 
            case 4:
                if(extratos.isEmpty()) {
                System.out.printf("Nenhuma operacao feita%n " );
                break;
                }
               System.out.println("Numero da conta: " + m.getNumero());
               for(String ns: extratos) {
               System.out.println(ns); 
               
               }
               System.out.printf("Saldo Atual : %.2f%n", m.getSaldo());
            break;
            
        }
        } while(x != 0);
        
        
        
    }
    
    
}
