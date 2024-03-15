import java.util.regex.Pattern;

public class sumBigInteger {

        public static String addStrings(String num1, String num2) {


           num1=num1.replace(",","");
           num2=num2.replace(",","");


            System.out.println("printing num1 after comma ermove"+num1.toString());
            System.out.println("printing num2 after comma ermove"+num2.toString());
            StringBuilder result = new StringBuilder();
            // Make sure num1 is the longer number
            if (num1.length() < num2.length()) {
                String temp = num1;
                num1 = num2;
                num2 = temp;
            }

            int carry = 0;
            int i = num1.length() - 1;
            int j = num2.length() - 1;

            while (i >= 0 || j >= 0) {

                    int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
                    int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;

                    int sum = digit1 + digit2 + carry;
                    result.append(sum % 10);
                    carry = sum / 10;

                i--;
                j--;
            }

            if (carry != 0) {
                result.append(carry);
            }
            System.out.println("length"+result.length());
             return  result.reverse().toString();


        }

    public static String fibonacci(int n) {
        if (n <= 2) {
            return "1";
        }

        String fibPrev = "1";
        String fibCurr = "1";

        for (int i = 3; i <= n; i++) {
            String fibNext = addStrings(fibPrev, fibCurr);
            fibPrev = fibCurr;
            fibCurr = fibNext;
        }

        return fibCurr;
    }

        public static void main(String[] args) {
          String str1 = "3333311111111111";
            String str2 = "44422222221111";

           System.out.println(addStrings(str1, str2));


           int n = 10; // The position of the Fibonacci number to compute

            String fibonacciNumber = fibonacci(n);
            System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
        }
    }


