
package org.fqntx.jpa.demo.exp;

/**
 * 
 * @author <a href="mailto:guoqing.huang@foxmail.com">Guoqing Huang</a>
 *
 * @since 2013-7-5
 * @version
 */
public class MsgCodeException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -4746879548614736465L;
    
    private int code;

    public MsgCodeException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
