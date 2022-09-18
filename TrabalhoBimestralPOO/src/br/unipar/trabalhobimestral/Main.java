package br.unipar.trabalhobimestral;

import br.unipar.trabalhobimestral.models.Animal;
import br.unipar.trabalhobimestral.models.BanhoTosa;
import br.unipar.trabalhobimestral.models.Consulta;
import br.unipar.trabalhobimestral.models.Exame;
import br.unipar.trabalhobimestral.models.Medicamento;
import br.unipar.trabalhobimestral.models.PorteAnimalEnum;
import br.unipar.trabalhobimestral.models.Vacina;
import br.unipar.trabalhobimestral.models.Vacinacao;
import br.unipar.trabalhobimestral.models.VacinacaoAnimalEnum;
import br.unipar.trabalhobimestral.models.pessoa.endereco.Cidade;
import br.unipar.trabalhobimestral.models.pessoa.Contato;
import br.unipar.trabalhobimestral.models.pessoa.endereco.Endereco;
import br.unipar.trabalhobimestral.models.pessoa.endereco.Estado;
import br.unipar.trabalhobimestral.models.pessoa.MedicoVeterinario;
import br.unipar.trabalhobimestral.models.pessoa.endereco.Pais;
import br.unipar.trabalhobimestral.models.pessoa.Proprietario;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        //Cadastrado Cidade, Estado e País
        Pais brasil = new Pais(1, "Brasil");
        Estado parana = new Estado(1, "Parana", brasil);
        Cidade toledo = new Cidade(1, "Toledo", parana);

        System.out.println("Pessoas:");

        //Cadastrado Veterinário  
        Endereco enderecoVet = new Endereco(1, "Av Teste", 123, "Ap000", toledo, "85900000");
        Contato contatoVet = new Contato(1, "(45)99999-9999", "medico.vet@edu.unipar.br");
        MedicoVeterinario felipeVet = new MedicoVeterinario("1234", 1, "Felipe Leite", "123.456.789-00", "987654321", enderecoVet, "01/01/01", contatoVet);
        System.out.println("Veterinário criado:\n" + felipeVet.toString());

        //Cadastrado Proprietário
        Endereco enderecoProp = new Endereco(1, "Av teste", 321, "Teste", toledo, "85900000");
        Contato contatoProp = new Contato(1, "(45)98888-8888", "teste@edu.unipar.br");
        Proprietario joaoProp = new Proprietario(false, 1, "João Teste", "321.456.987-12", "987654321", enderecoProp, "Teste", contatoProp);
        System.out.println("\nProprietário criado:\n" + joaoProp.toString());
        System.out.println("\n----------------------------------------------");

        //Cadastrado Animais
        Animal dog = new Animal(1, "Auau", "Macho", 15.80, joaoProp, PorteAnimalEnum.MEDIO, VacinacaoAnimalEnum.EMDIA);
        System.out.println("\nAnimais:\n" + dog.toString());
        Animal cat = new Animal(2, "Mimi", "Femea", 8.00, joaoProp, PorteAnimalEnum.PEQUENO, VacinacaoAnimalEnum.ATRASO);
        System.out.println("\n" + cat.toString());
        System.out.println("\n----------------------------------------------");

        //Cadastrado vacina
        Vacina raiva = new Vacina(1, "Raiva", 10, "A5A48B");
        System.out.println("\n" + raiva.toString());

        //Cadastrado medicamento
        Medicamento medicamento1 = new Medicamento(1, "Diclofenaco", "15/08/2025", 100.00);
        System.out.println("\n" + medicamento1.toString());

        //Cadastado Exames
        Exame exame1 = new Exame(1, "Raio X", 180.00);
        System.out.println("\n" + exame1.toString());
        Exame exame2 = new Exame(2, "Ressonancia", 300.50);
        System.out.println(exame2.toString());
        System.out.println("\n----------------------------------------------");

        //Informada Vacinação do Dog
        Vacinacao vacinacaoDog = new Vacinacao(1, dog, raiva, "20/08/2022");
        System.out.println("\n" + vacinacaoDog.toString());

        //Calcula data da próxima vacina
        Animal.calculaProximaDose(vacinacaoDog);
        System.out.println("\n----------------------------------------------");

        //Consulta
        Consulta consultaDog = new Consulta(1, dog, "18/09/2022");
        consultaDog.getListaExame().add(exame1);
        consultaDog.getListaExame().add(exame2);
        consultaDog.getListaMedicamento().add(medicamento1);
        consultaDog.setVlrConsulta(150.00);
        System.out.println("\nConsulta:\n" + consultaDog.toString());
        consultaDog.calculaValorConsulta();
        System.out.println("\n----------------------------------------------");

        //Cadastrado Banho e Tosa
        BanhoTosa banhoTosaCat = new BanhoTosa(1, cat, "17/09/2022", "", true, false);
        System.out.println("\nBanho e Tosa:\n" + banhoTosaCat.toString() + banhoTosaCat.AgendadoBanhoTosa());
        BanhoTosa banhoTosaDog = new BanhoTosa(1, dog, "15/09/2022", "25/09/2022", true, true);
        System.out.println("\n" + banhoTosaDog.toString() + banhoTosaDog.AgendadoBanhoTosa());

    }
}
