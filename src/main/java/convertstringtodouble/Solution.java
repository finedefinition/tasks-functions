package convertstringtodouble;

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        double number = Double.parseDouble(string);
        double numberRound = Math.round(number);
        System.out.println(numberRound);
        //напишите тут ваш код
    }
}
