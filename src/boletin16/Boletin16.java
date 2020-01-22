/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IPodeCantar canary = new Canario();
        canary.cantar();
        IPodeCantar tenorio = new Tenor();
        tenorio.cantar();
    }
    
}
