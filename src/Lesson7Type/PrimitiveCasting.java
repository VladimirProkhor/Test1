package Lesson7Type;

public class PrimitiveCasting {
    public static void main(String[] args) {
//        byte byteVal =65;
//        //расширения типа, не явным UpCasting
//        int intVal = byteVal;
//        long longVal = intVal;


////сужение типа, не явным downCasting
//        long longVal = 65;
//        int intVal = (int) longVal;
//        byte byteVal = (byte) intVal;
        int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE;

        short maxVal1= (short) maxVal;
        short minVal2 = (short) minVal;
        //приводит в двоичной кодировке строку
//        Integer.toBinaryString("4567");
         int intNumber = Integer.parseInt("1111111111111111000000000000000",2);
         short shortVal = (short) intNumber;
         System.out.println(shortVal);

    }
}
