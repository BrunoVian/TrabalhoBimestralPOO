/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipar.trabalhobimestral.models.pessoa;

import br.unipar.trabalhobimestral.models.pessoa.endereco.Endereco;
import br.unipar.trabalhobimestral.models.Animal;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Proprietario extends Pessoa{
    
    private boolean clienteEspecial;

    public Proprietario(boolean clienteEspecial, Integer id, String nome, String cpf, String rg, Endereco endereco, String dataNasc, Contato contato) {
        super(id, nome, cpf, rg, endereco, dataNasc, contato);
        this.clienteEspecial = clienteEspecial;
    }

    public Proprietario(boolean clienteEspecial) {
        this.clienteEspecial = clienteEspecial;
    }
    
    public Proprietario() {
    }

    @Override
    public String toString() {
        return "Proprietario{"  + "clienteEspecial=" + clienteEspecial + '}' + "Pessoa{" + "id=" 
                + super.getId() + ", nome=" + super.getNome() + ", cpf=" 
                + super.getCpf() + ", rg=" + super.getRg() + ",\nendereco=" 
                + super.getEndereco() + ", \ndataNasc=" + super.getDataNasc() 
                + ", contato=" + super.getContato() + '}';
    }
    

    
}
