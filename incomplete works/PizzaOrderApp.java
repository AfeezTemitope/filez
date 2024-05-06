public class PizzaOrderApp {

    
    private static final int SAPA_SIZE_SLICES = 4;
    private static final int SMALL_MONEY_SLICES = 8;
    private static final int BIG_BOYS_SLICES = 12;
    private static final int ODOGWU_SLICES = 12;

    private static final int SAPA_SIZE_PRICE = 2000;
    private static final int SMALL_MONEY_PRICE = 2400;
    private static final int BIG_BOYS_PRICE = 3000;
    private static final int ODOGWU_PRICE = 4200;

    public static void main(String[] args) {
        
        int numberOfPeople = 45;
        String pizzaType = "Odogwu";

        
        OrderDetails orderDetails = calculatePizzaOrder(numberOfPeople, pizzaType);

        
        System.out.println("Number of boxes of pizza to buy = " + orderDetails.getBoxes() + " boxes");
        System.out.println("Number left over slices after serving = " + orderDetails.getLeftovers() + " slices");
        System.out.println("Price = " + orderDetails.getPrice());
    }

    private static OrderDetails calculatePizzaOrder(int numberOfPeople, String pizzaType) {
        int slicesPerBox = 0;
        int pricePerBox = 0;

       
        switch (pizzaType) {
            case "Sapa size":
                slicesPerBox = SAPA_SIZE_SLICES;
                pricePerBox = SAPA_SIZE_PRICE;
                break;
            case "Small Money":
                slicesPerBox = SMALL_MONEY_SLICES;
                pricePerBox = SMALL_MONEY_PRICE;
                break;
            case "Big boys":
                slicesPerBox = BIG_BOYS_SLICES;
                pricePerBox = BIG_BOYS_PRICE;
                break;
            case "Odogwu":
                slicesPerBox = ODOGWU_SLICES;
                pricePerBox = ODOGWU_PRICE;
                break;
            default:
                System.out.println("Invalid pizza type.");
                System.exit(0);
        }

        // Calculate the number of boxes needed
        int boxesNeeded = (numberOfPeople + slicesPerBox - 1) / slicesPerBox;

        // Calculate the leftover slices
        int leftoverSlices = (boxesNeeded * slicesPerBox) - numberOfPeople;

        // Calculate the total price
        int totalPrice = boxesNeeded * pricePerBox;

        return new OrderDetails(boxesNeeded, leftoverSlices, totalPrice);
    }

    private static class OrderDetails {
        private final int boxes;
        private final int leftovers;
        private final int price;

        public OrderDetails(int boxes, int leftovers, int price) {
            this.boxes = boxes;
            this.leftovers = leftovers;
            this.price = price;
        }

        public int getBoxes() {
            return boxes;
        }

        public int getLeftovers() {
            return leftovers;
        }

        public int getPrice() {
            return price;
        }
    }
}