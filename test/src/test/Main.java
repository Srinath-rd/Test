/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 792472
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private boolean isaNumber(String number) {
        boolean isValid = false;
        String expression = "[0-9]*";
        CharSequence inputStr = number;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
           isValid = true;
        }
       return isValid;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Main main = new Main();
        boolean flag = main.isaNumber("02");
        System.out.println(flag);
    }

}
