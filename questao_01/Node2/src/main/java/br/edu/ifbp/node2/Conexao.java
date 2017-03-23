/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifbp.node2;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author Laerton_note
 */
public class Conexao implements Iconex{
    private IPessoa pessoa ;

    public IPessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(IPessoa pessoa) {
        this.pessoa = pessoa;
    }
    @Override
    public void recebePessoa() throws RemoteException {
        try {
            pessoa = (IPessoa) Naming.lookup("Pessoa");
            
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }

    @Override
    public void enviaPessoa(IPessoa pessoa) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
