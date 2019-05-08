public class Painting {
   public static void main(String[] args) {
      double johnTotalTime = 5;
      double johnTotalArea = 3;
      double jennyTotalTime = 15;
      double jennyTotalArea = 7;
      double totalArea = 56;
      
      double johnAreaPerHour = johnTotalArea/johnTotalTime;
      double jennyAreaPerHour = jennyTotalArea/jennyTotalTime;
      double totalAreaPerHour = johnAreaPerHour + jennyAreaPerHour;
      
      double totalTime = totalArea/totalAreaPerHour;   
      
      System.out.println("Total time taken: "+totalTime);

      double areaPaintedByJohn = johnAreaPerHour*totalTime;
      double areaPaintedByJenny = jennyAreaPerHour*totalTime;

      System.out.println("Area painted by John: "+areaPaintedByJohn);
      System.out.println("Area painted by Jenny: "+areaPaintedByJenny);
   }
}