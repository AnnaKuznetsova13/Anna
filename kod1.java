import java.util.Scanner;
public class kod1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Запрашиваем у пользователя количество элементов в массиве и сохраняем это значение в переменную n.
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();

        //Создаем массив array размером n.
        int[] array = new int[n];

        //Запрашиваем у пользователя элементы массива и сохраняем их в массив array с помощью цикла for.
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        //Выводим на экран исходный массив, вызывая метод printArray.
        System.out.println("Исходный массив:");
        printArray(array);

        //Вызываем метод bubbleSort, передавая в него массив array.
        bubbleSort(array);

        //Выводим на экран отсортированный массив, вызывая метод printArray.
        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    //Метод получает на вход массив array.
    public static void bubbleSort(int[] array) {
        //Он определяет размер массива и сохраняет его в переменную n.
        int n = array.length;
        //Cоздает переменную swapped, которая будет использоваться для отслеживания, произошла ли замена элементов во время прохода по массиву.
        boolean swapped;

        //Внешний цикл for выполняется n-1 раз, так как после каждого прохода самый большой элемент уже будет на правильной позиции.
        for (int i = 0; i < n - 1; i++) {
            //В начале каждого прохода переменная swapped устанавливается в false, так как на данный момент мы еще не произвели ни одной замены.
            swapped = false;

            //Внутренний цикл for выполняется n-i-1 раз, так как после каждого прохода самый большой элемент «всплывает» на правильную позицию, и его уже не нужно рассматривать в следующих проходах.
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    //Обмен элементов
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    //Внутри внутреннего цикла мы сравниваем текущий элемент с его соседом. Если текущий элемент больше, чем следующий, меняем их местами и устанавливаем переменную swapped в true, чтобы отметить, что произошла замена.
                    swapped = true;
                }
            }

            //Если внутренний цикл не произвел ни одной замены, значит массив уже отсортирован.
            if (!swapped) {
                //В этом случае мы выходим из внешнего цикла с помощью оператора break.
                break;
            }
        }
    }

    //Метод printArray выводит элементы массива на экран, разделяя их пробелами.
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}

