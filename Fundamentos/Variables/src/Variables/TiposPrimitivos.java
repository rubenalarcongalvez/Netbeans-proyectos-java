package Variables;

//Explicación
public class TiposPrimitivos {

    public static void main(String args[]) {
        /*
            Tipos primitivos enteros: byte, short, int, long
        */
        
        //Tipo byte
        byte numeroByte = 10;
        System.out.println("Valor byte: " + numeroByte);
        byte numeroByteErroneo = (byte)129; //No es recomendable forzar a un tipo erróneo
        System.out.println("Valor byte erróneo: " + numeroByteErroneo);
        float valorFloat = (float)225.29;
        System.out.println("Valor float correcto: " + valorFloat);
        System.out.println("--------------------------");
        
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        
        System.out.println("");
        //Tipo short
        short numeroShortErroneo = (short)32768;
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numeroShortErroneo = " + numeroShortErroneo);
        System.out.println("--------------------------");        
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        
        System.out.println("");
        //Tipo int
        int numeroInt = 10;
        int numeroIntErroneo = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("numeroIntErroneo = " + numeroIntErroneo);
        System.out.println("--------------------------");     
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        
        System.out.println("");
        //Tipo long
        long numeroLong = 10;
        long numeroLongErroneo = (long)9223372036854775808F;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("numeroLongErroneo = " + numeroLongErroneo);
        System.out.println("--------------------------");     
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);

        System.out.println("");
        /*
            Tipos primitivos flotantes: float, double
        */
        
        //Tipo float
        float numeroFloat = (float)10.0;
        float numeroFloatErroneo = (float)3.4028236E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("numeroLongErroneo = " + numeroFloatErroneo);
        System.out.println("--------------------------");     
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE); 
        
        System.out.println("");
        //Tipo double
        double numeroDouble = 10;
        double numeroDoubleMaximo = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("numeroDoubleErroneo = " + numeroDoubleMaximo);
        System.out.println("--------------------------");     
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE); 
    }
}
