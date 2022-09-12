package br.unipar.trabalhobimestral;

import br.unipar.trabalhobimestral.models.pessoa.Cidade;
import br.unipar.trabalhobimestral.models.pessoa.Contato;
import br.unipar.trabalhobimestral.models.pessoa.Endereco;
import br.unipar.trabalhobimestral.models.pessoa.Estado;
import br.unipar.trabalhobimestral.models.pessoa.MedicoVeterinario;
import br.unipar.trabalhobimestral.models.pessoa.Pais;
import br.unipar.trabalhobimestral.models.pessoa.Proprietario;

public class Main {

    public static void main(String[] args) {

        Pais brasil = new Pais(1, "Brasil");
        Estado parana = new Estado(1, "parana", brasil);
        Cidade toledo = new Cidade(1, "Toledo", parana);

        Endereco enderecoFelipe = new Endereco(1, "Av Teste", 123, "Ap000", toledo, "85900000");
        Contato contatoFelipe = new Contato(1, "45000000000", "felipe.leite@edu.unipar.br");
        MedicoVeterinario felipeLeite = new MedicoVeterinario("1234", 1, "Felipe Leite", "1234567890", "987654321", enderecoFelipe, "01/01/01", contatoFelipe);

        Endereco enderecoTeste = new Endereco(1, "Av teste", 1234, "Teste", toledo, "85900000");
        Contato contatoTeste = new Contato(1, "45000000000", "teste@edu.unipar.br");
        Proprietario teste = new Proprietario(1, "Teste", "123456789", "987654321", enderecoTeste, "Teste", contatoTeste);

        System.out.println("Pessoa criada: \n" + felipeLeite.toString());

    }

}
