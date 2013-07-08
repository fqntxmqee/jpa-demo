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
import javax.persistence.OneToMany;

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
@JsonIdentityInfo(generator = IntSequenceGenerator.class, property = "@TOrg", scope = TOrg.class)
public class TOrg implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8153418197273115641L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Column(unique = true, nullable = false)
	private String code;
	
	@OneToMany(mappedBy = "org", fetch = FetchType.EAGER,cascade = {CascadeType.MERGE})
	private Set<TUser> users;
}
