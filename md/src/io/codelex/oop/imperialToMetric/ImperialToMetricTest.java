package io.codelex.oop.imperialToMetric;

public class ImperialToMetricTest {
    public static void main(String[] args) {
        MeasurementConverter.convert(5, ConversionType.KILOMETERS_TO_MILES);
        MeasurementConverter.convert(5, ConversionType.MILES_TO_KILOMETER);
        MeasurementConverter.convert(5, ConversionType.METERS_TO_YARDS);
        MeasurementConverter.convert(5, ConversionType.YARDS_TO_METERS);
        MeasurementConverter.convert(5, ConversionType.CENTIMETERS_TO_INCHES);
        MeasurementConverter.convert(5, ConversionType.INCHES_TO_CENTIMETERS);

    }
}
