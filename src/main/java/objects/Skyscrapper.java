package objects;
/*
Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных способа вывода информации:
Объявляет о результате постройки.
Объявляет о результате и указывает количество этажей.
Объявляет о результате и указывает застройщика.
Пример вывода:
Небоскреб построен.
Небоскреб построен. Количество этажей - 50
Небоскреб построен. Застройщик - JavaRushDevelopment

Для решения задания тебе нужно объявить три разных конструктора и в них выводить текст.
Метод main не участвует в тестировании.

Требования:
•	В классе Skyscrapper должно быть три публичных конструктора.
•	В классе Skyscrapper должен быть конструктор без параметров.
•	В классе Skyscrapper должен быть конструктор с параметром типа int.
•	В классе Skyscrapper должен быть конструктор с параметром типа String.
•	В конструкторе без параметров вывод должен соответствовать примеру из условия.
•	В конструкторе с параметром типа int вывод должен соответствовать примеру из условия.
•	В конструкторе с параметром типа String вывод должен соответствовать примеру из условия.
 */

public class Skyscrapper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";
    public int stages;
    public String developer;

    Skyscrapper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
        System.out.println();
    }

    Skyscrapper(int stages) {
        this.stages = stages;
        System.out.println(SKYSCRAPER_WAS_BUILD);
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + stages);
        System.out.println();
    }
    Skyscrapper(int stages, String developer) {
        this.stages = stages;
        this.developer = developer;
        System.out.println(SKYSCRAPER_WAS_BUILD);
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + stages);
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
        System.out.println();
    }


    public static void main(String[] args) {
        Skyscrapper skyscraper = new Skyscrapper();
        Skyscrapper skyscraperTower = new Skyscrapper(50);
        Skyscrapper skyscraperSkyline = new Skyscrapper(52, "JavaDevelopment");
    }
}
