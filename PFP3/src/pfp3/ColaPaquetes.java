/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pfp3;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ProcesosE
 */
public class ColaPaquetes {
    
    
    private final Queue<JPaquete> colaPaquetes;

    public ColaPaquetes() {
        colaPaquetes = new LinkedList<>();
    }

    public void agregarPaquete(JPaquete paquete) {
        colaPaquetes.offer(paquete);
    }

    public JPaquete obtenerSiguientePaquete() {
        return colaPaquetes.peek();
    }

    public JPaquete eliminarSiguientePaquete() {
        return colaPaquetes.poll();
    }

    public boolean estaVacia() {
        return colaPaquetes.isEmpty();
    }

    public int tamaño() {
        return colaPaquetes.size();
    }

    public void imprimirCola() {
        
        
        System.out.println("Contenido de la cola de paquetes:");

        for (JPaquete paquete : colaPaquetes) {
            System.out.println("Número de seguimiento: " + paquete.getNumeroSeguimiento());
            System.out.println("Remitente: " + paquete.getRemitente());
            System.out.println("Destinatario: " + paquete.getDestinatario());
            System.out.println("Departamento de recepción: " + paquete.getDepartamentoRecepcion());
            System.out.println("Departamento de destino: " + paquete.getDepartamentoDestino());
            System.out.println("Descripción del paquete: " + paquete.getDescripcionPaquete());
            System.out.println("Peso: " + paquete.getPeso());
            System.out.println("Estado: " + paquete.getEstado());
            System.out.println("Clasificación: " + paquete.getClasificacion());
            System.out.println("------------------------");
        }
    }
}
