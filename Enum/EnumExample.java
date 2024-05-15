package Enum;

public class EnumExample {
    public enum PizzaSize {
        SMALL(8), MEDIUM(10), LARGE(12);

        private final int price;

        PizzaSize(int price) {
            this.price = price;
        }
        public int getPrice(){
            return this.price;
        }
    }
    public static void main(String[] args) {
        PizzaSize size = PizzaSize.MEDIUM;
        System.out.println("Selected size : "+ size);
        System.out.println("Price : $ "+ size.getPrice());
    }
}
