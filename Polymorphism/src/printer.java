public class printer {
    protected String color;

    public printer(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printing(){
        System.out.println("Printing...");
    }
}
