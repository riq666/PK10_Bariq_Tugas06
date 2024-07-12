package pk10_tugas06_09e;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Aplikasi menghitung luas & keliling persegi panjang (JFrame)
 * @author Bariq 12/07-2024
 */

public class PK10_Tugas06_09e extends JFrame 
{
    private JLabel panjangL, lebarL, luasL, kelilingL;
    private JTextField panjangTF, lebarTF, luasTF, kelilingTF;
    private JButton hitungB, keluarB;
    private HitungTombolHandler htHandler;
    private KeluarTombolHandler ktHandler;
    private static final int LEBAR = 400;
    private static final int TINGGI = 300;

    public PK10_Tugas06_09e() 
    {
        // Membuat empat label
        panjangL = new JLabel("Masukkan panjang: ", SwingConstants.RIGHT);
        lebarL = new JLabel("Masukkan lebar: ", SwingConstants.RIGHT);
        luasL = new JLabel("Luas: ", SwingConstants.RIGHT);
        kelilingL = new JLabel("Keliling: ", SwingConstants.RIGHT);
        
        // Membuat empat text field
        panjangTF = new JTextField(10);
        lebarTF = new JTextField(10);
        luasTF = new JTextField(10);
        kelilingTF = new JTextField(10);
        
        // Membuat Tombol Hitung
        hitungB = new JButton("Hitung");
        htHandler = new HitungTombolHandler();
        hitungB.addActionListener(htHandler);
        
        // Membuat Tombol Keluar
        keluarB = new JButton("Keluar");
        ktHandler = new KeluarTombolHandler();
        keluarB.addActionListener(ktHandler);
        
        // Menetapkan judul jendela
        setTitle("Luas dan Keliling Persegi Panjang");
        
        // Mendapatkan container
        Container pane = getContentPane();
        
        // Menetapkan layout
        pane.setLayout(new GridLayout(5, 2));
        
        // Menempatkan komponen ke dalam pane
        pane.add(panjangL);
        pane.add(panjangTF);
        pane.add(lebarL);
        pane.add(lebarTF);
        pane.add(luasL);
        pane.add(luasTF);
        pane.add(kelilingL);
        pane.add(kelilingTF);
        pane.add(hitungB);
        pane.add(keluarB);
        
        // Menetapkan ukuran jendela dan menampilkannya
        setSize(LEBAR, TINGGI);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class HitungTombolHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            double lebar, panjang, luas, keliling;
            panjang = Double.parseDouble(panjangTF.getText());
            lebar = Double.parseDouble(lebarTF.getText());
            luas = panjang * lebar;
            keliling = 2 * (panjang + lebar);
            luasTF.setText("" + luas);
            kelilingTF.setText("" + keliling);
        }
    }

    private class KeluarTombolHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) 
    {
        new PK10_Tugas06_09e();
    }
} // akhir kelas