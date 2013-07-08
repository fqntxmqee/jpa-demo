/**
 * 
 */
package org.fqntx.jpa.demo.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.IntSequenceGenerator;

/**
 * @author <a href="mailto:guoqing.huang@foxmail.com">Guoqing Huang</a>
 * 
 * @since 2013-7-8
 * @version
 */
@Data
@Entity
@ToString
@EqualsAndHashCode(exclude = { "id" })
@JsonIdentityInfo(generator = IntSequenceGenerator.class, property = "@TRole", scope = TRole.class)
public class TRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1361705494149248925L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(unique = true, nullable = false)
	private String code;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private Set<TUser> users;
}
