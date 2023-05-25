public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println(getSeson(5));
        System.out.println(getSeson1(3));
        System.out.println(getParity(3));
    }

    // 1 task
    // The names of the time of the year by the number of the month (use: switch/case).
    public static String getSeson(int month){
        switch (month){
            case 1, 2, 12:
                return "This is a Winter";
            case 3, 4, 5:
                return "This is a Spring";
            case 6, 7, 8:
                return "This is a Summer";
            case 9, 10, 11:
                return "This is a Autumn";
            default:
                return "There is no such month in the year";
        }
    }

    // 2 task
    // The names of the time of the year by the number of the month (use: if-else-if).
    public static String getSeson1(int month){

        if (month == 1 || month == 2 || month == 12){
            return "This is a Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            return "This is a Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            return "This is a Summer";
        } else if (month == 9 || month == 10 || month == 11) {
            return "This is a Autumn";
        } else {
            return "There is no such month in the year";
        }
    }

    // 3 task
    // Parity / odd numbers
    public static String getParity (int number){
        if (number%2 == 0){
            return "Yor number is even: " + number;
        } else {return "Yor number is odd: " + number;}
    }
}
