package cubecalculator;


/*
Давай напишем реализацию калькулятора, который будет считать степени чисел.
Для этого создай метод cube(). В качестве аргумента он должен принимать целочисленное значение типа long.
Метод должен возводить полученное значение в третью степень и возвращать его как результат работы метода.
Числа, которыми придется оперировать, могут быть большими. Поэтому метод cube() должен возвращать тип long.

Требования:
•	Должен быть создан метод public static long cube(long).
•	Метод cube() должен возвращать результат возведения переданного ему числа в третью степень.
*/

public class EasyCalc {
    public static void main(String[] args) {
        cube(10);
    }

    public static long cube(long number) {
        System.out.println();
        long result = number * number * number;
        System.out.println(result);
        return result;
    }
}
