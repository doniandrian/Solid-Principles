/*
 Liskov Substitution Principle
 Pripsip ini adalah prinsip yang menyatakan bahwa objek dari superclass harus dapat digantikan dengan objek dari subclass tanpa
 mempengaruhi kebenaran program. Tujuannya adalah supaya kode yang menggunakan superclass dapat bekerja dengan subclass tanpa harus mengetahui perbedaan di antara mereka.

 Contohnya, jika kita memiliki kelas Pembayaran dan kelas KartuKredit yang merupakan subclass dari Pembayaran,
 kita harus dapat menggunakan objek KartuKredit di tempat yang mengharapkan objek Pembayaran tanpa mengubah perilaku program.
  */

package Liskov_Substitution_Principle;

public class Pembayaran {
  public static void main(String[] args) {
    MetodePembayaran cash = new Cash();
    MetodePembayaran kartuKredit = new Kartu_kredit("1234-5678-9012-3456");
    MetodePembayaran qris = new Qris("qrcode123");

    cash.bayar(100000);
    kartuKredit.bayar(200000);
    qris.bayar(300000);
    
  }
    
}
