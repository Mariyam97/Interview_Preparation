
public class FactorialOf10 {
public static void main(String[] args) {
    
    int num=10;
    int fact=1;

    for(int i=1;i<=num;i++){
        fact*=i;
    }
    System.out.println("Factorial of 10 :" + fact);
}
}
