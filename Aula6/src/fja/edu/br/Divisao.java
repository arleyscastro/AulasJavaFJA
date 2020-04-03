
package fja.edu.br;

import java.io.IOException;


public class Divisao {
    private int x;
    private int y;
    private int resultado;

    public Divisao(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void divide(){
        try {
            Calc calc = new Calc();
            resultado = calc.div(x, y);
            System.out.println("O resultado é:" + resultado);
        } catch (IOException e) {
            System.out.println("erro:" + e);
        } catch (DivPorZero d){
            System.out.println("erro:" + d);
        } catch(ArithmeticException a){
            System.out.println("erro:" + a);
        } finally{
            System.out.println("FIM");
        }
        
        
    }
    
    
}
