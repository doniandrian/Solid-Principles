package Interface_Segregation_Principle;

public class HPPPrinterScanner implements IPrint, IScan {
    @Override
    public void print() {
        System.out.println("Printing from HP Printer Scanner");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Getting print spool details from HP Printer Scanner");
    }

    @Override
    public void scan() {
        System.out.println("Scanning from HP Printer Scanner");
    }

    @Override
    public void scanphoto() {
        System.out.println("Scanning photo from HP Printer Scanner");
    }
    
}
