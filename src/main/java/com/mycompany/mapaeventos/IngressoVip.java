/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapaeventos;

/**
 *
 * @author jvmga
 */
public class IngressoVip extends Ingresso {
    public double calculaValorIngresso( double valorUnico ){
        double valorSomar = valorUnico * 0.3;
        double valorTotal = valorSomar + valorUnico;
        
        return valorTotal;
    }
    
}
