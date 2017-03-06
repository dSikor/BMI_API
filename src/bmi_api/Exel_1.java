package bmi_api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;

public class Exel_1 {

    File file;
    FileInputStream strumienDoOdczytu;
    FileOutputStream strumienDoZapisu;

    XSSFWorkbook arkusz;
    XSSFSheet strona;
    XSSFRow wiersz;

    int numer_wiersza;
    int numer_kolumny;

    public Exel_1() {

        file = new File("BMI.xlsx");
        strumienDoZapisu = null;
        strumienDoOdczytu = null;

        numer_wiersza = 0;
        numer_kolumny = 0;

        try {
            strumienDoOdczytu = new FileInputStream(file);
            arkusz = new XSSFWorkbook(strumienDoOdczytu);
            strona = arkusz.getSheet("BMI");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exel_1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Exel_1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void StwordzNagłówek() {
        Cell komorkiNaglowka = null;

        XSSFFont czcionkaNaglowka = arkusz.createFont();
        czcionkaNaglowka.setBold(true);
        XSSFCellStyle stylKomurekNaglowka = arkusz.createCellStyle();
        stylKomurekNaglowka.setFont(czcionkaNaglowka);

        wiersz = strona.createRow(0);

        komorkiNaglowka = wiersz.createCell(0);
        komorkiNaglowka.setCellValue("Data");
        komorkiNaglowka = wiersz.createCell(1);
        komorkiNaglowka.setCellValue("Godzina");
        komorkiNaglowka = wiersz.createCell(2);
        komorkiNaglowka.setCellValue("Waga");
        komorkiNaglowka = wiersz.createCell(3);
        komorkiNaglowka.setCellValue("Wynik BMI");

        for (int i = 0; i <= 3; i++) {
            wiersz.getCell(i).setCellStyle(stylKomurekNaglowka);
        }

    }

    public void ZapiszDaneDoExela(String data, String czas, Double waga, Double wynikBMI) {

        int ostatniZapisanyWiersz = strona.getLastRowNum();

        if (ostatniZapisanyWiersz == 0) {
            StwordzNagłówek();
        }

        wiersz = strona.createRow(ostatniZapisanyWiersz + 1);

        for (int i = 0; i <= 3; i++) {
            Cell komorka = wiersz.createCell(i);

            switch (i) {
                case 0:
                    komorka.setCellValue(data);
                    break;
                case 1:
                    komorka.setCellValue(czas);
                    break;
                case 2:
                    komorka.setCellValue(waga);
                    break;
                case 3:
                    komorka.setCellValue(wynikBMI);
                    break;
                default:
                    break;
            }

        }

        try {
            strumienDoZapisu = new FileOutputStream(file);
            arkusz.write(strumienDoZapisu);
            arkusz.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exel_1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Exel_1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
