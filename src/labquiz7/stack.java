/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz7;

import java.util.ArrayList;

/**
 *
 * @author Technopc
 */
public class stack {
     ArrayList ints=new ArrayList(100); 
    stack()  //empty constructor
    {
        
    }
    stack(int a) //parametreli constructor
    {
          ints.add(a);
    }
    stack(stack a) //copy constructor
    {
        
        for(int i=0;i<a.ints.size();i++)
        {
            this.ints.add(a.ints.get(i));
        }
    }

      public void empty() //stackin bos olup olmadigini kontrol eder
    {
        if(ints.isEmpty()) 
            System.out.println("Boş Stack");
    }
      public void full()// stackin dolu olup olmadigini kontrol eder
      {
          if(ints.size()==100)
              System.out.println("Full dolu stack");
      }
      public void push(int a)// stack’te yer varsa yeni eleman ekler
      {
          if(ints.size()<101)
                ints.add(a);
      }
      public void pop()// stack’te eleman varsa son elemani stackten ceker
      { if (ints.size()==0) System.out.println("Stack boş");
      else
          ints.remove(ints.size()-1);
      }
      public void peek() // stack’e en son eklenen elemanin degerini dondurur
      {
          System.out.println(ints.get(ints.size()-1));
      }
      
      
     
     @Override
      public String toString()  //stack’in icerigini dondurur
      {
            return ints.toString();
       
      }
} 