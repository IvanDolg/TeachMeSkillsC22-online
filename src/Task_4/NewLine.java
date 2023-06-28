package Task_4;

 /* разбить функцией split исходную строку по символу ' ',
 затем в каждом элементе получившегося массива подсчитывать
 число разных символов и искать минимум (держать минимальное
 слово в какой-то переменной и сравнивать) */

/*               it doesn't work!!!
                I'll think about it         */

public class NewLine {
    public static void minimalWordDifference(String line){
        String[] parts = line.split(" ");

        for (int i = 0; i < parts.length; i++) {
            int counter = 0;
            for (int j = 0; j < parts.length; j++) {
                if (parts[i].charAt(j) == parts[i].charAt(j++)){
                    counter ++;
                }
            }
        }
    }
 }
