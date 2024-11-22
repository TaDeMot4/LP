/**
 * Uma data simples.
 *
 * @author IPOO
 * @version 11/2023
 */

import java.time.LocalDate;

public class MyDate
{
  private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
    
    // ------------- Nível 5 -------------------------
    public MyDate getCurrentDate(){
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();
        MyDate today = new MyDate(day,month,year);
        return today;
    }
}
