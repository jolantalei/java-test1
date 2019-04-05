public class Task3 {
    public static void main(String[] args) {
        int count, num1 = 0, num2 = 1;
        System.out.println("How may numbers :");
        count = 40;
        System.out.println("Fibonacci Series of "+count+" numbers:");
        int i=1;
        while(i<=count)
        {
            System.out.println(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;

        }

    }
}
