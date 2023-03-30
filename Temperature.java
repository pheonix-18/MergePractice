package MergePractice;
import MergePractice.Calculator;

public class Temperature {
    double fahrenheit;
    double celsius;
    Temperature(){
        fahrenheit = 0;
        celsius = 0;
    }
    double CelsiumToFarenheit(double celsius){
        this.celsius = celsius;
        this.fahrenheit = Calculator.add(Calculator.multiply(celsius,  Calculator.divide(9, 5)),32);
        return this.fahrenheit;
    }
    double FarenheitToCelsius(double fahrenheit){
        this.fahrenheit = fahrenheit;
        this.celsius = Calculator.multiply(Calculator.subtract(fahrenheit, 32), Calculator.divide(5, 9));
        return this.celsius;
    }
}
