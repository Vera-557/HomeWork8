package Middle.First;
/*
Создайте свою библиотеку.
Библиотека должна уметь принимать и отдавать материалы. Материалы — это не только книги, но еще газеты, журналы,
научные труды и т.д. Если в библиотеке нет нужной книги, то она должна вывести на консоль сообщение, что на данный
момент книги такой нет. Если книга появилась, то библиотека должна вывести на консоль соответствующее сообщение.
Также библиотека должна показывать, сколько книг имеется в данный момент.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MiddleFirst {
    Scanner sc = new Scanner(System.in);
    Library book = new Library("Книги");
    Library magazine = new Library("Журналы");
    Library newspaper = new Library("Газеты");
    Library since = new Library("Научные статьи");

    {
        //просто добавлю литературу, которая в наличии в отдельный блок вначале кода, чтоб он обнаруживал ее наличие в себе
        book.addElement("Книга 1");
        book.addElement("Книга 2");
        magazine.addElement("magazine 1");
        magazine.addElement("magazine 2");
        newspaper.addElement("Газета 1");
        newspaper.addElement("Газета 2");
        since.addElement("Статья 1");
        since.addElement("Статья 2");
    }

    public static void main(String[] args) {
        MiddleFirst a = new MiddleFirst();
        System.out.println("Добро пожаловать в библиотеку");
        System.out.println("Какой вид литературы вас интересует?");
        a.libraryMethods();

    }

    protected void libraryMethods() {
        System.out.println("1 - книги, 2 - журналы, 3 - газеты, 4 - научные труды");

        switch (sc.nextLine()) {
            case "1" -> {
                System.out.println("Книги");
                books();
            }
            case "2" -> {
                System.out.println("Журналы");
                magazines();
            }
            case "3" -> {
                System.out.println("Газеты");
                newspapers();
            }
            case "4" -> {
                System.out.println("Научные труды");
                sinces();
            }
            default -> System.out.println("Неверный ввод");
        }
    }

    private void library(Library library) {
        System.out.println("Выберите действие:");
        System.out.println("1 - вывести список литературы, 2 - найти литературу, 3 - добавить литературу, 4 - забрать литературу, 5 - количество единиц литературы");
        String input = sc.nextLine();
        switch (input) {

            case "1" -> {
                System.out.println("Список литературы:");
                System.out.println(library.toString());
            }
            case "2" -> {
                System.out.println("Найти литературу");
                System.out.println("Введите искомое название");
                String find = sc.nextLine().trim();
                if (library.findElement(find)) {
                    System.out.println("Есть такая литература");
                } else System.out.println("Такой литературы нет");
            }
            case "3" -> {
                System.out.println("Добавить литературу");
                String add = sc.nextLine().trim();
                library.addElement(add);
                System.out.println("Вы добавили " + add);
                String [] elements = library.getElements();
                System.out.println(Arrays.toString(elements));

            }
            case "4" -> {
                System.out.println("Забрать литературу");
                library.removeElement(sc.nextLine());
                String [] elements = library.getElements();
                System.out.println(Arrays.toString(elements));
            }
            case "5" -> {
                System.out.println("В настоящий момент в наличии -> " + library.getSize() + "шт");
            }
            default -> System.out.println("Неверный ввод");
        }


    }

    private void books() {
        library(book);
//        System.out.println("Вы выбрали книги");
//        System.out.println("Выберите действие:");
//        System.out.println("1 - вывести список литературы, 2 - найти литературу, 3 - добавить литературу, 4 - забрать литературу");
//        switch (sc.nextLine()){
//            case "1" -> {
//                System.out.println("Список литературы:");
//                System.out.println(book.toString()); // первый способ вывода
//                // String[] elements = book.getElements();
//                // System.out.println(Arrays.toString(elements)); // второй способ вывода
//            }
//            case "2" -> {
//                System.out.println("Найти литературу");
//                System.out.println("Введите искомое название");
//                String find = sc.nextLine().trim();
//                if (book.findElement(find)){
//                    System.out.println("Есть такая литература");
//                } else System.out.println("Такой литературы нет");
//            }
//        }
    }

    private void magazines() {
        library(magazine);
    }

    private void newspapers() {
        library(newspaper);
    }

    private void sinces() {
        library(since);
    }
}



