/*
 *Author: Arlo Insigne
 * CMIS 242
 * Purpose: Write a program that converts miles to kilometers and Fahrenheit to Celsius
 * October 28, 2022
 */

public class TemperatureConverter extends Converter{
    TemperatureConverter(Double input){

        super(input);
    }


    @Override
    public double convert(){
        double celsius = ((this.getInput() - 32) * 5)/9;

        if(this.getInput() > 0 || this.getInput()< 0){
            return celsius;
        } else if(Double.isNaN(this.getInput())){
            return Double.NaN;
        }

        return 0;
    }
}
