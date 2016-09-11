# Ejemplo sencillo de JSF

He seguido el articulo de la web http://www.notodocodigo.com/introduccion-a-jsf/

Importante: 

Si se sigue el ejemplo:
(1) Hay que crear los metodos setters y getters del bean BeanMensaje.java.

(2) He creado un paquete es.jacodeg.beans donde colocar el código del bean.

(3) También hay que crear las páginas confirmar.xhml y resultado.xhml tomando como
ejemplo mensaje.xhtml cambiando las etiquetas facelets de input a output ...

(4) He añadido en a la página index.xhtml del proyecto un link a mensaje.xhtml

(5) Para que funcione todo correctamente y no de un error Not Found Context o 
algo así, en web.xml  cambiar el patrón URL
            <servlet-mapping>
                    <servlet-name>Faces Servlet</servlet-name>
            <!--        <url-pattern>/faces/*</url-pattern>-->
                    <url-pattern>*.xhtml</url-pattern>
                </servlet-mapping>
