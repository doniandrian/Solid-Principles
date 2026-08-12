package Liskov_Substitution_Principle;

public class Qris implements MetodePembayaran {
    private String qrcode;

    public Qris(String qrcode) {
        this.qrcode = qrcode;
    }

    @Override
    public boolean bayar(int jumlah) {
        System.out.println("Pembayaran sebesar " + jumlah + " dilakukan melalui QRIS dengan QR Code: " + qrcode);
        return true;
    }

}
