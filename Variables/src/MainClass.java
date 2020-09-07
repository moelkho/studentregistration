/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int i => i is the variable and int is the type of variable,
        we have also long wich is bigger than int, and float, double, char,
        boolean which takes only to states true of false.
        
        So for different variables we have different types of variables
        
        */
        
        /*
        char, int, long, short, float,double are called primitive variables
        */
        
        /*
        java is a type safe langage, so when ever you use a variable you have to declare
        her type first
        */
        
        /*
        you can start your variable by an underscore or a $ sign or you car put a number in the middle
        of the name of a variable, but you can't start the name of a variable by a number
        */
        
        /*
        the name of a variable should be a significant name and start by a small letter
        */
        
        // int take 4 bytes // 32 bites
        int num = 5;
        
        System.out.println(num);
        
        // short take 2 bytes // 16 bites
        short num2 = 5;
        
        System.out.println(num2);
        
        // long takes 8 bytes // 
        long l = 3333l;
        
        System.out.println(l);
        
        
        double percent = 5.5;
        
        System.out.println(percent);
        
        float percent2 = 5.5f;
        System.out.println(percent2);
        
        
        // implicit conversion
        
        double d = 5;
        System.out.println("implicit conversion :" +d);
        
        // type casting
        
        int k = (int) 6.54;
        System.out.println("type casting :  "+k);        
    }
    
}
