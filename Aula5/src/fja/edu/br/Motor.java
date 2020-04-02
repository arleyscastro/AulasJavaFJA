package fja.edu.br;


public class Motor {
    private int cavalos;
    private String marca;
    private String modelo;

    public Motor() {
    }

    public Motor(int cavalos, String marca, String modelo) {
        this.cavalos = cavalos;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
