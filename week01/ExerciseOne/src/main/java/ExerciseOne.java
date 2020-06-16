/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class ExerciseOne {
    
    public static void main(String[] args){
    
    System.out.println("Hello World!");
    

        int feet = 0;
        int inches = 0;
        double centimetres = 180;
        double inchesTotal;
        inchesTotal = centimetres /2.54;
        System.out.println(inchesTotal);
        inches = (int)inchesTotal % 12;
        System.out.println(inches);
        feet = (int)inchesTotal / 12;
        System.out.println(feet);
        
    System.exit(0);
    
    }
    
}
