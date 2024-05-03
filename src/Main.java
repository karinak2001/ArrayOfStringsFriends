import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many friends you have? ");
        int num = scanner.nextInt();
        scanner.skip(System.lineSeparator()); // יתעלם מה enter ולא יחשיב אותו כשם של friend

        String[] names = new String[num];


        for (int i = 0; i < num; i++) {  // כדי לשמור מהמשתמש את איברי המערך
            System.out.println("Enter the name of friend " + (i+1));
            names[i] = scanner.nextLine();  // זה יאפשר לנו לקלוט את השמות עם הרווחים
        }


        System.out.println("Your friends are: ");
        for (int i = 0; i < num; i++) {  // כדי להדפיס את איברי המערך
            System.out.println(names[i]);
        }


        // אם אנחנו רוצים שהתכנית תעבוד ותקלוט גם שמות פרטיים ושמות משפחה ולא תקרוס
        // אחננו צריכים לשנות את ה ()scanner.next ל ()scanner.nextLine



    }
}