package Liskov_Substitution_Principle;

public class Kartu_kredit implements MetodePembayaran {
    private String nomorKartu;

    public Kartu_kredit(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    public boolean validasiKartu() {
        // Logika validasi kartu kredit menggunakan aloritma Luhn
        int total = 0;
        for (int i = nomorKartu.length() -1; i >= 0; i--) {
            int digit = Character.getNumericValue(nomorKartu.charAt(i));
            if ((nomorKartu.length() - i) % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            total += digit;
        }
        return total % 10 == 0;
    }


  @Override
  public boolean bayar(int jumlah) {
    if (!validasiKartu()) {
        System.out.println("Nomor kartu kredit tidak valid.");
        return false;
    }
    System.out.println("Pembayaran sebesar " + jumlah + " berhasil dilakukan melalui Kartu Kredit dengan Nomor Kartu: " + nomorKartu);
    return true;
  }

    
}
