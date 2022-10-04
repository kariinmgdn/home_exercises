package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {

    public static void convert(double value, ConversionType conversionType) {
        double converter = conversionType.getConverter();
        System.out.println(converter * value);
    }

}
