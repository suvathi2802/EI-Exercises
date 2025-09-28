interface SortStrategy {
 void sort(int[] data);
}

//Concrete Strategy: QuickSort
class QuickSort implements SortStrategy {
 @Override
 public void sort(int[] data) {
     System.out.println("Sorting using QuickSort");
 }
}

//Concrete Strategy: MergeSort
class MergeSort implements SortStrategy {
 @Override
 public void sort(int[] data) {
     System.out.println("Sorting using MergeSort");
 }
}

//Context Class
class Sorter {
 private SortStrategy strategy;

 public Sorter(SortStrategy strategy) {
     this.strategy = strategy;
 }

 public void setStrategy(SortStrategy strategy) {
     this.strategy = strategy;
 }

 public void sort(int[] data) {
     strategy.sort(data);
 }
}

//Main Class
public class Strategy {
 public static void main(String[] args) {
     Sorter sorter = new Sorter(new QuickSort());
     sorter.sort(new int[]{3, 1, 2});

     sorter.setStrategy(new MergeSort());
     sorter.sort(new int[]{3, 1, 2});
 }
}
