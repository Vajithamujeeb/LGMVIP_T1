package lets_grow_more;

import java.util.*;
public class Task1
{

	public static void main(String[] args) 
	{
		
        System.out.println("1 RUPEE ₹");
        System.out.println("2 DOLLAR $");
        System.out.println("3 EURO €");
       
     
        Scanner sc = new Scanner(System.in);
        System. out.println("Choose currency");
        int choice = sc.nextInt();
        System.out.println("Enter amount");
        double amount = sc.nextDouble();
	        switch (choice)
	        {
	        	
	        	
		            case 1:
		                Rupee_to_other(amount);
		                break;
		            case 2:
		                Dollar_to_other(amount);
		                break;
		            case 3:
		                Euro_to_other(amount);
		                break;
		           
		            default:
		                System.out.println("Invalid choice");
	        	
	        }
      

    }

	public static void Rupee_to_other(double amt)
	{
	    System.out.println("1 Rupee = " + 0.013 + " Dollar");
	    System.out.println();
	
	    System.out.println(amt+" Rupee = " + (amt*0.013) + " Dollar");
	    System.out.println();
	
	    System.out.println("1 Rupee = " + 0.012 + " Euro");
	    System.out.println();
	    System.out.println(amt+" Rupee = " + (amt*0.012) + " Euro");
	    System.out.println();
	
	}
    

	public static void Dollar_to_other(double amt)
	{
	    System.out.println("1 Dollar = " + 79.37 + " Rupee");
	    System.out.println();
	    System.out.println(amt+" Dollar = " + (amt*79.37) + " Rupee");
	    System.out.println();
	
	    System.out.println("1 Dollar= " + 0.98 + " Euro");
	    System.out.println();
	
	    System.out.println(amt+" Dollar = " + (amt*0.98) + " Euro");
	}

    

	public static void Euro_to_other(double amt)
	{
	    System.out.println("1 Euro = " + 80.85 + " Rupee");
	    System.out.println();
	    System.out.println(amt+" Euro = " + (amt*80.85) + " Rupee");
	    System.out.println();
	
	    System.out.println("1 Euro = " + 1.02 + " Dollar");
	    System.out.println();
	
	    System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
	}


				

}


