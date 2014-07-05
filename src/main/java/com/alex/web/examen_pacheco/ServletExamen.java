
package com.alex.web.examen_pacheco;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExamen extends HttpServlet {

    protected void doGET(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        RequestDispatcher despachador=request.getRequestDispatcher("/presentación.jsp");
        despachador.forward(request, response);
     
        Evaluacion a=new Evaluacion();
        a.setNombre("Ana");
        a.setCalificacion(7);
        
    }

   

}
