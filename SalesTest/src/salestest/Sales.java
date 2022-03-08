package salestest;

public class Sales {
    private int week;
    private double[][] salesPerHour;
    
    public Sales(int week) {
        this.week = week;
        salesPerHour = new double[7][];
        for (int d=0; d<salesPerHour.length; d++) {
            if (d==0 || d==5 || d==6) salesPerHour[d] = new double[14];
            else salesPerHour[d] = new double[11];
        }
    }
    
    public void add(int day, double[] hourlySales) {
        for (int i=0; i<hourlySales.length; i++) {
            salesPerHour[day][i] = hourlySales[i];
        }
    }
    
    public float sumDailySales(int day) {
        float sum=0;
        for (double data: salesPerHour[day]) 
            sum+=data;
        return sum;
    }
    
    public double averageHourlySales(int hour) {
        double sum=0;
        int cnt=0;
        for (int i=0; i<salesPerHour.length; i++) {
            for (int j=0; j<salesPerHour[i].length; j++) {
                if (j==hour) {
                    sum+=salesPerHour[i][j];
                    cnt++;
                }
            }
        }
        return sum/cnt;
    }
    
    public int getWeek() {
        return week;
    }
    
    public String getTopSalesDay() {
        double max = 0;
        String day = "";
        for (double[] data : salesPerHour) {
            double sum=0;
            for (double i: data) sum+=i;
            max = sum>=max ? sum : max;
        }
        
        for (int i=0; i<salesPerHour.length; i++) {
            double sum=0;
            for (int j=0; j<salesPerHour[i].length; j++) sum+=salesPerHour[i][j];
            if (sum==max && max!=0) {
                switch(i) {
                    case 0: day+="Sunday "; break;
                    case 1: day+="Monday "; break;
                    case 2: day+="Tueday "; break;
                    case 3: day+="Wednesday "; break;
                    case 4: day+="Thursday "; break;
                    case 5: day+="Friday "; break;
                    case 6: day+="Saturday "; break;
                }
            }
        }
        return day;
    }
    
    public String getTopSaleHour() {
        double max = 0;
        String hour="";
        for (int i=0; i<13; i++) 
            if (averageHourlySales(i)>=max) max=averageHourlySales(i);
        
        for (int i=0; i<14; i++) {
            if (max==averageHourlySales(i) && max!=0) {
                switch(i) {
                    case 0 : hour+="10-11 "; break;
                    case 1 : hour+="11-12 "; break;
                    case 2 : hour+="12-13 "; break;
                    case 3 : hour+="13-14 "; break;
                    case 4 : hour+="14-15 "; break;
                    case 5 : hour+="15-16 "; break;
                    case 6 : hour+="16-17 "; break;
                    case 7 : hour+="17-18 "; break;
                    case 8 : hour+="18-19 "; break;
                    case 9 : hour+="19-20 "; break;
                    case 10: hour+="20-21 "; break;
                    case 11: hour+="21-22 "; break;
                    case 12: hour+="22-23 "; break;
                    case 13: hour+="23-24 "; break;
                }
            }
        }
        return hour;
    }
    
    public String toString() {
        return "week: "+week+"\n\t"+
                "Sunday: "+String.format("%.2f",sumDailySales(0))+"\n\t"+
                "Monday: "+String.format("%.2f",sumDailySales(1))+"\n\t"+
                "Tuesday: "+String.format("%.2f",sumDailySales(2))+"\n\t"+
                "Wednesday: "+String.format("%.2f",sumDailySales(3))+"\n\t"+
                "Thursday: "+String.format("%.2f",sumDailySales(4))+"\n\t"+
                "Friday: "+String.format("%.2f",sumDailySales(5))+"\n\t"+
                "Saturday: "+String.format("%.2f",sumDailySales(6))+"\n";
    }
}