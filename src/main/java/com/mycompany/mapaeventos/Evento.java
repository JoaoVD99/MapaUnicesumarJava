/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapaeventos;

import java.util.*;

/**
 *
 * @author jvmga
 */
public class Evento {
    private String         nome;
    private String         data;
    private Double         valorUnico;
    private int            capacidadeMaxima;
    private List<Ingresso> ingressosVendidos;
    
    public Evento(){
        this.ingressosVendidos = new ArrayList<Ingresso>();
    }
        
    public void setNome( String nome ){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setData( String data ){
        this.data = data;
    }
    
    public String getData(){        
        return data;
    }
    
    public void setValorUnico( double valorUnico ){
        this.valorUnico = valorUnico;
    }
    
    public double getValorUnico(){
        return valorUnico;
    }
    
    public void setCapacidadeMaxima( int capacidadeMaxima ){
        this.capacidadeMaxima = capacidadeMaxima;
    }
    
    public int getCapacidadeMaxima(){
        return capacidadeMaxima;
    }
         
    public void setIngressosVendidos( List<Ingresso> ingresso ){
        this.ingressosVendidos = ingresso; 
    }
    
    public List<Ingresso> getIngressosVendidos(){
        return ingressosVendidos;
    }
    
    public boolean venderIngressos( Ingresso ingresso ){                
        boolean esgotado = false;
        if( ingressosVendidos.size() >= capacidadeMaxima ){
            System.out.println("ESGOTADO!!!!");
            esgotado = true;            
        } else {
            esgotado = false;
            
            ingressosVendidos.add( ingresso );
            System.out.println("  ");
            System.out.println("Obrigado e bom show!!!");
            System.out.println("++++++++++++++++++++++");           
        }
        return esgotado;               
    }
    
    public void ingressosVendidos(){
        System.out.println( ingressosVendidos.size() + " ingressos vendidos." );
    } 
}
