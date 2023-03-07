import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int dob;
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth : ");
        dob = scanner.nextInt();
        System.out.println("*************************");
        scanner.close();
         int reminder = dob % 12;
         String chineseZodiac = "";
         switch(reminder){
             case 0:
                 chineseZodiac = "Monkey";
                 break;
             case 1:
                 chineseZodiac = "Rooster";
                 break;
             case 2:
                 chineseZodiac = "Dog";
                 break;

             case 3:
                 chineseZodiac = "Pig";
                 break;
             case 4:
                 chineseZodiac = "Mouse";
                 break;
             case 5:
                 chineseZodiac = "Ox";
                 break;
             case 6:
                 chineseZodiac = "Tiger";
                 break;
             case 7:
                 chineseZodiac = "Rabbit";
                 break;
             case 8:
                 chineseZodiac = "Dragon";
                 break;
             case 9:
                 chineseZodiac = "Snake";
                 break;
             case 10:
                 chineseZodiac = "Horse";
                 break;
             case 11:
                 chineseZodiac = "Sheep";
                 break;
             default:

         }
        System.out.println("Your chinese zodiac is : " + chineseZodiac);

    }
}