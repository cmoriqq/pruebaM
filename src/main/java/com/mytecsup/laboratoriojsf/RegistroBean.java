/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mytecsup.laboratoriojsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class RegistroBean {

    private String nombres;
    private String paterno;
    private String materno;
    private String clave;
    private String clave2;
    private String sexo;
    private String[] sisop;
    private String claveMensaje;

    public String[] getSisop() {
        return sisop;
    }

    public void setSisop(String[] sisop) {
        this.sisop = sisop;
    }

    public void registrar() {
        System.out.println("Sexo: " + sexo);
        System.out.println("Total Sistemas: " + sisop.length);
        if (clave.equals(clave2)) {
            claveMensaje = "Las claves sí coinciden";
        } else {
            claveMensaje = "Las claves no coinciden";
        }
    }

    public String getClaveMensaje() {
        return claveMensaje;
    }

    public void setClaveMensaje(String claveMensaje) {
        this.claveMensaje = claveMensaje;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave2() {
        return clave2;
    }

    public void setClave2(String clave2) {
        this.clave2 = clave2;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
