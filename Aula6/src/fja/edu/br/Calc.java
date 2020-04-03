package fja.edu.br;

import java.io.IOException;


public class Calc {
    
    public int div(int a, int b) throws DivPorZero, IOException{
        if(b == 0) 
            throw new DivPorZero();
        
        if(a == -500)
            throw new IOException();
        
        return a/b;
        
    }
    
}
