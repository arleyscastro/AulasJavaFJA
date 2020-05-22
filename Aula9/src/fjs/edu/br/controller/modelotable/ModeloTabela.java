package fjs.edu.br.controller.modelotable;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;

    public ModeloTabela(ArrayList linhas, String[] colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    @Override
    public int getRowCount() {
        return this.linhas.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] linha;
        linha = (Object[]) this.getLinhas().get(rowIndex);
        
        return linha[columnIndex];
    }
    
    @Override
    public String getColumnName(int numCol){
        return this.colunas[numCol];
    }
    
}
