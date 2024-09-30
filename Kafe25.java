import java.util.Scanner; 

public class Kafe25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //deklarasi variabel
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan menu: ");
        menu = sc.nextLine();

        System.out.print("Masukkan ukuran cup: ");
        ukuranCup = sc.next().charAt(0);

        System.out.print("Masukkan jumlah: ");
        jumlah = sc.nextInt();

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        //menentukan harga dengan swith case
        double hargaMenu = 0;

        switch (menu.toLowerCase()){
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
            default:
                System.out.println("Menu tidak tersedia.");
                return;
        }
        
        //hitung total harga
        double totalHarga = hargaMenu * jumlah;
        
        //update total harga brdsrkn cup yg dipilih 
        switch (ukuranCup) {
            case 'S':
            break; 
        case 'M':
            totalHarga += 0.25 * totalHarga;
            break;
        case 'L':
            totalHarga += 0.4 * totalHarga;
            break;
        default:
            System.out.println("Ukuran cup tidak valid.");
            return;
        }

        //diskon keanggotaan 
        double diskon = keanggotaan ? 0 : 0.1;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: " + nominalBayar);
    }

}


    

        

        