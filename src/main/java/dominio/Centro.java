package dominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author LABCISCO-PC036
 */
@Entity
public class Centro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "contraseña", length = 100, nullable = false)
    private String contraseña;

    @Column(name = "fechaInicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fechaFin", nullable = false)
    private LocalDate fechaFin;

    @OneToMany(mappedBy = "Computadora")
    private List<Computadora> Computadoras;

    @OneToMany(mappedBy = "CentroRegla")
    private List<CentroRegla> reglas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Computadora> getComputadoras() {
        return Computadoras;
    }

    public void setComputadoras(List<Computadora> Computadoras) {
        this.Computadoras = Computadoras;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contrasenia) {
        this.contraseña = contrasenia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<CentroRegla> getReglas() {
        return reglas;
    }

    public void setReglas(List<CentroRegla> reglas) {
        this.reglas = reglas;
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
        if (!(object instanceof Centro)) {
            return false;
        }
        Centro other = (Centro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Centro[ id=" + id + " ]";
    }

}
