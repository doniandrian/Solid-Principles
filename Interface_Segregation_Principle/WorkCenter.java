/*
    Interface Segregation adalah prinsip yang menyatakan bahwa sebuah class tidak boleh dipaksa untuk mengimplementasikan interface yang tidak digunakannya.
    Jadi harus dipisahin menjadi beberapa interface yang lebih spesifik agar class hanya mengimplementasikan interface yang sesuai dengan kebutuhannya.
*/

package Interface_Segregation_Principle;

public class WorkCenter implements IPrint, IScan, IFax {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Getting print spool details...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    @Override
    public void scanphoto() {
        System.out.println("Scanning photo...");
    }

    @Override
    public void fax() {
        System.out.println("Sending fax...");
    }

    @Override
    public void internetFax() {
        System.out.println("Sending internet fax...");
    }   
    
}
