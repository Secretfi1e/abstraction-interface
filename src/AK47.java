public class AK47 extends Weapon implements Fireable {
    @Override
    public void zarjatetmek() {
        if (hazirkimermi >= 0) {
            if (mermisayi >= daraqtutumu - hazirkimermi) {
              int bulletsToTransfer = daraqtutumu - hazirkimermi;
              mermisayi -=bulletsToTransfer;
              hazirkimermi += bulletsToTransfer;
                System.out.println("Hazirki mermi : " + hazirkimermi);
                System.out.println("Mermi sayi : " + mermisayi);
                System.out.println("Elave olunan mermi : " + bulletsToTransfer);
            }
        }
    }

    @Override
    public void atesetmek() {
        if (hazirkimermi > 0) {
            hazirkimermi--;
            System.out.println("Fire");
        }else System.out.println("zarjatin deyisdi");
    }
    public AK47(int mermisayi, int daraqtutumu, int hazirkimermi) {
        super(mermisayi, daraqtutumu, hazirkimermi);
    }

    @Override
    public String toString() {
        return "AK47{" +
                "mermisayi=" + mermisayi +
                ", daraqtutumu=" + daraqtutumu +
                ", hazirkimermi=" + hazirkimermi +
                '}';
    }
}

