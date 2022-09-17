package br.unipar.trabalhobimestral.models.pessoa;

import br.unipar.trabalhobimestral.models.pessoa.endereco.Endereco;

public class MedicoVeterinario extends Pessoa {

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
        return "MedicoVeterinario{" + "crmv=" + crmv + "Pessoa{" + "id=" + super.getId() + ", nome=" + super.getNome() + ", cpf=" + super.getCpf() + ", rg=" + super.getRg() + ",\nendereco=" + super.getEndereco() + ", \ndataNasc=" + super.getDataNasc() + ", contato=" + super.getContato() + '}';
    }

}
