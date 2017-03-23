/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifbp.node1;

/**
 *
 * @author Laerton_note
 */

public class Pessoa implements IPessoa {
    private String CPF, nome;

    @Override
    public String getCPF() {
        return CPF;
    }

    @Override
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }

    public Pessoa(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }
    
}
