package org.fqntx.jpa.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.IntSequenceGenerator;

/**
 * 
 * @author <a href="mailto:guoqing.huang@foxmail.com">Guoqing Huang</a>
 * 
 * @since 2013-7-5
 * @version
 */
@Data
@Entity
@ToString
@EqualsAndHashCode(exclude = { "id" })
@JsonIdentityInfo(generator = IntSequenceGenerator.class, property = "@TUserDetail", scope = TUserDetail.class)
public class TUserDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1150822550791477845L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private TUser user;

	private String des;
}
