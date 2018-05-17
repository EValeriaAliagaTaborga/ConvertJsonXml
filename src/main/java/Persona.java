import javax.xml.bind.annotation.*;

@XmlRootElement(name = "persona")
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona {

    public String nombre;
    public int edad;
    public String direccion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }


    public String getDireccion() {
        return direccion;
    }


    public int getEdad() {
        return edad;
    }
}