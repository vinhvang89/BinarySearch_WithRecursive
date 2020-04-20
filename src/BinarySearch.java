import java.security.cert.TrustAnchor;

public  class  BinarySearch {
      static  int[] numbers = {1,2,3,5,8,13,21,34,55,89,134,223,357,590,947};
      public static void search(int number){
          search(number,0,numbers.length-1);
      }
      public static void search( int number,int lowest, int highest) {
          int mid =  (lowest + highest)/2;
          if( highest >= lowest) {
              if (number > numbers[mid]) {
                  lowest = mid + 1;
                  search(number,lowest,highest);
              } else if (number < numbers[mid]) {
                  highest = mid - 1;
                  search(number,lowest,highest);
              } else {
                  System.out.println("True");
              }
          }
          else
              System.out.println("False");

      }

}
