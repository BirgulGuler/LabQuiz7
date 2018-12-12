/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz7;

/**
 *
 * @author Technopc
 */
public class LabQuiz7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      stack a =new stack();
      a.push(1);
      a.push(2);
      stack b= new stack(a);
        System.out.println(a.toString());
        a.pop();
        System.out.println(a.toString());
        a.pop();
        System.out.println(a.toString());
        a.pop();
        System.out.println(a.toString());
        a.push(3);  
        System.out.println("a stackinin içeriği:"+a.toString());
        System.out.println("b stackinin içeriği:"+b.toString());
    }
    
}
