/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapaeventos;

/**
 *
 * @author jvmga
 */
public class Ingresso {
    private String nome;
    private long   cpf;
    private String nomeEvento;
  
    public void setNome( String nome ){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setCpf( long cpf ){
        this.cpf = cpf;
    }
    
    public long getCpf(){
        return cpf;
    }
    
    public void setNomeEvento( String nomeEvento ){
        this.nomeEvento = nomeEvento;
    }
    
    public String getNomeEvento(){
        return nomeEvento;
    }
       
    public void resumo( String nome, long registro, String evento, String data ){        
        System.out.println(" ___________________________________________________ ");
        System.out.println("Comprador " + nome );
        System.out.println("Portador do CPF " + Long.toString( registro ) );
        System.out.println("Para o evento " + evento );
        System.out.println("No dia " + data );
    } 
            
    public void imprimirValor( double valor, String local ){
        System.out.println(" ___________________________________________________ ");
        System.out.println("O preço do ingresso é R$ " + String.format("$%,.2f", valor ) );
        System.out.println("Para ala " + local );
    }    
}
