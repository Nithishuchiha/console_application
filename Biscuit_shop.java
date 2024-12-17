import java.util.*;

class AddItem {
     int totalAmount = 0;
     int currentBill = 0;
     String BiscuitName = "";
     Map<String, Integer> products = new TreeMap<>();

     public void getQuantity(int no) {
          // System.out.println(BiscuitName + " x " + no);
          currentBill = no * 10;
          // System.out.println("Your current Bill : " + currentBill);
          System.out.println("If you want to add item(1) or Generate Bill(2)");
          totalAmount += currentBill;
     }

     public void generateBill() {
          System.out.println("================================================");
          System.out.println("|Biscuit Name          |Quantity                |");
          System.out.println("================================================");

          for (Map.Entry<String, Integer> e : products.entrySet()) {

               System.out.printf("%-18s|%-11d\n", e.getKey(), e.getValue());
          }
          System.out.println("===============================================");
          System.out.print("Your Bill is : " + totalAmount);

     }

     public void itemName(String BiscuitName, int quantity) {

          products.put(BiscuitName, quantity);
          System.out.println(BiscuitName);
          getQuantity(quantity);

     }
}

public class Biscuit_shop {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("============================================================");
          System.out.println("Nithish's Biscuit shop");
          System.out.println("============================================================");

          System.out.println("Press 1 to Add Item:");
          System.out.println("Press 2 to Generate the Bill:");
          AddItem a = new AddItem();

          while (true) {
               System.out.println("Enter the choice");
               int choice = s.nextInt();
               s.nextLine();

               if (choice == 1) {
                    System.out.print("Enter the Biscuit Name:");
                    String BiscuitName = s.nextLine();
                    System.out.print("Enter the quantity: ");
                    int quantity = s.nextInt();
                    a.itemName(BiscuitName, quantity);

                    // s.nextLine();
                    // System.out.println("Enter the quantity of Biscuits:");
                    // a.newItem(BiscuitName, choice);

               } else {
                    a.generateBill();
                    break;
               }

          }

     }

}