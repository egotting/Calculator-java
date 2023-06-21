package service;



public class CalculatorService {
    private double num1;  //declarando as variaveis
    private double num2;
    private char mathSymbol;

    public char getMathSymbol() {
        return mathSymbol;
    }

    public void setMathSymbol(char mathSymbol){
        this.mathSymbol = mathSymbol;
    }


    public void setNum1(double num1){
        this.num1 = num1;   // declarando a variavel num1
                            // declaration the variable num1
    }

    public void setNum2(double num2){
        this.num2 = num2; // declarando a variavel num2
                          // declaration the variable num2
    }

    public double add(){
        return this.num1 + this.num2;   // somando num1 e num2
                                        // math num1 and num2
    }

    public double subtract(){   
        return this.num1 - this.num2;  //subtraindo o num1 e num2
                                       // subtract num1 and num2
    }

    public double multiply(){
        return this.num1 * this.num2; // multiplicando o num1 e num2
                                      // multiplication the num1 and num2
    }

    public double divide(){
        return this.num1 / this.num2; // dividindo o num1 e o num 2
                                      // divide the num1 and num2
    }


}
