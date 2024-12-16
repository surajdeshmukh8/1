import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first no.");
            String input1 = sc.nextLine();
            System.out.println("Enter second no.");
            String input2 = sc.nextLine();
            
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            int result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " : " + result);}

        catch (Exception e) {
            System.out.println(e);}

         try{
            int arr[] = {10, 20, 30};
            System.out.println("Enter the index of element to be found");
            int key = sc.nextInt();
            System.out.println(arr[key]);}
        catch (Exception e) {
            System.out.println(e);
        }  

	finally {
            System.out.println("Program executed successfully");
        }
    }
}