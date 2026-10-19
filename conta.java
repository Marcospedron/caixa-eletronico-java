/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixa;

/**
 *
 * @author user
 */
public class conta {
    private double saldo;
    private int numero;
        
    
 public conta(int numero) {
 this.saldo = 0;
 this.numero = numero;
    
 }
    
   public double getSaldo() {
   return this.saldo;
   }
   
   public int getNumero() {
   return this.numero;
   }
   
   public boolean depositar(double valor) {
   if(valor > 0) {
   this.saldo += valor;
   return true;
   } else {
   return false;
   }
   }
   
   public boolean sacar(double valor) {
   if(this.saldo - valor >=0 && valor > 0) {
   this.saldo -= valor;
   return true;
   } else {
   System.out.println("Valor invalido");
   return false;
   }
   }
   
   
   
}
