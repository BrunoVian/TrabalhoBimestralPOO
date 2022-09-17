package br.unipar.trabalhobimestral;

import br.unipar.trabalhobimestral.models.Animal;
import br.unipar.trabalhobimestral.models.Exame;
import br.unipar.trabalhobimestral.models.Medicamento;
import br.unipar.trabalhobimestral.models.Vacina;
import br.unipar.trabalhobimestral.models.Vacinacao;
import br.unipar.trabalhobimestral.models.pessoa.endereco.Cidade;
import br.unipar.trabalhobimestral.models.pessoa.Contato;
import br.unipar.trabalhobimestral.models.pessoa.endereco.Endereco;
import br.unipar.trabalhobimestral.models.pessoa.endereco.Estado;
import br.unipar.trabalhobimestral.models.pessoa.MedicoVeterinario;
import br.unipar.trabalhobimestral.models.pessoa.endereco.Pais;
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
        Proprietario joaoProp = new Proprietario(1, "João Teste", "123456789", "987654321", enderecoProp, "Teste", contatoProp);

        //Cadastrado Animal
        Animal dog = new Animal();
        dog.setNome("AuAu");
        dog.setSexo("Macho");

        Animal cat = new Animal();
        cat.setNome("Mimi");
        cat.setSexo("Femea");

        //Cadastrado vacina
        Vacina vacina1 = new Vacina("Vacina 01", 5, "AAABBB");

        //Informada Vacinação do Dog
        Vacinacao vacinacaoDog = new Vacinacao();
        vacinacaoDog.setAnimal(dog);
        vacinacaoDog.setVacina(vacina1);
        vacinacaoDog.setDataVacina("20/08/2022");

        //Vinculado animal ao proprietario
        joaoProp.getAnimal().add(dog);
        joaoProp.getAnimal().add(cat);

        //Cadastrado medicamento
        Medicamento medicamento1 = new Medicamento("Agrovet", "15/08/2025", 50.00);
        Medicamento medicamento2 = new Medicamento("Piroxicam", "30/08/2023", 25.50);
        Medicamento medicamento3 = new Medicamento("Diclofenaco", "06/06/2028", 25.50);

        //Cadastado Exames
        Exame exame1 = new Exame("Raio X", 80.00);
        Exame exame2 = new Exame("Ressonancia", 120.00);
        
        System.out.println("Veterinário criado: " + felipeVet.toString());
        System.out.println("\nProprietário criado: " + joaoProp.toString());

    }
}
