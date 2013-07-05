/**
 * 
 */
package org.fqntx.jpa.demo.exp;

import org.springframework.http.HttpStatus;

/**
 * 
 * @author <a href="mailto:guoqing.huang@foxmail.com">Guoqing Huang</a>
 *
 * @since 2013-7-5
 * @version
 */
public class HttpStatusException extends MsgCodeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -906836925420941108L;

	/**
	 * default 500
	 * 
	 * @param msg
	 */
	public HttpStatusException(String msg) {
		this(500, msg);
	}
	
	public HttpStatusException(int code, String msg) {
		super(code, msg);
	}
	
	public HttpStatusException(HttpStatus status) {
        super(status.value(), status.toString());
    }
	
	public HttpStatus getStatus() {
        return HttpStatus.valueOf(getCode());
    }
}
