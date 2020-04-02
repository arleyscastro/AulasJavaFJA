package fja.edu.br.implementacao;

import fja.edu.br.contratos.ICalculoJuros;


public class BancoDoBrasil implements ICalculoJuros{
    private double taxajuros;

    public BancoDoBrasil() {
        taxajuros = 0.25F;
    }

    public BancoDoBrasil(double taxajuros) {
        this.taxajuros = taxajuros;
    }

    @Override
    public double calculoJurosSimples(double valor) {
        //Faz um procediemto bem complexo.... de cálculos
        double valortotal = (valor * taxajuros) + valor;
        return valortotal;
    }

    @Override
    public double calculoJurosComposto(double vp,int tempo) {
        //Faz um calculo bem complexo....
        double montante = vp * Math.pow((taxajuros + 1), tempo);
        return montante;
    }

    @Override
    public double quitarParcelas(int quantidade, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String nomeDobanco(){
        return  "Banco do Brasil";
    }
}
