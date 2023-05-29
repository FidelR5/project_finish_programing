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
public class JPaquete {
    private String numeroSeguimiento;
    private String remitente;
    private String destinatario;
    private String departamentoRecepcion;
    private String departamentoDestino;
    private String descripcionPaquete;
    private double peso;
    private String estado;
    private String clasificacion;

    public JPaquete(String numeroSeguimiento, String remitente, String destinatario, String departamentoRecepcion,
            String departamentoDestino, String descripcionPaquete, double peso, String estado, String clasificacion) {
        this.numeroSeguimiento = numeroSeguimiento;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.departamentoRecepcion = departamentoRecepcion;
        this.departamentoDestino = departamentoDestino;
        this.descripcionPaquete = descripcionPaquete;
        this.peso = peso;
        this.estado = estado;
        this.clasificacion = clasificacion;
    }

    // Getters y setters

    public String getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public void setNumeroSeguimiento(String numeroSeguimiento) {
        this.numeroSeguimiento = numeroSeguimiento;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDepartamentoRecepcion() {
        return departamentoRecepcion;
    }

    public void setDepartamentoRecepcion(String departamentoRecepcion) {
        this.departamentoRecepcion = departamentoRecepcion;
    }

    public String getDepartamentoDestino() {
        return departamentoDestino;
    }

    public void setDepartamentoDestino(String departamentoDestino) {
        this.departamentoDestino = departamentoDestino;
    }

    public String getDescripcionPaquete() {
        return descripcionPaquete;
    }

    public void setDescripcionPaquete(String descripcionPaquete) {
        this.descripcionPaquete = descripcionPaquete;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}


