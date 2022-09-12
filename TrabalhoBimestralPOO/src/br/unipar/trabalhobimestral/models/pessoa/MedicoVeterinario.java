/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipar.trabalhobimestral.models.pessoa;



/**
 *
 * @author bruno
 */
public class MedicoVeterinario extends Pessoa{
    private String crmv;

    public MedicoVeterinario(String crmv, Integer id, String nome, String cpf, String rg, Endereco endereco, String dataNasc, Contato contato) {
        super(id, nome, cpf, rg, endereco, dataNasc, contato);
        this.crmv = crmv;
    }

    public MedicoVeterinario(String crmv) {
        this.crmv = crmv;
    }

    public MedicoVeterinario() {
    }
   

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    @Override
    public String toString() {
        return "MedicoVeterinario{" + "crmv=" + crmv + "Pessoa{" + "id=" + super.getId() + ", nome=" + super.getNome() + ", cpf=" + super.getCpf() + ", rg=" + super.getRg() + ", endereco=" + super.getEndereco() + ", dataNasc=" + super.getDataNasc() + ", contato=" + super.getContato() + '}';
    }

    
    
}
