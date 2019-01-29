/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumprojekt;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Kasper
 */
public class Validate {
    /**
     * Method for checking if a JTextField is empty
     *
     * @param windowToCheck
     * @return
     */
    public static boolean textWindowIsEmpty(JTextField windowToCheck) {
        boolean resultat = true;
        //If the JTextField checked is empty - do the following
        if (windowToCheck.getText().isEmpty()) {
            //Change the boolean to false
            resultat = false;
        }

        //Return a boolean
        return resultat;
    }
    
    /**
     * Method for checking if the input in a JTextField is an integer
     *
     * @param windowToCheck
     * @return
     */
    public static boolean isAnInteger(JTextField windowToCheck) {
        boolean resultat = true;
        try {
            //Fetch the input from the textfield
            String inStrang = windowToCheck.getText();
            //(Try to) convert it to an integer
            Integer.parseInt(inStrang);
        } catch (NumberFormatException e) {
            //If the conversion fails, show the user a message telling it to write a number
            JOptionPane.showMessageDialog(null, "Please enter an even number!");
            //Change the boolean to false
            resultat = false;
        }
        //Return a boolean
        return resultat;
    }
}
