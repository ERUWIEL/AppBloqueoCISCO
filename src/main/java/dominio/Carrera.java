package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author LABCISCO-PC036
 */
@Entity
@Table(name = "Carreras")
public class Carrera implements Serializable {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @Column(name = "nombre", length = 50 , nullable = false)
     private String nombre;
     
     @Column(name = "tiempoLimite", nullable = false)
     private int tiempoLimite;
     
     @Column(name = "telefono", length = 12 ,nullable = false)
     private String telefono;
     
     @OneToMany(mappedBy = "cliente")
     private List<Alumno> alumnos;

    public String getNombre() {
        return nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoLimite() {
        return tiempoLimite;
    }

    public void setTiempoLimite(int tiempoLimite) {
        this.tiempoLimite = tiempoLimite;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     
     
     
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrera)) {
            return false;
        }
        Carrera other = (Carrera) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Carrera[ id=" + id + " ]";
    }
    
}
