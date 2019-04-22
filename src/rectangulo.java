/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jslinaresa
 */
public class rectangulo {
    private int base;
    private int altura;
    
    //public static void main(String[] args) {
    
    
 
    public Rectangulo(int base, int altura){
        this.base= base;
        this.altura= altura;
        
    }
    public static int Area (){
        return this.base*this.altura;
    } 
    
    /**
     *
     * @return
     */
    public static int Perimetro (){
        return this.base*2 + this.altura*2;
    }
}