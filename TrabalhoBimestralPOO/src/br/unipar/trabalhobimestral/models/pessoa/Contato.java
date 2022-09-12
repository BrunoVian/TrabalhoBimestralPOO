
package br.unipar.trabalhobimestral.models.pessoa;

public class Contato {
    private int id;
    private String nrTelefone;
    private String email;

    public Contato(int id, String nrTelefone, String email) {
        this.id = id;
        this.nrTelefone = nrTelefone;
        this.email = email;
    }

    public Contato() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNrTelefone() {
        return nrTelefone;
    }

    public void setNrTelefone(String nrTelefone) {
        this.nrTelefone = nrTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", nrTelefone=" + nrTelefone + ", email=" + email + '}';
    }
    
}
