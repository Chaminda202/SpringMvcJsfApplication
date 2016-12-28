package lk.sam.common.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="APP_USER")
@NamedQuery(name="AppUser.findAll", query="SELECT a FROM AppUser a")
public class AppUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="APP_USER_ID_GENERATOR", sequenceName="APP_USER_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="APP_USER_ID_GENERATOR")
	private long id;

	private BigDecimal attempts;

	private String name;

	private String password;

	public AppUser() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAttempts() {
		return this.attempts;
	}

	public void setAttempts(BigDecimal attempts) {
		this.attempts = attempts;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}