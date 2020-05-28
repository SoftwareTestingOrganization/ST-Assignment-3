/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equation;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nabiya Fatima
 */
public class Equation {

    public String isQuadratic(int a, int b, int c)
    {
       String str="Invalid Range";
       if(a>=0&&a<=200&&b>=0&&b<=200&&c>=0&&c<=200)
       {
           if(a!=0)
           {
               return "Quadratic Equation";
           }
           else
           {
               return "Not a Quadratic Equation";
           }
           
       }
       return str;
    }
    public String CheckRoots(int a,int b,int c)
     {
         String str="Invalid Range";
         if(a>=0&&a<=200&&b>=0&&b<=200&&c>=0&&c<=200)
         {
             int disc=b*b-4*a*c;
             if(a!=0)
             {
                 if(disc==0)
                 {
                     return "Equal";
                 }
                 else if(disc>0)
                 {
                      return "Real";
                 }
                 else if (disc<0)
                 {
                     return "Imaginary";
                 }
             }
             else
             {
                  return "Not a Quadratic Equation";
             }
         }
         return str;
     }
    public double[] calculateRoots(int a,int b,int c)
    {
        double root1=-1,root2=-1;
         double result[]=new double[2];
         if(a>=0&&a<=200&&b>=0&&b<=200&&c>=0&&c<=200)
       {
           if(a!=0)
           {
              int disc=b*b-4*a*c; 
                if(disc>0)
                {
                    root1 = (-b + Math.sqrt(disc)) / (2 * a);
                    root2 = (-b - Math.sqrt(disc)) / (2 * a);
                    result[0]=root1;
                result[1]=root2;

                }
                else if(disc==0)
                {
                     root1 = root2 = -b / (2 * a);
                     result[0]=root1;
                result[1]=root2;
                }
                else if(disc<0)
                {
                    double realPart = -b / (2 *a);
                    double imaginaryPart = Math.sqrt(-disc) / (2 * a);
                    result[0]=realPart;
                result[1]=imaginaryPart;

                }
           }
           else
           {
               result[0]=result[1]=-2;
           }
       }
         else
         {
             result[0]=result[1]=-1;
         }
        return result;
       }
    public static void main(String[] args) {
       int a,b,c;
        Equation q=new Equation();
         Scanner in = new Scanner(System.in);
            System.out.println("Enter the values of a ");
                a=in.nextInt();
                System.out.println("Enter the values of b ");
                b=in.nextInt();
                System.out.println("Enter the values of c ");
                c=in.nextInt();
               System.out.println("1) Check IsQuadratic");
        System.out.println("2) Check Rootts of Equation");
        System.out.println("3) Calculate Roots");
        
           int choice=0;
           
           
          
             
           try  
        {  
         choice=in.nextInt();
        }  
            //handling the exception  
        catch(InputMismatchException w)  
        {  
            System.out.println("Invalid choice");  
        }  
           
        switch(choice)
        {
            case 1:
            {
               q.isQuadratic(a, b, c);
              break;
            }
            case 2:
            {
                System.out.println(q.CheckRoots(a, b, c)+" Roots");  
                 break;
            }
            case 3:
            {
             // double [] res=q.calculateRoots(a, b, c);
              if(a>=0&&a<=200&&b>=0&&b<=200&&c>=0&&c<=200&&a==0)
              {
                  System.out.println("Not a Quadratic Equation");
                  
              }
             else  if(a>=0&&a<=200&&b>=0&&b<=200&&c>=0&&c<=200)
                    {
                       // System.out.println("x1 = "+res[0]);
                        //System.out.println("x2 = "+res[1]);
                    }
              else
              {
               System.out.println("Invalid Range");   
              }
              break;
            }
            
             default:
            {
                System.out.println("Invalid Choice");
            }
            
        }    
    }
    
}
