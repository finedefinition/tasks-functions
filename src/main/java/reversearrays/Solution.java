package reversearrays;

/*
Напишем утилиту для работы с массивами. Основная часть функционала готова:
метод printArray() выводит в консоли все элементы массива.
Тебе осталась мелочь: реализовать метод reverseArray().
Он должен менять порядок элементов массива на обратный.
Метод должен работать только с массивами целочисленных значений (int[]).

Пример:
Если массив содержал элементы:
1, 2, 3, 4, 5, 6, 7, 8, 9, 0
то после вызова метода reverseArray() должен содержать:
0, 9, 8, 7, 6, 5, 4, 3, 2, 1

Требования:
•	Метод reverseArray() должен менять порядок элементов массива на обратный.
 */
public class Solution {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }
// создание копии массива и разворот в ней
    public static void reverseArray(int[] array) {
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < arrayCopy.length; i++) {
            arrayCopy[i] = array[i];
        }
        for (int i = 0; i < arrayCopy.length; i++) {
            array[i] = arrayCopy[arrayCopy.length - 1 - i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
