import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
@IdClass(CasaId.class)
public class Casa implements Serializable{
	
	
	@Id
	@OneToOne
	@JoinColumn(name="PROP_ID")
	private Pessoa proprietario;
	
	@Id
	@OneToOne
	@JoinColumn(name="INQ_ID")
	private Pessoa inquilino;
	
	private String cor;
	
	public Casa(){}
	
	public Casa(Pessoa proprietario, Pessoa inquilino, String cor){
		this.proprietario = proprietario;
		this.inquilino = inquilino;
		this.cor = cor;
		
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

	public Pessoa getInquilino() {
		return inquilino;
	}

	public void setInquilino(Pessoa inquilino) {
		this.inquilino = inquilino;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((inquilino == null) ? 0 : inquilino.hashCode());
		result = prime * result + ((proprietario == null) ? 0 : proprietario.hashCode());
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
		Casa other = (Casa) obj;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (inquilino == null) {
			if (other.inquilino != null)
				return false;
		} else if (!inquilino.equals(other.inquilino))
			return false;
		if (proprietario == null) {
			if (other.proprietario != null)
				return false;
		} else if (!proprietario.equals(other.proprietario))
			return false;
		return true;
	}
	
	
	
	
}
