package cubecalculator;


/*
/*
Калькулятором, который умеет возводить число в третью степень, никого не удивишь.
Калькулятор, который может возвести число в девятую степень — другое дело! Так давай реализуем его!
Для этого создай метод public static long ninthDegree(long).
В качестве аргумента он должен принимать целочисленное значение типа long.
Метод должен возводить полученное значение в девятую степень и возвращать его как результат работы метода.
Школьный курс арифметики гласит: чтобы получить девятую степень, число нужно возвести в третью степень и полученный результат еще раз возвести в третью степень.
Воспользуемся этим правилом в нашей программе.
В методе ninthDegree() возведи переданный аргумент в третью степень, воспользовавшись методом cube(), полученный результат снова передай в метод cube(). Окончательный результат верни как результат работы метода.

Требования:
•	Должен быть создан метод public static long ninthDegree(long).
•	Метод ninthDegree() должен возвращать результат возведения переданного ему числа в девятую степень.
•	Метод ninthDegree() должен использовать метод cube() для последовательных возведений чисел в куб.
*/
public class HardCalc {
    public static void main(String[] args) {

        System.out.println("Result to the 3th power " + cube(2));
        ninthDegree(2);
    }

    public static long cube(long number) {
        long result = number * number * number;
        return result;
    }

    public static long ninthDegree(long a) {
        System.out.println();
        long result = cube(a) * cube(a) * cube(a);
        System.out.println("Result to the 9th power " + result);
        return result;
    }
}