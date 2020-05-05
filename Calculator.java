public class Calculator {

  public Calculator(){

  }

  public int add(int a, int b){
    return a + b;
  }

  public int subtract(int a, int b){
    return a - b;
  }

  public int multiply(int a, int b){
    return a * b;
  }

  public int divide(int a, int b){
    return a / b;
  }

  public int modulo(int a, int b){
    return a % b;
  }


  public static void main(String[] arg){
    Calculator calc = new Calculator();
    System.out.println(calc.add(5,7));
    System.out.println(calc.subtract(45,11));
    System.out.println(calc.add(300,400));

  }
}