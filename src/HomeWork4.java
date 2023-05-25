public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println(getSeson(5));
    }

    // 1 task
    // The names of the time of the year by the number of the month.
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
}
