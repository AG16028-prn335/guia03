/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

@LocalBean
@Dependent
public class Utilities implements Serializable{
    /**
     * 
     * @param texto
     * @return 
     */
    public String getResume(String texto){
        String cadena="";
      if(texto.length()<20){
          cadena=texto;
      }else{
          for(int i =0; i<20;i++) {
              cadena+=texto.charAt(i);  
            }
      }
        return cadena;
    }
     
    /**
     * 
     * @param texto
     * @return 
     */
    public String capitalizar(String texto){
        
        String cadena="",caracter,mayus;
        if(texto==null){
            cadena=null;
        }else
            texto=texto.toLowerCase();
        if(!texto.equals("")){
            for(int i=0;i<texto.length();i++){
                caracter=String.valueOf(texto.charAt(i));
                if(i>0){
                    if(caracter.equals(" ")){
                        if(caracter.equals(String.valueOf(texto.charAt(i-1)))){                                
                        }else{   
                          cadena+=texto.charAt(i);
                        }  
                        
                    }else{
                           if (String.valueOf(texto.charAt(i-1)).equals(" ")){
                              cadena+=String.valueOf(texto.charAt(i)).toUpperCase(); 
                           }else{
                               cadena+=texto.charAt(i);
                           }
                    }
                }else{
                    cadena+=String.valueOf(texto.charAt(i)).toUpperCase();
                }
            }    
        }  
        return cadena;
    }
   
    /**
     * 
     * @param frase
     * @param texto
     * @return 
     */
        public int contarcoincidencias(String frase,String texto){
        int cantidad=0,t=0;
       String coincidencia;
        for(int i=frase.length();i<=texto.length();i++,t++){  
            coincidencia="";
            for(int j=0+t;j<frase.length()+t;j++){
               coincidencia+=String.valueOf(texto.charAt(j));
            }
            if(frase.equalsIgnoreCase(coincidencia)){
                cantidad++;
            } 
        }
        return cantidad;
        
}
    
}
