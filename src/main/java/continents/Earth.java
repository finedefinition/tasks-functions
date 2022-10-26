package continents;

/*
Как известно, на планете Земля есть 6 материков. Создай для каждого
материка собственный класс. В каждом классе должно быть поле, которое
 хранит площадь соответствующего материка.
Площадь материка нужно указывать при его создании, и она должна быть неизменяемой.
Ты можешь использовать любые числа для задания площади материков.

Требования:
•	В отдельных файлах создай публичные классы Africa, Antarctica, Australia,
Eurasia, NorthAmerica, SouthAmerica.
•	В каждом из созданных классов должно быть private final int поле area.
•	В каждом из созданных классов должен быть публичный конструктор с
аргументом типа int, который будет инициализировать поле area.
•	В методе main класса Earth создай 6 разных материков и передай в них значения площадей.
 */
public class Earth {
    public static void main(String[] args) {
        Eurasia eurasia = new Eurasia();
        Africa africa = new Africa();
        Australia australia = new Australia();
        Antarctica antarctica = new Antarctica();
        NorthAmerica northAmerica = new NorthAmerica();
        SouthAmerica southAmerica = new SouthAmerica();
    }
}
