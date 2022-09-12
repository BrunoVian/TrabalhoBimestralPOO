/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipar.trabalhobimestral.models.pessoa;

import java.util.Date;

/**
 *
 * @author bruno
 */
public class Proprietario extends Pessoa{

    public Proprietario(Integer id, String nome, String cpf, String rg, Endereco endereco, String dataNasc, Contato contato) {
        super(id, nome, cpf, rg, endereco, dataNasc, contato);
    }

    public Proprietario() {
    }

  
    
}
