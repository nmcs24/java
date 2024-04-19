//Q1)
import java.util.*;
import java.io.*;
public class Slip01
{
		public static void main(String args[])
		{
			int len=args.length;
			for(int i=0; i<len; i++)
			{
			  int no=Integer.parseInt(args[i]);
			  int flag=0;
			  for(int j=2; j<no; j++)
				{				
				  if(no%j==0)
				  {
				    flag=1;
				  }
			  }
				if(flag==1)
			  {
		      System.out.println(no+" is not a prime no....");
			  }
	      else
			  {
			    System.out.println(no+" is a prime no");	
			  }
		  }
		}
}

//Q2) 

import java.util.*;
abstract class Staff 
{ 
			protected int id; 
 			protected String name;
 		  public Staff(int id,String name) 
 			{ 
 				this.id=id; 
			  this.name=name; 
 			} 
} 
class OfficeStaff extends Staff 
{ 
 			String dept; 
 			OfficeStaff(int id,String name,String dept) 
 			{ 
 					super(id,name); 
 					this.dept=dept; 
 			} 
 			public void display() 
 			{ 
 				System.out.println("ID :"+id+" Name :"+name+" Department :"+dept); 
 			} 
 			public static void main(String args[]) 
 			{ 
 					int n,id; 
 					String name,dept; 
 					Scanner sc=new Scanner(System.in); 
					System.out.println("How many staff members?"); 
 					n=sc.nextInt(); 
 					OfficeStaff ob[]=new OfficeStaff[n]; 
 					System.out.println("Enter details of "+n+" staff"); 
 					for(int i=0;i<n;i++) 
 					{ 
 							System.out.println("Enter id,name, department"); 
 							id=sc.nextInt(); 
 							name=sc.next(); 
 							dept=sc.next(); 
 							ob[i]=new OfficeStaff(id,name,dept); 
 					} 
 					System.out.println("Entered Details are\n"); 
 					for(int i=0;i<n;i++) 
 					{ 
 						ob[i].display(); 
 					} 
			} 
}
