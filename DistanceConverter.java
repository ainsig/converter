/*
    *Author: Arlo Insigne
    * CMIS 242
    * Purpose: Write a program that converts miles to kilometers and Fahrenheit to Celsius
    * October 28, 2022
 */


public class DistanceConverter extends Converter{
    DistanceConverter(double input){
        super(input);
    }


    @Override
    public double convert(){
        final double METERS = 1.609;

        double kiloMeters = this.getInput() * METERS;

        if(this.getInput() > 0 || this.getInput()< 0){
            return kiloMeters;
        } else if(Double.isNaN(this.getInput())){
            return Double.NaN;
        }

        return 0;
    }

}
