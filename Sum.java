public class Sum {
    public static void main(String args[]) {
    int counter;
    int sum=0;
    int[] numbers = {1,2,3,4,5,6,7};

    for(counter=0;counter<=6;counter++){
        System.out.println(numbers[counter]+"\n");
        sum+=numbers[counter];
      }
       System.out.println("sum ="+ sum);
    }
}