package edu.ucsd.cs110.temperature;

import com.sun.prism.impl.FactoryResetException;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
         Fahrenheit temp = new Fahrenheit((super.getValue() - 32) * (5/9));
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }


    public String toString()
    {
        return Float.toString(super.value);
    }
}

