
package br.unipar.trabalhobimestral;

import br.unipar.trabalhobimestral.models.pessoa.Cidade;
import br.unipar.trabalhobimestral.models.pessoa.Contato;
import br.unipar.trabalhobimestral.models.pessoa.Endereco;
import br.unipar.trabalhobimestral.models.pessoa.Estado;
import br.unipar.trabalhobimestral.models.pessoa.MedicoVeterinario;
import br.unipar.trabalhobimestral.models.pessoa.Pais;


public class Main {

    public static void main(String[] args) {
       
        Pais brasil = new Pais(1, "Brasil");
        Estado parana = new Estado(1, "parana", brasil);
        Cidade toledo = new Cidade(1, "Toledo", parana);
        
        Endereco enderecoFelipe = new Endereco(1, "Av Maripa", 1418, "Ap02", toledo, "85901000");
        Contato contatoFelipe = new Contato(1, "45000000000", "felipe.leite@edu.unipar.br");
        
        MedicoVeterinario felipeLeite = new MedicoVeterinario("1234", 1, "Felipe Leite", "1234567890", "987654321", enderecoFelipe, "01/01/01", contatoFelipe);

        
        System.out.println("Pessoa criada: \n" + felipeLeite);
        
        
    }
    
}
