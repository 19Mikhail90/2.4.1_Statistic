public class StatsService {
    public long summation(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (sum);
    }

    public long calculatAvarege(long[] sales) {
        long sum = summation(sales);
        long avg = sum / sales.length;
        return avg;
    }

    public int minSales(long[] sales) {
        int minMonth = (int) sales[0];
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        long maxMonth = sales[0];
        long month = 0;
        for (long sale : sales) {
            if (sale > sales[(int) maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;

        }
        return (int) maxMonth + 1;
    }


    public int monthMinAvg(long[] sales) {
        int monthMinAvg = 0;
        for (long sale : sales) {
            if (sale < calculatAvarege (sales)) {
                monthMinAvg++;
            }
        }
        return monthMinAvg;
    }
    public int monthMaxAvg(long[] sales) {
        int monthMaxAvg = 0;
        for (long sale : sales) {
            if (sale > calculatAvarege (sales)) {
                monthMaxAvg++;
            }
        }
        return monthMaxAvg;
    }
}





