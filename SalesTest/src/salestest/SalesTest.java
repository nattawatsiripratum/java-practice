package salestest;

public class SalesTest {

    public static void main(String[] args) {
        Sales sale = new Sales(1);

        sale.add(0, new double[] {76.20, 147.95, 199.10, 204.80, 26.45, 210.06, 112.09, 116.26, 214.90, 118.08, 11.47, 254.82, 94.36, 64.48});
        sale.add(1, new double[] {11.78, 282.44, 98.09, 166.76, 232.04, 60.51, 230.30, 54.96, 229.14, 117.36, 173.24});
        sale.add(2, new double[] {190.06, 86.40, 21.62, 286.07, 12.10, 257.38, 216.20, 230.84, 126.07, 193.07, 291.44});
        sale.add(3, new double[] {206.29, 26.87, 248.45, 52.24, 32.74, 56.62, 15.87, 197.39, 300.79, 144.73, 281.93});
        sale.add(4, new double[] {275.87, 236.18, 121.53, 187.01, 62.42, 267.82, 166.88, 180.70, 16.30, 240.74, 58.81});
        sale.add(5, new double[] {4.19, 147.14, 216.67, 53.93, 75.16, 213.39, 119.59, 122.68, 262.19, 164.56, 297.77, 47.94, 130.69, 128.07});
        sale.add(6, new double[] {223.10, 232.39, 62.79, 33.87, 214.04, 260.84, 66.40, 17.12, 266.05, 279.48, 58.47, 273.16, 32.34, 68.72});
        
        System.out.println("Week: "+sale.getWeek());
        System.out.println("Top sale day: "+sale.getTopSalesDay());
        System.out.println("Top sale hour: "+sale.getTopSaleHour()+"\n");
        System.out.println(sale.toString());
    }
}