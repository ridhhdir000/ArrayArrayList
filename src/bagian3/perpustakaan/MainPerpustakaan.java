package bagian3.perpustakaan;

/**
 * Class Main untuk menjalankan simulasi sistem perpustakaan.
 */
public class MainPerpustakaan {

    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();
        
        // Membuat objek Buku lalu memasukkannya ke koleksi (dengan tahun terbit)
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya", 1981)); // Tambahan untuk tes cariPenulis
        
        perpus.tampilkanKoleksi();
        System.out.println();
        
        // Pengujian fitur Pinjam Buku
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali
        System.out.println();
        
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();
        
        // Pengujian Tugas 1: Kembalikan Buku
        System.out.println("== Pengujian Kembalikan Buku ==");
        perpus.kembalikanBuku("Bumi Manusia");
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia setelah dikembalikan: " + perpus.jumlahTersedia());
        System.out.println();
        
        // Pengujian Tugas 3: Cari Penulis
        perpus.cariPenulis("Pramoedya");
        System.out.println();
        perpus.cariPenulis("Tere Liye"); // Tes jika penulis tidak ditemukan
    }
}