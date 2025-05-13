import java.util.*;
class forEachLoop {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // normal for loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        // enhanced for loop
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // forEach method   
        numbers.forEach(i->System.out.print(i + " "));
        System.out.println();
    }
}

// external loops -> normal and enhanced for loop
// internal loop -> forEach method (Java8)