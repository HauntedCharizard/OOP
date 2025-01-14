import java.util.Scanner;

// Make notes of everything so that you can get used to vocab

public class App {
    public static void main(String[] args) throws Exception {
        // Define the Shop class
        class Shop {
            private String storeName;
            private String location;

            // Constructor
            public Shop(String storeName, String location) {
                this.storeName = storeName;
                this.location = location;
            }

            // Getter methods
            public String getStoreName() {
                return storeName;
            }

            public String getLocation() {
                return location;
            }
        }

        // Greet User
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop("Antonio's Guitar Shop", "Downtown");

        System.out.println("Welcome to " + shop.getStoreName() + " located at " + shop.getLocation() + "! What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "! Let us start shopping, shall we?");
        scanner.close();

        // Future sections to instantiate and print objects
        // Instantiate Objects

        // Print Objects
    }
}
