package Interface_Segregation_Principle;

public class CannonPrinter implements IPrint {
    @Override
    public void print() {
        System.out.println("Cannon Printer is printing");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Cannon Printer Spool Details");
    }
    
}
