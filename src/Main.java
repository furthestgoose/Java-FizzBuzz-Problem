
public class Main {
    public static void main(String[] args) {
        int num = 0;
        while(num < 100){
            num++;
            if(num % 3 == 0 && num % 5 == 0){
                System.out.println(num+" FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println(num+" Fizz");
            } else if (num % 5 == 0) {
                System.out.println(num + " Buzz");
            } else {
                System.out.println(num);
            }
        }
    }
}