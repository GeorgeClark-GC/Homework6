public class Main {
    public static void main(String[] args) {
        System.out.println("Example1");
        for(int i = 0; i <= 10; i++ )
        {
            System.out.println(i);
        }
        System.out.println("Example2");
        for(int a = 10; a >= 1; a--)
        {
            System.out.println(a);
        }
        System.out.println("Example3");
        for(int b = 0; b <= 17; b = b + 2)
        {
                 System.out.println(b);
        }
        System.out.println("Example4");
        for(int c = 10; c >= -10; c--)
        {
            System.out.println(c);
        }
        System.out.println("Example5");
        for(int year = 1904; year <= 2096; year = year + 4)
        {
            System.out.println(year + " год является високосным");
        }
        System.out.println("Example6");
        for(int number = 7; number <= 98; number = number + 7)
        {
            System.out.println(number);
        }
        System.out.println("Example7");
        for(int numberBinary = 1; numberBinary <= 512; numberBinary = numberBinary * 2)
        {
            System.out.println(numberBinary);
        }
        System.out.println("Example8");
        int savings = 29000;
        for(int month = 1; month <= 12; month++)
        {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
            savings = savings + 29000;
        }
        System.out.println("Example9");
        int bankSavings = 29000;
        for(int month = 1; month <= 12; month++)
        {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + bankSavings + " рублей");
            bankSavings = bankSavings + 29000;
            bankSavings = bankSavings + (bankSavings/100);
        }
        System.out.println("Example10");
        int count = 2;
        int summ = 0;
        for(int multiplier = 1; multiplier <= 10; multiplier++)
        {
            summ = count * multiplier;
            System.out.println(count + "*" + multiplier + "=" + summ);
        }
    }
}