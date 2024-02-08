import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Никита Оржеховский");

        int[] arr = new int[10];
        double mediumArr = 0;
        int sumArr = 0;
        double mediumList = 0;
        int sumList = 0;

        for (int i = 0;i< arr.length;i++)  {
            arr[i] = in.nextInt();
            sumArr += arr[i];
            mediumArr += arr[i];
        }

        mediumArr /= arr.length;
        System.out.println(sumArr);
        System.out.println(mediumArr);

        for (int i = 0;i < arr.length;i++)  {
            if ((i+1)%5 == 0) {
                System.out.println(arr[i]);
            }
            else
                System.out.print(arr[i] + " ");
        }

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0;i < arr.length;i++) {
            list.add(in.nextInt());
            sumList += list.get(i);
            mediumList += list.get(i);
        }

        for (int i = 0;i < arr.length;i++)  {
            if ((i+1)%5 == 0) {
                System.out.println(list.get(i));
            }
            else
                System.out.print(list.get(i) + " ");
        }
        mediumList /= list.size();
        System.out.println(mediumList);
        System.out.println(sumList);


    }
}
