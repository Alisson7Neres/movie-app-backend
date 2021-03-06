package br.com.filmes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_contato")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = true)
	private String name;
	
	@Column(nullable = true)
	private String email;
	
	@Column(nullable = true)
	private String password;
	
	public void id (Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void name(String name) {
		if(name.trim() != null) {
			this.name = name;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		if(email.trim() != null) {
			this.email = email;
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String password) {
		if(password.trim() != null) {
			this.password = password;
		}
	}
	
	public String getPassword() {
		return password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
