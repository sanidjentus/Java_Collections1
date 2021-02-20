import java.util.*;

public class Main {
    public static void main(String[] args){
        int[] size = new int[] {2000, 50000, 100000};
        System.out.println("-------------------------------------------");
        System.out.println("\t | List size | ArrayList | LinkedList |");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 3; i++){
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();

            System.out.print("Add  | ");
            System.out.printf("%8d", size[i]);
            System.out.print("  |");
            System.out.printf("%11d", new TimeCheck().addCheckTime(arrayList, size[i]));
            System.out.print("|");
            System.out.printf("%12d", new TimeCheck().addCheckTime(linkedList, size[i]));
            System.out.println("|");
            System.out.println("-------------------------------------------");

            System.out.print("Get  | ");
            System.out.printf("%8d", size[i]);
            System.out.print("  |");
            System.out.printf("%11d", new TimeCheck().getCheckTime(arrayList,  size[i]));
            System.out.print("|");
            System.out.printf("%12d", new TimeCheck().getCheckTime(linkedList,  size[i]));
            System.out.println("|");
            System.out.println("-------------------------------------------");

            System.out.print("Del  | ");
            System.out.printf("%8d", size[i]);
            System.out.print("  |");
            System.out.printf("%11d", new TimeCheck().deleteCheckTime(arrayList,  size[i]));
            System.out.print("|");
            System.out.printf("%12d", new TimeCheck().deleteCheckTime(linkedList,  size[i]));
            System.out.println("|");
            System.out.println("-------------------------------------------");
            System.out.println("-------------------------------------------");
        }
    }
}