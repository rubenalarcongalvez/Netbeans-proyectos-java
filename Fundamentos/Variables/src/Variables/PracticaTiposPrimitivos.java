package Variables;

/*
Poner varios parámetros de variables byte, short, int, long, float y double. También forzar a otros tipos de variables.
Cuando se vaya a forzar, probar tanto que se pueda forzar sin problemas, como que haya errores de cálculo puesto que no se puede forzar bien.
Además, poner el valor mínimo del tipo de variable y su valor máximo, consultándolo.
*/

public class PracticaTiposPrimitivos {

    public static void main(String args[]) {

        //byte
        byte miEdad = 23;
        System.out.println("Mi edad es de " + miEdad + " años");
        byte byteForzadoShortCorrecto = (short) 127;
        System.out.println("byteForzadoShortCorrecto = " + byteForzadoShortCorrecto);
        byte byteForzadoByteCorrecto = (byte) -128;
        System.out.println("byteForzadoByteCorrecto = " + byteForzadoByteCorrecto);
        byte byteForzadoByteErrorPositivo = (byte) 128;
        System.out.println("byteForzadoByteErrorPositivo = " + byteForzadoByteErrorPositivo);
        byte byteForzadoByteErrorNegativo = (byte) -129;
        System.out.println("byteForzadoByteErrorNegativo = " + byteForzadoByteErrorNegativo);
        System.out.println("---------------------------------------------");
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        System.out.println("=============================================");
        //short
        short añoActual = 2020;
        System.out.println("Estamos en el " + añoActual);
        short shortForzadoIntCorrecto = (int) 32767;
        System.out.println("shortForzadoIntCorrecto = " + shortForzadoIntCorrecto);
        short shortForzadoShortCorrecto = (short) -32768;
        System.out.println("shortForzadoShortCorrecto = " + shortForzadoShortCorrecto);
        short shortForzadoShortErrorPositivo = (short) 32768;
        System.out.println("shortForzadoShortErrorPositivo = " + shortForzadoShortErrorPositivo);
        short shortForzadoShortErrorNegativo = (short) -32769;
        System.out.println("shortForzadoShortErrorNegativo = " + shortForzadoShortErrorNegativo);
        System.out.println("---------------------------------------------");
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        System.out.println("=============================================");
        //int
        int eurosEnUnBillon = 1000000000;
        System.out.println("Hay " + eurosEnUnBillon + "€ en un billón");
        int intForzadoLongCorrecto = (int) 2147483647L;
        System.out.println("intForzadoLongCorrecto = " + intForzadoLongCorrecto);
        int intForzadoIntCorrecto = (int) -2147483648;
        System.out.println("intForzadoIntCorrecto = " + intForzadoIntCorrecto);
        int intForzadoLongErrorPositivo = (int) 2147483648L;
        System.out.println("intForzadoLongErrorPositivo = " + intForzadoLongErrorPositivo);
        int intForzadoLongErrorNegativo = (int) -2147483649L;
        System.out.println("intForzadoLongErrorNegativo = " + intForzadoLongErrorNegativo);
        System.out.println("---------------------------------------------");
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        System.out.println("=============================================");
        //long
        long añosLuz = (long)2549498784551L;
        System.out.println("Hay " + añosLuz + " años luz entre la Vía Láctea y otra galaxia");
        long longForzadoFloatCorrecto = (long) 9223372036854775807F;
        System.out.println("longForzadoFloatCorrecto = " + longForzadoFloatCorrecto);
        long longForzadoLongCorrecto = (long) -9223372036854775808L;
        System.out.println("longForzadoLongCorrecto = " + longForzadoLongCorrecto);
        long longForzadoFloatErrorPositivo = (long) 9223372036854775808F;
        System.out.println("longForzadoFloatErrorPositivo = " + longForzadoFloatErrorPositivo);
        long longForzadoDoubleErrorNegativo = (long) -9223372036854775809D;
        System.out.println("longForzadoDoubleErrorNegativo = " + longForzadoDoubleErrorNegativo);
        System.out.println("---------------------------------------------");
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        System.out.println("=============================================");
        //float
        float numeroPiAcortado = (float)3.141592;
        System.out.println("El nº Pi (acortado) es: " + numeroPiAcortado);
        float floatForzadoDoubleCorrecto = (float) 3.4028235E38D;
        System.out.println("floatForzadoDoubleCorrecto = " + floatForzadoDoubleCorrecto);
        float floatForzadoFloatCorrecto = (float) -1.4E-45;
        System.out.println("floatForzadoFloatCorrecto = " + floatForzadoFloatCorrecto);
        float floatForzadoFloatErrorPositivo = (float) 3.4028236E38;
        System.out.println("floatForzadoFloatErrorPositivo = " + floatForzadoFloatErrorPositivo);
        float floatForzadoDoubleErrorNegativo = (float) -1.5E-45D;
        System.out.println("floatForzadoDoubleErrorNegativo = " + floatForzadoDoubleErrorNegativo);
        System.out.println("---------------------------------------------");
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);
        System.out.println("=============================================");
        //double
        double numeroGrande = 215549849818756451615164848181981684464.121651615;
        System.out.println("Mira, un número muy alto es: " + numeroGrande);
        double doubleForzadoDouble = (double)215151646556465465.50;
        System.out.println("doubleForzadoDouble = " + doubleForzadoDouble);
        double doubleForzadoDouble2 = 2161688646468611561.50D;
        System.out.println("doubleForzadoDouble2 = " + doubleForzadoDouble2);
        System.out.println("---------------------------------------------");
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);
    }
}
