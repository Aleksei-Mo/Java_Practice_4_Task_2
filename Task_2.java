import java.util.ArrayDeque;

//Написать реализацию очереди на основе массива; Реализовать методы size(), empty(), offer(), poll(), peek()

public class Task_2 {

    public static void main(String[] args) {
        int capacity = 25, offset=5;
        ArrayDeque<Integer> myQueue= new ArrayDeque<Integer>(capacity);
        if (myQueue.isEmpty()){
            System.out.println("Очередь пока что пуста.");
        }
        for(int i=0;i<capacity;i++){
            myQueue.offerLast(i);
        }
        System.out.println("Исходная очередь имеет вид: "+ myQueue);
        System.out.println("Размер очереди равен = "+ myQueue.size());
        for (int i=capacity;i<capacity+offset;i++){
            myQueue.offerLast(i);
        }
        System.out.println();
        System.out.println("Исходная очередь после добавления " + offset+" дополнительных ээлементов имеет вид: ");
        System.out.println(myQueue);
        System.out.println("Размер очереди теперь равен = "+ myQueue.size());
        System.out.println();
        System.out.println("Первый элемент очереди равен = "+ myQueue.peek());
        System.out.println();
        System.out.println("Последний элемент очереди равен = "+ myQueue.pollLast());
        System.out.println("Исходная очередь после извлечения последнего элемента с помощью pollLast имеет вид: ");
        System.out.println(myQueue);
    }




}