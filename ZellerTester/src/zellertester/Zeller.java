package zellertester;

public class Zeller {
    private int dayOfMonth;
    private int month;
    private int year;
    
    public Zeller(int y, int m, int d) {
        dayOfMonth=d;
        month=m;
        year=y;
    } 
    
    public Day getDayOfWeek() {
        int h;
        Day day = null;
        if (month==1 || month==2) {
            month+=12;
            year-=1;
        }
        h=(dayOfMonth+26*(month+1)/10+(year%100)+(year%100)/4+ ((year/100)/4)+5*(year/100))%7;
        switch (h) {
            case 0: day=Day.SATURDAY; break;
            case 1: day=Day.SUNDAY; break;
            case 2: day=Day.MONDAY; break;
            case 3: day=Day.TUESDAY; break;
            case 4: day=Day.WEDNESDAY; break;
            case 5: day=Day.THURSDAY; break;
            case 6: day=Day.FRIDAY; break;
        }
        return day;
    }
}