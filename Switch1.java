import java.util.*;
public class Switch1 {

    public static void main(String Args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter City");
        String city = sc.nextLine();

        switch(city)
        {
            case "Mumbai" :
            System.out.println("400607");
            break;

            case "Thane" :
            System.out.println("400610");
            break;

            case "navi mumbai" :
            System.out.println("400612");
            break;

            case "ghatkopar" :
            System.out.println("400617");
            break;

        }

        sc.close();
    }
}