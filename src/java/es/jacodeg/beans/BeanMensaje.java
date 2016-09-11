/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.jacodeg.beans;

/**
 *
 * @author codix
 */

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
 
@ManagedBean
@SessionScoped
public class BeanMensaje {
  protected String remitente;
  protected String mensaje;
  protected Date   fecha;
  protected String sex;
  protected String email;
  protected String tipoMensaje = "felicitacion";
 
  //getters y setters de las propiedades...  etc.
  // hay que añadirlos aquí...

    public BeanMensaje() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(String tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }
  
 
  public void validaEmail(FacesContext context, UIComponent toValidate, Object value) throws ValidatorException {
     String correo = (String) value;
     if( ! correo.toLowerCase().matches( "^[a-z0-9]+([_\\.-][a-z0-9]+)*@([a-z0-9]+([\\.-][a-z0-9]+)*)+\\.[a-z]{2,}" ) ) {
        FacesMessage message = new FacesMessage("La dirección de email, no es correcta");
        throw new ValidatorException(message);
     }
  }
 
  public String enviarMensaje() {
     FacesMessage mensajeResultado = new FacesMessage("El mensaje ha sido enviado");
     String salida = "resultado"; //Si queremos ir al inicio (mensaje.xhtml) hay que poner salida="mensaje"
     FacesContext.getCurrentInstance().addMessage(null, mensajeResultado);
     return salida;
  }
}