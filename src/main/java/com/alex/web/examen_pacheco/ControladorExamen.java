
package com.alex.web.examen_pacheco;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControladorExamen {
    private String ArrayList;
    
    @RequestMapping(value="/servicio-calificaciones",method=RequestMethod.GET,headers={"Accept=text/html"})
    
    public @ResponseBody String algo(){
        
        return ArrayList;
        
    }
}
