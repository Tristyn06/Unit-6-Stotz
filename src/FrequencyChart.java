import java.util.Scanner;

public class FrequencyChart {
    //class stuff
    //instance variables
    private int[] list;
    private String chart = "";

    //constructor
    public FrequencyChart(int[] list) {
        this.list = list;
    }

    //method
    public String makeChart() {
        int oneRow = 0;
        int twoRow = 0;
        int threeRow = 0;
        int fourRow = 0;
        int fiveRow = 0;
        int sixRow = 0;
        int sevenRow = 0;
        int eightRow = 0;
        int nineRow = 0;
        int tenRow = 0;

        for (int num : list) {
            if (num >= 0 && num <= 10) {
                oneRow++;
            } else if (num >= 11 && num <= 20) {
                twoRow++;
            } else if (num >= 21 && num <= 30) {
                threeRow++;
            } else if (num >= 31 && num <= 40) {
                fourRow++;
            } else if (num >= 41 && num <= 50) {
                fiveRow++;
            } else if (num >= 51 && num <= 60) {
                sixRow++;
            } else if (num >= 61 && num <= 70) {
                sevenRow++;
            } else if (num >= 71 && num <= 80) {
                eightRow++;
            } else if (num >= 81 && num <= 90) {
                nineRow++;
            } else if (num >= 91 && num <= 100) {
                tenRow++;
            }


        }



        //String
        chart += " 0 - 10 | ";
        for (int i = 0; i < oneRow; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "11 - 20 | ";
        for (int i = 0; i < twoRow; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "21 - 30 | ";
        for (int i = 0; i < threeRow; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "31 - 40 | ";
        for (int i = 0; i < fourRow; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "41 - 50 | ";
        for (int i = 0; i < fiveRow; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "51 - 60 | ";
        for (int i = 0; i < sixRow; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "61 - 70 | ";
        for (int i = 0; i < sevenRow; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "71 - 80 | ";
        for (int i = 0; i < eightRow; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "81 - 90 | ";
        for (int i = 0; i < nineRow; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "91 - 100| ";
        for (int i = 0; i < oneRow; i++) {
            chart += "*";
        }
        chart += "\n";

        return chart;
    }


        //helper methods

        //end class stuff
        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);

            System.out.println("How many values in your data set?");
            int size = scan.nextInt();

            int[] data = new int[size];

            System.out.println("Enter data values one at a time, followed by enter;");
            int val = 0;
            for (int i = 0; i < data.length; i++) {
                val = scan.nextInt();
                data[i] = val;
            }

            FrequencyChart chart = new FrequencyChart(data);

            System.out.println(chart.makeChart());
        }
}
