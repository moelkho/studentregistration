
package selectiondemo;


public class SelectionDemo {

    public static void main(String[] args) {
       
        int n=4;
        if(n ==0)
        { // if the condition above is true, this code will be run
            System.out.println("this number is null");
        }
        
        else if(n%2 ==0)
        { // if the condition above is true, this code will be run
            
            System.out.println(" this number is even");
           
        }
        
        else
        {
             // if none above is true this one will be executed
            
            System.out.println("this number if odd");
        }
        
        //ternary operator condition?condition1:condition2, if the condition is true, the condition1 is executed else the condition2 will be executed
        
        int k=7;
        int j = 0;
        
        j = k>8?1:2;  
        
        // j should be 2 because k is less than 8 
        System.out.println(j);
    }
    
}
