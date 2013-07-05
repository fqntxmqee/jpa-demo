package org.fqntx.jpa.demo.exp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author <a href="mailto:guoqing.huang@foxmail.com">Guoqing Huang</a>
 *
 * @since 2013-7-5
 * @version
 */
@XmlRootElement
public class ErrorMessage {

	@Setter @Getter
	private List<String> errors;

	public ErrorMessage() {
	}

	public ErrorMessage(List<String> errors) {
		this.errors = errors;
	}

	public ErrorMessage(String error) {
		this(Collections.singletonList(error));
	}

	public ErrorMessage(String... errors) {
		this(Arrays.asList(errors));
	}
}