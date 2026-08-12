package Liskov_Substitution_Principle;

public class Cash implements MetodePembayaran {
  @Override
  public boolean bayar(int jumlah) {
    System.out.println("Pembayaran sebesar " + jumlah + " berhasil dilakukan melalui Cash");
    return true;
  }
    
}
