public class blackPrinter extends printer {
    public blackPrinter(String color) {
        super(color);
    }

    public void printing(){
        System.out.println("blackPrinter only can printing "+this.color);
    }
}
