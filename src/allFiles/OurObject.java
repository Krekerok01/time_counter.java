package allFiles;

import java.util.Date;

public class OurObject {
    private Date date;
    private String time;
    private double open;
    private double high;
    private double low;
    private double close;

    public OurObject(Date date, String time, double open, double high, double low, double close) {
        this.date = date;
        this.time = time;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
    }
}
