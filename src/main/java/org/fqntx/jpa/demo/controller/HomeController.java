/**
 * 
 */
package org.fqntx.jpa.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author <a href="mailto:guoqing.huang@foxmail.com">Guoqing Huang</a>
 *
 * @since 2013-7-5
 * @version
 */
@Controller
@RequestMapping("")
public class HomeController extends BaseController {

	@RequestMapping("/")
	public String index() {
		return "/index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "/login";
	}
	
	@RequestMapping(value = "/api", method = RequestMethod.GET)
    public String api() {
        return "/api";
    }
}
