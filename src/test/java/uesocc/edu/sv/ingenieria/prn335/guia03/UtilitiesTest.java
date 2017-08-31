
package uesocc.edu.sv.ingenieria.prn335.guia03;

import static org.junit.Assert.*;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 *
 * @author usuario
 */
@RunWith(Arquillian.class)
public class UtilitiesTest {
    @Deployment
    public static WebArchive desplegar(){
        WebArchive salida=ShrinkWrap.create(WebArchive.class)
                .addClass(Utilities.class)
                .addAsWebInfResource(EmptyAsset.INSTANCE,"beans.xml");
        System.out.println(salida.toString(true));
        return salida;
    }
    
    @Inject
    private Utilities prueba;
    
    @ Test
    public void pruebaResumen(){
        String texto="Bienvenido a la mat ";
        String meto="Bienvenido a la mat ";
        String resultado=prueba.getResume(meto);
        assertEquals(texto, resultado);
    }
    
   @Test
    public void pruebaResume2() {
        String texto = "Hola Mundo!";
        String textEsperado = "Hola Mundo!";
        String resultado = prueba.getResume(texto);
        assertEquals(textEsperado, resultado);
     
    }
    
    @Test
    public void pruebaResume3() {
        String texto = null;
        String textEsperado = null;
        String resultado = prueba.getResume(texto);
        assertEquals(textEsperado, resultado);
     
    }
    
    @Test
    public void pruebaCapitalizar1() {
        String texto = "prueBas de UNIDAD con JUnit & arQuillian";
        String textEsperado = "Pruebas De Unidad Con Junit & Arquillian";
        String resultado = prueba.capitalizar(texto);
        assertEquals(textEsperado, resultado);
        
    }
    
    @Test
    public void pruebaCapitalizar2() {
        String texto = "";
        String textEsperado = "";
        String resultado = prueba.capitalizar(texto);
        assertEquals(textEsperado, resultado);
        
    }
    
    @Test
    public void pruebaCapitalizar3() {
        String texto = null;
        String textEsperado = null;
        String resultado = prueba.capitalizar(texto);
        assertEquals(textEsperado, resultado);
        
    }
    
    @Test
    public void pruebacontarCoincidencias1() {
        String texto = "Bienvenidos a la materiade Programación 3 Ciclo II 2017";
        String frase = "2017";
        int esperado= 1;
        int resultado = prueba.contarcoincidencias(texto,frase);
        assertEquals(esperado, resultado);
        
    }
    
    @Test
    public void pruebacontarCoincidencias2() {
        String texto = "Bienvenidos a la materiade Programación 3 Ciclo II 2017";
        String frase = "MA";
        int esperado= 2;
        int resultado = prueba.contarcoincidencias(texto,frase);
        assertEquals(esperado, resultado);
        
    }
    
    @Test
    public void pruebacontarCoincidencias3() {
        String texto = null;
        String frase = "bienvenido";
        int esperado= 0;
        int resultado = prueba.contarcoincidencias(texto,frase);
        assertEquals(esperado, resultado);
        
}
}