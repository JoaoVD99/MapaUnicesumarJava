/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mapaeventos;

import java.util.Scanner;

/**
 *
 * @author jvmga
 */
public class MAPAEventos {

    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("Ticket Venda");
        System.out.println("Seu sistema de compra de ingresso");
        System.out.println("====================================================");
        
        Scanner scan = new Scanner( System.in );
        boolean repete = true;
        
        //Instância evento
        Evento evento = new Evento();
        evento.setNome("banda Metalico");
        evento.setData("10/10/2022 às 20h");
        evento.setValorUnico(300.55);
        evento.setCapacidadeMaxima(10);
        
        //Intância ingresso
        Ingresso ingresso = new Ingresso();
        
        //Intância classes de ingressos
        IngressoPista ingressoPista       = new IngressoPista();
        IngressoVip ingressoVip           = new IngressoVip();
        IngressoCamarote ingressoCamarote = new IngressoCamarote();
        
        do {            
            System.out.println("Deseja ver eventos ?");
            System.out.println("1.Ver eventos");
            System.out.println("0.Sair");

            int escolha = scan.nextInt();
            
            if( escolha == 1 ){//Verifica caso queria ir para evento: 
                System.out.println("  ");
                System.out.println("O evento é para " + evento.getNome() );
                System.out.println("No dia " + evento.getData());
                System.out.println("Com o valor de R$ " + evento.getValorUnico() );
                System.out.println("CAPACIDADE MÀXIMA: " + evento.getCapacidadeMaxima() );
                System.out.println("  ");
                System.out.println("Deseja prosseguir com a compra?");
                System.out.println("1.Sim");
                System.out.println("0.Não");
                
                int comprarIngresso = scan.nextInt();
                if( comprarIngresso == 1 ){//Caso o usuário escolha prosseguir com a compra.
                    System.out.println("Digite aqui seu nome: ");
                    ingresso.setNome( scan.next() );
                    System.out.println("Digite aqui seu CPF( somente números ): ");
                    ingresso.setCpf( scan.nextLong());
                    System.out.println("Deseja comprar ingresso para: " + evento.getNome() );
                    System.out.println("1.Confirma");
                    System.out.println("0.Não");
                    
                    int confirma = scan.nextInt();
                    
                    if( confirma == 1 ){//Caso o usuário for prosseguir com a compra.
                        ingresso.setNomeEvento( evento.getNome());
                        System.out.println("Qual ingresso deseja comprar ? ");
                        System.out.println("1.Pista");
                        System.out.println("2.VIP");
                        System.out.println("3.Camarote");
                        
                        double valorIngresso = evento.getValorUnico();
                        String nomeIngresso = null;
                        //Depois de verificar qual a ala que o usuário vai ficar é calculado o valor do ingresso.
                        //Através de classes filhas da classe Ingresso.
                        int tipoIngresso = scan.nextInt();
                        switch ( tipoIngresso ) {
                            case 1:
                                valorIngresso = ingressoPista.calculaValorIngresso( evento.getValorUnico() );
                                nomeIngresso = "Pista";
                                break;
                            case 2:
                                valorIngresso = ingressoVip.calculaValorIngresso( evento.getValorUnico() );                                
                                nomeIngresso = "VIP";
                                break;
                            case 3:
                                valorIngresso = ingressoCamarote.calculaValorIngresso( evento.getValorUnico() );
                                nomeIngresso = "Camarote";
                        }
                        ingresso.resumo( ingresso.getNome(), ingresso.getCpf(), evento.getNome(), evento.getData() );
                        ingresso.imprimirValor( valorIngresso, nomeIngresso );//É impresso um resumo com os dados e valor do ingresso.
                        
                        System.out.println("  ");
                        System.out.println("Deseja confirmar a compra ? ");
                        System.out.println("1.Confirmar");
                        System.out.println("0.Sair");
                        
                        int confirmaCompra = scan.nextInt();
                        
                        if( confirmaCompra == 1 ){//Adiciona o ingresso na lista
                            boolean esgotado = evento.venderIngressos( ingresso );
                            if( esgotado )//Caso a lista ultrapassar a quantidade printa ESGOTADO não adicionando na lista e saindo do if.
                                break;
                            
                            evento.ingressosVendidos();                            
                        } 
                    }
                }           
            } else {
                if( escolha == 0 ){
                    repete = false;
                } else {
                    System.out.println("Escolha errada, tente novamente!!!");
                }
            }

        } while ( repete );
        System.out.println("Muito obrigado pela escolha!!!"); 
        System.out.println("====================================================");
    }
}
