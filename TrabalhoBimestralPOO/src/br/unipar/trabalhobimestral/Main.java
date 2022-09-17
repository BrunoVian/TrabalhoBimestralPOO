package br.unipar.trabalhobimestral;

import br.unipar.trabalhobimestral.models.Animal;
import br.unipar.trabalhobimestral.models.BanhoTosa;
import br.unipar.trabalhobimestral.models.Consulta;
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
        System.out.println("Veterinário criado: " + felipeVet.toString());

        //Cadastrado Proprietário
        Endereco enderecoProp = new Endereco(1, "Av teste", 1234, "Teste", toledo, "85900000");
        Contato contatoProp = new Contato(1, "45000000000", "teste@edu.unipar.br");
        Proprietario joaoProp = new Proprietario(false, 1, "João Teste", "123456789", "987654321", enderecoProp, "Teste", contatoProp);
        System.out.println("\nProprietário criado: " + joaoProp.toString());

        //Cadastrado Animais
        Animal dog = new Animal(1, "Auau", "Macho", 12.80, joaoProp);
        System.out.println("\nAnimais: " + dog.toString());
        Animal cat = new Animal(2, "Mimi", "Femea", 8.00, joaoProp);
        System.out.println(cat.toString());

        //Cadastrado vacina
        Vacina vacina1 = new Vacina(1, "Vacina 01", 5, "AAABBB");

        //Informada Vacinação do Dog
        Vacinacao vacinacaoDog = new Vacinacao();
        vacinacaoDog.setAnimal(dog);
        vacinacaoDog.setVacina(vacina1);
        vacinacaoDog.setDataVacina("20/08/2022");

        //Cadastrado medicamento
        Medicamento medicamento1 = new Medicamento(1, "Agrovet", "15/08/2025", 50.00);
        Medicamento medicamento2 = new Medicamento(2, "Piroxicam", "30/08/2023", 50.00);
        Medicamento medicamento3 = new Medicamento(3, "Diclofenaco", "06/06/2028", 50.0);

        //Cadastado Exames
        Exame exame1 = new Exame(1, "Raio X", 50.00);
        Exame exame2 = new Exame(1, "Ressonancia", 50.00);

        //Consulta + calculo de valor
        Consulta consultaDog = new Consulta();
        consultaDog.setId(1);
        consultaDog.setAnimal(dog);
        consultaDog.getListaExame().add(exame1);
        consultaDog.getListaExame().add(exame2);
        consultaDog.getListaMedicamento().add(medicamento1);
        consultaDog.setVlrConsulta(150.00);
        System.out.println("\nConsulta: " + consultaDog.toString());
        consultaDog.calculaValorConsulta();

        //Cadastrado Banho e Tosa
        BanhoTosa banhoTosaCat = new BanhoTosa(1, cat, "17/09/2022", "");
        System.out.println("\nBanho Tosa: " + banhoTosaCat.toString() + banhoTosaCat.AgendadoBanhoTosa());
        BanhoTosa banhoTosaDog = new BanhoTosa(1, dog, "15/09/2022", "25/09/2022");
        System.out.println("\nBanho Tosa: " + banhoTosaDog.toString() + banhoTosaDog.AgendadoBanhoTosa());

    }
}
