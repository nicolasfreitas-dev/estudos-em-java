package javacore.PWrapper.test;

// AUTOBOXING => QUANDO TEMOS UM TIPO PRIMITIVO E O JAVA FAZ A CONVERSÃO AUTOMÁTICA PRA GENTE EM UM WRAPPER

// UNBOXING => QUANDO VOCÊ VAI DO WRAPPER PARA UM TIPO PRIMITIVO

// PARA TRANSFORMAR ALGUÉM EM UM WRAPPER TODAS AS CLASSES POSSUEM O METODO ESTÁTICO "parseInt/Double/Float/etc"

//

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW= 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D; // autoboxing
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing

        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("tRuE");

        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('b'));
        System.out.println(Character.toLowerCase('B'));
    }
}
