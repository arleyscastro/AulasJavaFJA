package fja.edu.br.contratos;


public interface ICalculoJuros {
    
    double calculoJurosSimples(double valor);
    
    double calculoJurosComposto(double vp, int tempo);
    
    double quitarParcelas(int quantidade, double valor);
}
