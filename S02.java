//Q1
import java.util.*;
import java.io.*;
public class Slip02
{       
      float wt;
	    float ht;
	    String fn;
	    String ln;
	    float bm;
	    Slip02()
	    {
		      wt=0;
		      ht=0;
		      fn=" ";
		      ln=" ";
		      bm=0;
	    }
	    Slip02(float ht,float wt,String fn,String ln)
	    {
		      this.fn=fn;
		      this.ln=ln;
		      this.wt=wt;
		      this.ht=ht;
		      this.bm=wt/(ht*ht);
	    }
	    void display()
	    {	
		      System.out.println("First Name||Last Name||Weight(kg)||Height(cm)||BMI");
		      System.out.println("  "+fn+"   "+ln+"    "+wt+"   "+ht+"   "+(bm));
	    }
	    public static void main(String args[])
	    {
		      String fn=args[0];
		      String ln=args[1];
		      float wt=Float.parseFloat(args[2]);
		      float ht=Float.parseFloat(args[3]);
		      Slip02 b1=new Slip02(ht,wt,fn,ln);
		      b1.display();
	    }
}

//Q2) 

import java.io.*;
public class Cricket
{
       String name;
       public int ing, tofnotout, totalruns;
       public float batavg;
       public Cricket()
       {
              name=null;
              ing=0;
              tofnotout=0;
              totalruns=0;
              batavg=0;
  
       }
       public void get() throws IOException
       {
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              System.out.println("Enter the name :");
              name=br.readLine();
              System.out.println("No Of Ings :");
              ing=Integer.parseInt(br.readLine());
              System.out.println("No of times notout :");
              tofnotout=Integer.parseInt(br.readLine());
              System.out.println("Total runs :");
              totalruns=Integer.parseInt(br.readLine());
             
       }
       public void put()
       {
              System.out.println("Name="+name);
              System.out.println("No of ings="+ing);
              System.out.println("No times notout="+tofnotout);
              System.out.println("Total runs="+totalruns);
              System.out.println("Batting avg="+batavg);
       }
       static void avg(int n, Cricket c[])
       {
              try
              {
                 for(int i=0;i<n;i++)
                 {
                    c[i].batavg=c[i].totalruns/c[i].ing;
                 }
              }catch(ArithmeticException e)
              {
                System.out.println("Invalid arg");
              }
       }
       static void sort(int n, Cricket c[])
       {
              String temp1;
              int temp2,temp3,temp4;
              float temp5;
              for(int i=0;i<n;i++)
              {
                  for(int j=i+1;j<n;j++)
                  {
                     if(c[i].batavg<c[j].batavg)
                     {
                        temp1=c[i].name;
                        c[i].name=c[j].name;
                        c[j].name=temp1;
                        temp2=c[i].ing;
                        c[i].ing=c[j].ing;
                        c[j].ing=temp2;
                        temp3=c[i].tofnotout;
                        c[i].tofnotout=c[j].tofnotout;
                        c[j].tofnotout=temp3;
                        temp4=c[i].totalruns;
                        c[i].totalruns=c[j].totalruns;
                        c[j].totalruns=temp4;
                        temp5=c[i].batavg;
                        c[i].batavg=c[j].batavg;
                        c[j].batavg=temp5;
                     }
                   }
              } 
        }
         public static void main(String args[])throws IOException
         {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter The Number Of Players:");
                int n=Integer.parseInt(br.readLine());
                Cricket c[]=new Cricket[n];
                for(int i=0;i<n;i++)
                {
                    c[i]=new Cricket();
                    c[i].get();
                }
                Cricket.avg(n,c);
                Cricket.sort(n, c);
                for(int i=0;i<n;i++)
                {
                   c[i].put();
                }
 
         }
}
