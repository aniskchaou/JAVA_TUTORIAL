package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTutorial {

    public static void main(String[] args) {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));
        
        
      // Instantiate a Date object
      Date date = new Date();
      // display time and date
      String str = String.format("Current Date/Time : %tc", date );
      System.out.printf(str);
    }

}
