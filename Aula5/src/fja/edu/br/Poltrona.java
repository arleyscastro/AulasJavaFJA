
package fja.edu.br;


public class Poltrona {
    private int numero;
    private String local;
    private String classe;
    private Passageiro passageiro = null;

    public Poltrona() {
    }

    public Poltrona(int numero, String local, String classe, Passageiro passageiro) {
        this.numero = numero;
        this.local = local;
        this.classe = classe;
        this.passageiro = passageiro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

}
