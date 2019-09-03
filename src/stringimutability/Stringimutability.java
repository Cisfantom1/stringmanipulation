/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringimutability;

/**
 *
 * @author Cwilliams2886
 */
public class Stringimutability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String string= new String("Cecil");
       string.concat("Williams");
       
       StringBuffer sb= new StringBuffer("Cecil");
       sb.append("Williams");
        System.out.println(sb);
    }
    
}
