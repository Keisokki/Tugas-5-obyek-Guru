//Driver Class

public class TesGuru {
    public static void main(String[] args) {
        Guru a = new Guru();
        Guru b = new Guru();
        Guru c = new Guru();
        Guru d = new Guru();
        Guru e = new Guru();

        a.nama = "Pak Ayat";
        a.mapel = "Informatika (UI/UX)";
        a.alamat = "Malang";
        a.id = 1;
        b.nama = "Pak Abi";
        b.mapel = "Matematika";
        b.alamat = "Malang";
        b.id = 2;
        c.nama = "Bu Aulia";
        c.mapel = "RPL";
        c.alamat = "Malang";
        c.id = 3;
        d.nama = "Bu Pasha";
        d.mapel = "RPL";
        d.alamat = "Malang";
        d.id = 4;
        e.nama = "Bu Feni";
        e.mapel = "Matematika";
        e.alamat = "Malang";
        e.id = 5;

        System.out.println("Data guru:");
        System.out.println("Guru pertama " + a.nama + ",mapel " + a.mapel + ",alamat " + a.alamat + ",id " + a.id);
        System.out.println("Guru kedua " + b.nama + ",mapel " + b.mapel + ",alamat " + b.alamat + ",id " + b.id);
        System.out.println("Guru ketiga " + c.nama + ",mapel " + c.mapel + ",alamat " + c.alamat + ",id " + c.id);
        System.out.println("Guru keempat " + d.nama + ",mapel " + d.mapel + ",alamat " + d.alamat + ",id " + d.id);
        System.out.println("Guru kelima " + e.nama + ",mapel " + e.mapel + ",alamat " + e.alamat + ",id " + e.id);
        

    }
}
