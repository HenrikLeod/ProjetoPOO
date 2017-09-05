/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifal.poo912;

/**
 * @author Carlos Henrique Barbosa
 * @author Danielly Gomes de Melo
 */

public class Produto {
    
    //atributos
    private String nome;
    private String unidade;
    private String local;
    private int    quantidade;
    private double preço;
    
    //getters e setters
    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String str)
    {
        this.nome = str;
    }
    
    public String getUnidade()
    {
        return this.unidade;
    }
    public void setUnidade(String str)
    {
        this.unidade = str;
    }
    
    public String getLocal()
    {
        return this.local;
    }
    public void setLocal(String str)
    {
        this.local = str;
    }
    
    public int getQuantidade()
    {
        return this.quantidade;
    }
    public void setQuantidade(int integer)
    {
        this.quantidade = integer;
    }
    
    public double getPreço()
    {
        return this.preço;
    }
    public void setPreço(double db)
    {
        this.preço = db;
    }
    
  
}
