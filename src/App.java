import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("pls skriv två heltal");
        int tal1 = tb.nextInt();
        int tal2 = tb.nextInt();

        System.out.println("Är första talet lika med andra talet?");
        System.out.println(tal1==tal2);
        System.out.println("Är första talet mindre än andra talet?");
        System.out.println(tal1<=tal2);
        System.out.println("Är första talet större?");
        System.out.println(tal1>=tal2);

        int[] fält1 = {4,5,2};
        boolean b = fält1[0] >= fält1[1];
       System.out.println( fält1[0] >= fält1[2]);

       System.out.println(fält1[0]<=fält1[1]);
       System.out.println(fält1[0]<=fält1[2]);

       System.out.println(fält1[0]==fält1[1]);
       System.out.println(fält1[0]==fält1[2]);

       System.out.println("One more tal snälla");
        int x = tb.nextInt();
        int tal=x+7;
        tal*=2;
        tal-=6;
        tal/=2;
        tal+=3;
        tal=tal-x;
        System.out.println(tal); 

    }
}
