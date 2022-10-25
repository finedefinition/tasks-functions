package objects;
/*
Давай построим бизнес-центр, который состоит из двух зданий, один из которых только начинаем строить,
а второй — на этапе планирования, поэтому о нем мало что известно.
Тебе нужно будет создать два конструктора: один с параметрами, второй — без.
Они оба должны инициализировать поля floorsCount и developer.

Требования:
•	В классе Skyscraper должно быть два публичных конструктора.
•	В классе Skyscraper должен быть конструктор без параметров.
•	В классе Skyscraper должен быть конструктор с параметрами типа int и типа String.
•	В классе Skyscraper должно быть приватное не статическое поле типа int с названием floorsCount.
•	В классе Skyscraper должно быть приватное не статическое поле типа String с названием developer.
•	В конструкторе без параметров поля должны инициализироваться значениями "5" и "JavaDevelopment".
•	В конструкторе c параметрами поля должны инициализироваться аргументами этого конструктора.
 */
public class Skyscraper2 {
    private int floorsCount;
    private String developer;

   Skyscraper2() {
       floorsCount =5;
       developer = "JavaDevelopment";
   }
   Skyscraper2(int floorsCount, String developer) {
       this.floorsCount = floorsCount;
       this.developer = developer;
   }

    public static void main(String[] args) {
        Skyscraper2 skyscraper2 = new Skyscraper2();
        Skyscraper2 skyscraper2Unknown = new Skyscraper2(50, "Неизвестно");
    }
}
