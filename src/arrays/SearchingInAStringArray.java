package arrays;

import java.util.Arrays;

public class SearchingInAStringArray {
    public static void main(String[] args) {
      String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

      Arrays.sort(objects);
      System.out.println((Arrays.binarySearch(objects, "Mouse") >= 0));
      System.out.println((Arrays.binarySearch(objects, "Computer") >= 0));
      System.out.println((Arrays.binarySearch(objects, "iPad") >= 0));

        System.out.println("\n=========With loop========\n");
      boolean hasMouse = false;

      for(String object : objects){
          if(object.equals("Mouse")){
              hasMouse = true;
              break;
          }
      }
        System.out.println(hasMouse);
    }
}
