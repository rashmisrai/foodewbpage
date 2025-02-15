import java.util.Scanner;

public class ResortBooking {

    public static void Check(int adult, int child, int day){
        if(adult<0){
            System.out.println("Invalid input for number of adults");
            System.exit(1);
        }
        else if (child<0){
            System.out.println("Invalid input for number of children");
            System.exit(1);
        }
        else if (day<=0){
            System.out.println("Invalid input for number of days");
            System.exit(1);
        }
    }

    public static void CalCost(String name, int period, int child, int day){
        int total=((period*1000)+(child*650))*day;
        System.out.println(name+" your booking is confirmed and the total cost is Rs "+ total);

    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String input=sc.next();
        String[] str=input.split(":");
        String name=str[0];
        int adults=Integer.parseInt(str[1]);
        int childs=Integer.parseInt(str[2]);
        int days=Integer.parseInt(str[3]);

        Check(adults,childs,days);
        CalCost(name,adults,childs,days);
    }
}
