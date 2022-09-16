/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipar.trabalhobimestral.models.pessoa;

import br.unipar.trabalhobimestral.models.Animal;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Proprietario extends Pessoa{
    
    private ArrayList<Animal> animal = new ArrayList<>(); 

    public Proprietario(Integer id, String nome, String cpf, String rg, Endereco endereco, String dataNasc, Contato contato) {
        super(id, nome, cpf, rg, endereco, dataNasc, contato);
    }

    public Proprietario() {
    }

    public ArrayList<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(ArrayList<Animal> animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Proprietario{" + "animal=" + animal + "Pessoa{" + "id=" + super.getId() + ", nome=" + super.getNome() + ", cpf=" + super.getCpf() + ", rg=" + super.getRg() + ",\nendereco=" + super.getEndereco() + ", \ndataNasc=" + super.getDataNasc() + ", contato=" + super.getContato() + '}';
    }

}
