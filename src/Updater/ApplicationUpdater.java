package Updater;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ApplicationUpdater {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Double> collections = new HashMap<>();
        Map<String,Double> collections1 = new HashMap<>();

        Application a1 = new Application("notion",1.05);
        Application a2 = new Application("notion",1.5);
        Application a3 = new Application("notion",2.0);
        collections.put(a1.name,a1.version);
        collections.put(a2.name,a2.version);
        System.out.println("Do you have notion application?");
        String respond = scanner.next();
        if (respond.equalsIgnoreCase("yes")){
            System.out.println("Do you want to update it?");
            String respond1 = scanner.next();
            if (respond1.equalsIgnoreCase("yes")){
                if (!collections.containsValue(2.0)) {
                    collections.put(a3.name,a3.version);
                    System.out.println("Your app's successfully updated" + collections.get(a3.name) );
                }
                else {
                    System.out.println("Your app has already updated");
                }
            }

        }
        else {
            System.out.println("Do you want to install it ?");
            String respond2 = scanner.next();
            if (respond2.equalsIgnoreCase("yes")){
                collections1.put(a3.name, a3.version);
                System.out.println("Your app's successfully installed ");

            }
        }

    }
}
