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
@Table(name = "Computadoras")
public class Computadora implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "numero", nullable =  false)
    private int numero;
    
    @Column(name = "IP",length = 39 , nullable =  false)
    private String ip;
    
    @Column(name = "estado", nullable =  false)
    private boolean estado;
    
    @OneToMany(mappedBy = "Reservacion")
    private List<Reservacion> reservaciones;
    
    @OneToMany(mappedBy = "Instalacion")
    private List<Instalacion> Instalaciones;
    
    @ManyToOne()
    @JoinColumn(name = "idCentro")
    private Centro centro;

    public List<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }

    public List<Instalacion> getInstalaciones() {
        return Instalaciones;
    }

    public void setInstalaciones(List<Instalacion> Instalaciones) {
        this.Instalaciones = Instalaciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Centro getCentro() {
        return centro;
    }

    public void setCentro(Centro centro) {
        this.centro = centro;
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
        if (!(object instanceof Computadora)) {
            return false;
        }
        Computadora other = (Computadora) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Computadora[ id=" + id + " ]";
    }
    
}
