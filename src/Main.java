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
             if (b>0) {
                 System.out.println(b);
             }
             //Поставил условие "если", поскольку 0 не является четным числом, а без
             //этого условия в консоль он выводится.
        }

    }
}