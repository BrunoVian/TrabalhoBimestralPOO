package br.unipar.trabalhobimestral;

import br.unipar.trabalhobimestral.models.Animal;
import br.unipar.trabalhobimestral.models.pessoa.Cidade;
import br.unipar.trabalhobimestral.models.pessoa.Contato;
import br.unipar.trabalhobimestral.models.pessoa.Endereco;
import br.unipar.trabalhobimestral.models.pessoa.Estado;
import br.unipar.trabalhobimestral.models.pessoa.MedicoVeterinario;
import br.unipar.trabalhobimestral.models.pessoa.Pais;
import br.unipar.trabalhobimestral.models.pessoa.Proprietario;

public class Main {

    public static void main(String[] args) {

        //Cadastrado Cidade, Estado e País
        Pais brasil = new Pais(1, "Brasil");
        Estado parana = new Estado(1, "Parana", brasil);
        Cidade toledo = new Cidade(1, "Toledo", parana);
        
        //Cadastrado Veterinário
        Endereco enderecoVet = new Endereco(1, "Av Teste", 123, "Ap000", toledo, "85900000");
        Contato contatoVet = new Contato(1, "45000000000", "felipe.leite@edu.unipar.br");
        MedicoVeterinario felipeVet = new MedicoVeterinario("1234", 1, "Felipe Leite", "1234567890", "987654321", enderecoVet, "01/01/01", contatoVet);
        
        //Cadastrado Proprietário
        Endereco enderecoProp = new Endereco(1, "Av teste", 1234, "Teste", toledo, "85900000");
        Contato contatoProp = new Contato(1, "45000000000", "teste@edu.unipar.br");
        Proprietario joaoProp = new Proprietario(1, "Teste", "123456789", "987654321", enderecoProp, "Teste", contatoProp);
        
        Animal dog = new Animal();
        dog.setNome("AuAu");
        
        joaoProp.getAnimal().add(dog);
        
        //Imprime dados
        System.out.println("Veterinário criado: " + felipeVet.toString());
        System.out.println("\nProprietário criado: " + joaoProp.toString());
        
        
        

    }

}
