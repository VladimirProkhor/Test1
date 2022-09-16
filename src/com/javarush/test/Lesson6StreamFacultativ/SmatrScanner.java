package com.javarush.test.Lesson6StreamFacultativ;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.stream.Collectors;

public class SmatrScanner {

    public static final String SMARTPHONES_TXT = "Smartphones.txt";
    public static final char COMMA = ',';
    public static final char DOT = '.';
    public static final String SEPARATOR = "\\s+";
    public static final String SPACE = " ";

    public static void main(String[] args) throws IOException {
        //Считываем файл из папки resourser;
        String fileName = Objects.requireNonNull(SmatrScanner.class.getClassLoader()
                        .getResource(SMARTPHONES_TXT))
                .toString().replace("file:/","");
        var phonePrice = Files.readAllLines(Path.of(fileName))
                .stream()
                .map(s -> s.replace(COMMA, DOT))
                .map(SmatrScanner::getPhone)
                .filter(phone -> phone.getFullPrice()>15)
                .sorted(Comparator.comparing(Phone::getFullPrice))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(phonePrice);
    }

    private static Phone getPhone(String line) {
        String[] array = line.split(SEPARATOR);
        Phone phone = new Phone();
        int n = array.length;
        phone.setFullPrice(Double.parseDouble(array[n-1]));
        phone.setDiscountPrice(Double.parseDouble(array[n-2]));
        phone.setColor(array[n-3]);
        phone.setRaw(array[n-4]);
        phone.setVendor(array[1]);
        String model=String.join(SPACE,Arrays.copyOfRange(array,2,n-4));
        phone.setModel(model);
        return phone;
    }

}



class Phone{
    private String vendor;
    private String model;
    private String raw;
    private String color;
    private double discountPrice;
    private double fullPrice;

// equals and HashCode делаем чтобы коректно работало с map;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(vendor, phone.vendor) && Objects.equals(model, phone.model) && Objects.equals(raw, phone.raw) && Objects.equals(color, phone.color) && Objects.equals(discountPrice, phone.discountPrice) && Objects.equals(fullPrice, phone.fullPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendor, model, raw, color, discountPrice, fullPrice);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", raw='" + raw + '\'' +
                ", color='" + color + '\'' +
                ", discountPrice='" + discountPrice + '\'' +
                ", fullPrice='" + fullPrice + '\'' +
                '}'+ "\n";
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(Double fullPrice) {
        this.fullPrice = fullPrice;
    }

}