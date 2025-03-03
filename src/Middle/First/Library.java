package Middle.First;

import java.util.Arrays;
import java.util.Scanner;

class Library {
    private String material; // вид литературы
    private String[] elements = new String[0]; // список литературы к виду
    Scanner sc = new Scanner(System.in);

    //в конструкторе задаем вид печатного изделия
    public Library(String material) {
        this.material = material;
    }

    //вернуть список имеющейся литературы
    public String[] getElements() {
        return elements;
    }

    public void addElement(String element) {
        //добавить элемент в список
        String[] temp = new String[elements.length + 1]; //создаем новый массив
        System.arraycopy(elements, 0, temp, 0, elements.length); // скопируем старые элементы в новый
        elements = temp; //присвоим результат в тмп
        elements[elements.length - 1] = element; // добавим новый элемент

    }

    //переопределила ту стринг для более симпатичного вывода
    public String toString() {
        return "Тип -> " + material + " список: " + Arrays.toString(elements);
    }

    //метод для поиска необходимого элемента в массиве
    public Boolean findElement(String element) {
        for (String str : elements) {
            if (str.equalsIgnoreCase(element)) {
                System.out.println("Найден объект -> " + str);
                return true;
            }
        }
        return false;
    }

    public Boolean removeElement(String element) {
        int index = -1;
        for (int i = 0; i < elements.length; i++){
            if (elements[i].equalsIgnoreCase(element)) {
                System.out.println("Изъят объект -> " + element);
                index = i;
                String[] temp = new String[elements.length ];
                System.arraycopy(elements, 0, temp, 0, index);
                System.arraycopy(elements, index + 1, temp, index, elements.length - index - 1);
                elements = temp;
                return true;
            }
        }
        return false;

    }
    int getSize(){
        return elements.length;
    }

}
