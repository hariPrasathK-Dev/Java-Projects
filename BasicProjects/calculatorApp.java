import java.util.Scanner;

class InputValues 
{
    int a;
    int b;

    InputValues(int a, int b) 
    {
        this.a = a;
        this.b = b;
    }
}

class calculatorServices 
{
    public void add(int a,int b)
    {
        System.out.println("The sum of "+a+" and "+b+" is : "+(a+b));
    }

    public void subtract(int a,int b)
    {
        System.out.println("The diffrence of "+a+" and "+b+" is : "+(a-b));
    }

    public void multiply(int a,int b)
    {
        System.out.println("The product of "+a+" and "+b+" is : "+(a*b));
    }
    

    public void divide(int a,int b)
    {
        if(b == 0) throw new ArithmeticException("Division by Zero is not possible!") ;
        System.out.println("The diffrence of "+a+" and "+b+" is : "+(a-b));
    }
}

public class calculatorApp 
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int choice = 0;
        do 
        {

            System.out.println("1) Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Exit");

            System.out.println("\n Enter your Choice : ");
            choice = scanner.nextInt();

            calculatorServices calculator = new calculatorServices();
            try
            {
                switch (choice) 
                {
                    case 1:
                        InputValues values = userInput();
                        int a = values.a;
                        int b = values.b;
                        calculator.add(a,b) ;
                        break;

                    case 2 : 
                        values = userInput() ;
                        a = values.a ;
                        b = values.b ;
                        calculator.subtract(a,b) ;
                        break ;
                    
                    case 3 : 
                        values = userInput() ;
                        a = values.a ;
                        b = values.b ;
                        calculator.multiply(a,b) ;
                        break ;

                    case 4 : 
                        values = userInput() ;
                        a = values.a ;
                        b = values.b ;
                        calculator.divide(a,b) ;
                        break ;
                    case 5 : 
                        System.out.println("Exiting the Calculator Operation !");
                        break ;
                    
                    default : 
                        System.out.println("Please  enter a valid Choice !");

                };
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        } while (choice != 5);
    }

    private static InputValues userInput() {
        System.out.println("Enter the first number : ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int b = scanner.nextInt();

        return new InputValues(a, b);
    }
}