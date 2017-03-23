/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifbp.node2;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;

/**
 *
 * @author Laerton_note
 */
public class mainServidor {
    public static void main(String[] args) {
        try {
            System.setSecurityManager(new RMISecurityManager());
            Conexao conexao = new Conexao();
            Naming.rebind("conexao", conexao);
            System.out.println(conexao.getPessoa().getNome());
        } catch (Exception e) {
        }
    }
}
