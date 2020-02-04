package com.ht2.Hometask2;

import java.util.*;
public class NewYearsGift {
    public static void main( String[] args )
    { 
        int total_weight = 0,quantity = 0,weight = 0,totalbox_wt = 0,total_candies = 0;
        char n1;
        Sweets collect;
        Boolean n=true;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("fill the gift box with different types of sweets available below");
        while(n) {

        System.out.println("1.Cadbury");
        System.out.println("2.KitKat");
        System.out.println("3.Amul");
        System.out.println("4.Ferrero Rocher");
        System.out.println("5.Snickers");
        System.out.println("6.Hershey’s");
        System.out.println("choose an item");
        
        try {
        	
        switch(sc.next().charAt(0))
        {
        case '1':
        	   System.out.println("please enter the quantity");
        	   quantity=sc.nextInt();
        	   System.out.println("please enter the weight in grams");
        	   weight=sc.nextInt();
        	   collect= new Cadbury();
        	   total_weight=collect.calcwt( quantity, weight);
        	   totalbox_wt=totalbox_wt+total_weight;
        	   System.out.println("Total weight of Cadburys is:"+total_weight+"grams");
        	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
               
        	   System.out.println("do you want any other item (y/n)");
        	   n1=sc.next().charAt(0);
        	      if(n1=='y'|| n1=='Y')
        	        { 
        	    	  n=true;
        	          break;
        	        }
        	     else
        		    {
        	    	 n=false;
                     System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                     System.out.println("Total number of candies in the giftbox is:"+total_candies);
                     break;
                    }
        case '2':
        	   System.out.println("please enter the quantity");
        	   quantity=sc.nextInt();
        	   System.out.println("please enter the weight in grams");
        	   weight=sc.nextInt();
        	   collect=new KitKat();
        	   total_weight=collect.calcwt(quantity, weight);
        	   totalbox_wt=totalbox_wt+total_weight;

        	   System.out.println("Total weight of KitKats is:"+total_weight+"grams");
        	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	   System.out.println("do you want any other item (y/n)");
        	   n1=sc.next().charAt(0);
        	      if(n1=='y'|| n1=='Y')
        	        { 
        	    	  n=true;
        	          break; 
        	        }
        	      else
        		    {
        	    	  n=false;
        	          System.out.println("Total gift box weight is:"+totalbox_wt+"grams");
        	          System.out.println("Total number of candies in the giftbox is:"+total_candies);
        	          break;
        	        }
        case '3':
        	System.out.println("please enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("please enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new Amul();
        	total_weight=collect.calcwt(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of Amul chocolates is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("do you want any other item (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        		System.out.println("Total number of candies in the giftbox is:"+total_candies);
        	break;}
        case '4':
        	System.out.println("please enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("please enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new FerreroRocher();
        	total_weight=collect.calcwt(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;
        	total_candies=total_candies+quantity;

        	System.out.println("Total weight of Ferrero Rochers is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("do you want any other item (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	break;}
        	else
        		{
		n=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                System.out.println("Total number of candies in the giftbox is:"+total_candies);
                
        	break;}
        case '5':
        	System.out.println("please enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("please enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new Snickers();
        	total_weight=collect.calcwt(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of Snickers is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("do you want any other item (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        		System.out.println("Total number of candies in the giftbox is:"+total_candies);
        	break;}
        case '6':
        	System.out.println("please enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("please enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new Hersheys();
        	total_weight=collect.calcwt(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of Hershey’s is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("do you want any other item (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	    
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        		System.out.println("Total number of candies in the giftbox is:"+total_candies);
        	break;}
        
 
        }
      }
        catch(Exception e)
      {
        	System.out.println("please select from 1-6 options");
            
        
        
      }
    }
        sc.close();
  }

}
