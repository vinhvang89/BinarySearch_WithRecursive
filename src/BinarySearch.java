public  class  BinarySearch {
      static  int[] numbers = {1,2,3,5,8,13,21,34,55,89,134,223,357,590,947};
      static int i = 0;
      public static void search( int number) {
          int temp = numbers[i];
          if (temp == number) {
              System.out.println("True");
              i = 0;
          }
          else {
              i++;
              if (i < numbers.length)
                  search(number);
              else {
                  System.out.println("False");
                  i = 0;
              }
          }

      }

}
