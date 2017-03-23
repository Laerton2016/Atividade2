/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifbp.node2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Laerton_note
 */
public interface Iconex  extends Remote{
    void recebePessoa () throws RemoteException;
    void enviaPessoa(IPessoa pessoa) throws RemoteException;
    
}
