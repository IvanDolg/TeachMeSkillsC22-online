public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println(getSeson(5));
        System.out.println(getSeson1(3));
        System.out.println(getParity(10));
        getWeather(-20);
        System.out.println(getNameColour(4));
        getNumber();
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

    // 4 task
    // Weather interval (Heat/Normally/Cold)
    public static void getWeather (int tem){
        String status = (tem > -5) ? "Heat" : (tem > -20 && tem <= -5) ? "Normally" : "Cold";
        System.out.println(status);
    }

    // 5 task
    // Each number must match the color of the rainbow
    public static String getNameColour (int colourNum){
        switch (colourNum){
            case 1:
                return "Red";
            case 2:
                return "Orange";
            case 3:
                return "Yellow";
            case 4:
                return "Green";
            case 5:
                return "Blue";
            case 6:
                return "Dark blue";
            case 7:
                return "Violet";
            default:
                return "Wrong number";
        }
    }
    // ---- Cycles ----
    // 1 task
    // Print numbers from 1 to 99 (use: for())
    public static void getNumber(){
        for(int i = 1; i <= 99; i+=2){
                System.out.println(i);
        }
    }
}
