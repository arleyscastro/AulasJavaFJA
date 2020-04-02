package fja.edu.br.implementacao;

import fja.edu.br.contratos.ICalculoJuros;


public class CaixaEconomica implements ICalculoJuros{
    private double taxajuros;
    
    public CaixaEconomica() {
        taxajuros = 0.05F;
    }

    public CaixaEconomica(double taxajuros) {
        this.taxajuros = taxajuros;
    }
    

    @Override
    public double calculoJurosSimples(double valor) {
        double valortotal = (valor * taxajuros) + valor;
        return valortotal;
    }

    @Override
    public double calculoJurosComposto(double vp, int tempo) {
        double montante = vp * Math.pow((taxajuros + 1), tempo);
        return montante;
    }

    @Override
    public double quitarParcelas(int quantidade, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
