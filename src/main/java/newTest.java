import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class newTest {

    public static void  printName(){
        String firstNAme ="mouad";
        String lastNme = " ahlafi";
String fullNAme = firstNAme+lastNme;
        System.out.println(fullNAme);
    }

    public static String greetUser(String username){

        return "welcome to my website " + username ;
    }
    public static double buyCoffee( double dollars){
        double priceOFCoffee = 1.0;
        double changeLeft = dollars- priceOFCoffee;
        return changeLeft;

    }
public static void myHobbies(String[]arrayOFHobbies){
        arrayOFHobbies[0]="Soccer";
    arrayOFHobbies[1]="Karate";
 arrayOFHobbies[2]="Travelling";
    System.out.println(arrayOFHobbies[arrayOFHobbies.length]);
}
//Qa5
    public static String checkWeather (String weatherCondition , int temperature){
        if (weatherCondition.equalsIgnoreCase("hot") && temperature >80){
            return "wear shorts";}
        else if (weatherCondition.equalsIgnoreCase("cool") && temperature>50) {
            return "wear wind breakers";}
        else if (weatherCondition.equalsIgnoreCase("cold") && temperature<50) {
            return "wear a jacket";}
        else return"no such weather condition  ";

    }

    public static double areaOFTriangle (double base,double height){
        //(1/2)*b*h
        double computedArea = 0.5* base * height;
        System.out.println(computedArea);

        return computedArea;
    }






     public static void main(String[] args) {

        printName();

         System.out.println(greetUser("Ahmed20"));

         System.out.println(buyCoffee(5));

checkWeather("hot",85);

areaOFTriangle(2,3);
         System.out.println(" my Hobbies are :" + arrayOFHobbies[arrayOFHobbies.length])


int numbers = 6;
switch (numbers){
    case 1 :
        System.out.println("  you rolled a one  " );
        break;
    case 2 :
        System.out.println("  you rolled a two  " );
        break;
    case 3 :
        System.out.println("  you rolled a three  " );
        break;
    case 4 :
        System.out.println("  you rolled a four  " );
        break;
    case 5 :
        System.out.println("  you rolled a five  " );
        break;
    case 6 :
        System.out.println("  you rolled a six  " );
        break;
    default:
        System.out.println(" nothing available ");
}
         Scanner name = new Scanner(System.in);
//String userName = UserPrincipal;



    }














}
