import java.util.Scanner;
public class exponentialseries {
    public static void main(String []args) {
        int i;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int x=sc.nextInt();
        System.out.println("Enter Limit upto which u want to display the series");
        int n=sc.nextInt();
        System.out.println("Numbers between " +m+" and "+n+" are ");
        for(i=m;i<n;i++)
        {
            System.out.println(i);
            if(i%3==0 && i%5==0){
             System.out.println(i+" is Divisible By 5 and 3");
             j++;
             sum=sum+i;
        }
        }
        System.out.println(j+" numbers are divisible by 5 and 3 ");
         System.out.println("Sum of the numbers is "+sum);
        }
         

    
    
}

    
}
