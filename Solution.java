import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        if(number1 == number2 && number2 == number3){
            System.out.println(number1);
        }else if(number1 == number2 && number2 != number3){
            System.out.println(number1);
        }else if(number2 == number3 && number1 != number2){
            System.out.println(number2);
        }else if(number1 == number3 && number1 != number2){
            System.out.println(number1);
        }else{
            int max = (number1 > number2 ? number1 : number2) > (number2 > number3 ? number2 : number3) ? (number1 > number2 ? number1 : number2) : (number2 > number3 ? number2 : number3);
            int min = (number1 < number2 ? number1 : number2) < (number2 < number3 ? number2 : number3) ? (number1 < number2 ? number1 : number2) : (number2 < number3 ? number2 : number3);
            if(number1 != max && number1 != min){
                System.out.println(number1);
            }else if(number2 != max && number2 != min){
                System.out.println(number2);
            }else if(number3 != max && number3 != min){
                System.out.println(number3);
            }
        }
    }
}