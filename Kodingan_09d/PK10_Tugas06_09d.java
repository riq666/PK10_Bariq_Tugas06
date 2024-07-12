package pk10_tugas06_09d;

import javax.swing.JOptionPane;

/**
 * form menghitung luas & keliling persegi 4
 * @author Bariq 12/07-2024
 */

public class PK10_Tugas06_09d 
{
    public static void main(String[] args) 
    {
        double lebar, panjang, luas, keliling;
        String panjangStr, lebarStr, outputStr;
        
        panjangStr = JOptionPane.showInputDialog("Masukkan panjang: ");
        panjang = Double.parseDouble(panjangStr);
        
        lebarStr = JOptionPane.showInputDialog("Masukkan lebar: ");
        lebar = Double.parseDouble(lebarStr);
        
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
        
        outputStr = "Panjang: " + panjang + "\n" +
                    "Lebar: " + lebar + "\n" +
                    "Luas: " + luas + " satuan persegi\n" +
                    "Keliling: " + keliling + " satuan\n";
        
        JOptionPane.showMessageDialog(null, outputStr,
                                      "Persegi Panjang",
                                      JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
} //akhir kelas