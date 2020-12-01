public class CekPuzzle {

    // Hanya setengah permutasi dari puzzle yang bisa diselesaikan.
    // Jika ada ubin yang diikuti oleh ubin yang bernilai lebih besar maka itu dihitung sebagai sebuah inversi. 
    // Jika ubin kosong berada di posisi selesai (ujung bawah kanan), 
    // angka dari invers harus genap agar puzzle dapat diselesaikan.
    
    public boolean isSolvable() {
        int countInversions = 0;
  
        for (int i = 0; i < nbTiles; i++) {
            for (int j = 0; j < i; j++) {
                if (tiles[j] > tiles[i])
                countInversions++;
            }
        }
        return countInversions % 2 == 0;
    }
  
    public boolean isSolved() {
        if (tiles[tiles.length - 1] != 0)   // Jika ubin kosong tidak berada di posisi selesai (ujung bawah kanan),
            return false;                   // maka puzzle tidak dapat diselesaikan.
  
        for (int i = nbTiles - 1; i >= 0; i--) {
            if (tiles[i] != i + 1)
                return false;			
        }
        return true;
    }
}