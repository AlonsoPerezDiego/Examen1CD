/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excod1av;

import javax.swing.JOptionPane;

/**
 *
 * @author damian
 */
public class ExCOD1Av {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
        
        while(base<=0|altura<=0){
            base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base(mayor que 0):"));
            altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura (mayor que 0):"));  
        }
        
        JOptionPane.showMessageDialog(null, "El área del rectangulo es " + base * altura + " siendo la base y la altura "+ base + " y " + altura + " respectivamente.");
    }
    
}
