public class Shop {
      // Define the Shop class
     
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
