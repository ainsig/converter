/*
 *Author: Arlo Insigne
 * CMIS 242
 * Purpose: Write a program that converts miles to kilometers and Fahrenheit to Celsius
 * October 28, 2022
 */

public class Converter {
    private double input;

    Converter(){

        this.input = Double.NaN;
    }

    Converter(Double input){
        this.input = input;
    }

    public void setInput(Double input){
        this.input = input;

    }

    public double getInput(){
        return this.input;
    }

    public double convert(){
        return this.input;
    }

}
