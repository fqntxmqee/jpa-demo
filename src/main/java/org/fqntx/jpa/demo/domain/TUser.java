
package org.fqntx.jpa.demo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.fqntx.jpa.demo.util.ConstantUtils;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.IntSequenceGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
@JsonIdentityInfo(generator = IntSequenceGenerator.class, property = "@TUser", scope = TUser.class)
public class TUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1150822550791477845L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String username;

	private String password;

	@JsonFormat(pattern = ConstantUtils.DEF_TIME_FORMAT)
	@DateTimeFormat(pattern = ConstantUtils.DEF_TIME_FORMAT)
	private Date createTime;

	@JsonFormat(pattern = ConstantUtils.DEF_TIME_FORMAT)
	@DateTimeFormat(pattern = ConstantUtils.DEF_TIME_FORMAT)
	private Date modifyTime;

	private boolean enabled;
}
