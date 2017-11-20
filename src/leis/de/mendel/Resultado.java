/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leis.de.mendel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author marco
 */
@Entity
@Table(name = "resultado", catalog = "mendel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Resultado.findAll", query = "SELECT r FROM Resultado r")
    , @NamedQuery(name = "Resultado.findByIdresultado", query = "SELECT r FROM Resultado r WHERE r.idresultado = :idresultado")
    , @NamedQuery(name = "Resultado.findByEmail", query = "SELECT r FROM Resultado r WHERE r.email = :email")
    , @NamedQuery(name = "Resultado.findByDescricao", query = "SELECT r FROM Resultado r WHERE r.descricao = :descricao")
    , @NamedQuery(name = "Resultado.findByData", query = "SELECT r FROM Resultado r WHERE r.data = :data")
    , @NamedQuery(name = "Resultado.findByHora", query = "SELECT r FROM Resultado r WHERE r.hora = :hora")
    , @NamedQuery(name = "Resultado.findByResultado", query = "SELECT r FROM Resultado r WHERE r.resultado = :resultado")})
public class Resultado implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idresultado")
    private Integer idresultado;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Basic(optional = false)
    @Column(name = "resultado")
    private String resultado;

    public Resultado() {
    }

    public Resultado(Integer idresultado) {
        this.idresultado = idresultado;
    }

    public Resultado(Integer idresultado, String email, String descricao, Date data, Date hora, String resultado) {
        this.idresultado = idresultado;
        this.email = email;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.resultado = resultado;
    }

    public Integer getIdresultado() {
        return idresultado;
    }

    public void setIdresultado(Integer idresultado) {
        Integer oldIdresultado = this.idresultado;
        this.idresultado = idresultado;
        changeSupport.firePropertyChange("idresultado", oldIdresultado, idresultado);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        Date oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        Date oldHora = this.hora;
        this.hora = hora;
        changeSupport.firePropertyChange("hora", oldHora, hora);
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        String oldResultado = this.resultado;
        this.resultado = resultado;
        changeSupport.firePropertyChange("resultado", oldResultado, resultado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idresultado != null ? idresultado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultado)) {
            return false;
        }
        Resultado other = (Resultado) object;
        if ((this.idresultado == null && other.idresultado != null) || (this.idresultado != null && !this.idresultado.equals(other.idresultado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "leis.de.mendel.Resultado[ idresultado=" + idresultado + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
