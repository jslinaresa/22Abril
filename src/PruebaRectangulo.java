/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jslinaresa
 */
public class PruebaRectangulo {
    
    private Rectangulo r1;
    
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(10,10);
        int area = r1.area();
        int perimetro = r1.perimetro;
        System.out.println("area "+ area);
        System.out.println("perimetro "+ perimetro);
    }
        
    }
    

