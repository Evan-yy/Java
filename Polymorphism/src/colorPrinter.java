public class colorPrinter extends printer {
    public colorPrinter(String color) {
        super(color);
    }

    public void printing(){
        System.out.println("colorPrinter can printing "+ this.color);
    }
}
