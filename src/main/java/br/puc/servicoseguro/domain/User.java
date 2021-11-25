package br.puc.servicoseguro.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;


@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"dtCreation", "dtUpdate"},
        allowGetters = true)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String username;

    private String password;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date dtCreation;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date dtUpdate;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDtCreation() {
        return dtCreation;
    }

    public void setDtCreation(Date dtCreation) {
        this.dtCreation = dtCreation;
    }

    public Date getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(Date dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        if (dtCreation != null ? !dtCreation.equals(user.dtCreation) : user.dtCreation != null) return false;
        return dtUpdate != null ? dtUpdate.equals(user.dtUpdate) : user.dtUpdate == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (dtCreation != null ? dtCreation.hashCode() : 0);
        result = 31 * result + (dtUpdate != null ? dtUpdate.hashCode() : 0);
        return result;
    }
}
