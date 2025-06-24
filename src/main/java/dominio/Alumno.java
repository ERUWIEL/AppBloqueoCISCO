package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author LABCISCO-PC036
 */
@Entity
@Table(name = "Carreras")
public class Alumno implements Serializable {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", length = 50 , nullable = false)
    private String nombre;
    
    @Column(name = "apellidoPaterno", length = 50 , nullable = false)
    private String apellidoPaterno;
    
    @Column(name = "apellidoMaterno", length = 50 , nullable = false)
    private String apellidoMaterno;
    
    @Column(name = "contraseña", length = 100 , nullable = false)
    private String contraseña;
    
    @Column(name = "estado",  nullable = false)
    private  boolean estado;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idCarrera")
    private Carrera carrera;
    
    @OneToMany(mappedBy = "Bloqueo")
    private List<Bloqueo> bloqueos;
    
    @OneToMany(mappedBy = "Reservacion")
    private List<Reservacion> reservaciones;

    public List<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
        public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    public Long getId() {
        return id;
    }

    public List<Bloqueo> getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(List<Bloqueo> bloqueos) {
        this.bloqueos = bloqueos;
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
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Alumno[ id=" + id + " ]";
    }
    
}
