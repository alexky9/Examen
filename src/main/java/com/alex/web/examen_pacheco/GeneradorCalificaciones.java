package com.alex.web.examen_pacheco;

import java.util.ArrayList;

public class GeneradorCalificaciones {
    private static ArrayList Evaluacion;
    
    ArrayList<Evaluacion> nombre=new ArrayList<Evaluacion>();
        ArrayList<Evaluacion> calificacion=new ArrayList<Evaluacion>();
        
        Evaluacion a=new Evaluacion();
        a.setNombre("Petra");
        a.setCalificacion(5.6);
        
        Evaluacion a=new Evaluacion();
        a.setNombre("jose");
        a.setCalificacion(7.4);
        
        Evaluacion a=new Evaluacion();
        a.setNombre("Roberta");
        a.setCalificacion(8.6);
        
      
    public static ArrayList generarCalificaciones(ArrayList Evaluacion) {
        return Evaluacion;
    }
    
    
}
