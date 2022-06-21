public class Main {
    public static void main(String[] args) {
        printer p = new printer("null");
        printer A = new colorPrinter("color");
        printer B = new blackPrinter("Black And White");
        p.printing();
        A.printing();
        B.printing();
    }
}
