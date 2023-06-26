/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
package examenmayo2022;

import inspectores.InspectorSanidad;
import inspectores.Sancion;
import inspectores.InspectorJefe;

public class ExamenMayo2022 {
    
    private static void imponerSancion(InspectorSanidad ins, double importe){
        new Sancion(ins.getCodigo(), importe);
        ins.actualizarSueldo();
    }

    public static void main(String[] args)
    {        
        InspectorSanidad p1 = new InspectorSanidad("Sergio");
        InspectorJefe p2 = new InspectorJefe("Anselmo");
        InspectorSanidad p3 = new InspectorSanidad("Pepe");
        InspectorSanidad p4 = new InspectorSanidad("Ernesto");
        
        ServicioInspeccion central = new ServicioInspeccion();
        central.insertarInspector(p1);
        central.insertarInspector(p2);
        central.insertarInspector(p3);
        central.insertarInspector(p4);
        
        imponerSancion(p1,150);
        imponerSancion(p1,300);
        imponerSancion(p4,700);
        imponerSancion(p1,500);
                
        
        System.out.println("INSPECTORES Y SANCIONES ORDENADOS POR CODIGO INSPECTOR");
        System.out.println(central.mostrarTodosInspectoresYSancionesOrdenadoPorCodigo());
        System.out.println("\n\nINSPECTORES (SIN INFO SANCIONES) ORDENADOS POR NOMBRE");
        System.out.println(central.mostrarTodosInspectoresOrdenadoPorNombre());
        System.out.println("\n");
        System.out.printf("El número de sanciones es %d",Sancion.numeroSanciones());
        System.out.println("\n\nINSPECTORES (SIN INFO SANCIONES) QUE HAN PUESTO SANCIONES");
        System.out.println(central.mostrarInspectoresPonenSanciones());
    }
    
}