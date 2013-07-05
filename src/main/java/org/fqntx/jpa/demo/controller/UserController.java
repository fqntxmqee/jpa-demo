/**
 * 
 */
package org.fqntx.jpa.demo.controller;

import java.util.Date;

import org.fqntx.jpa.demo.domain.TUser;
import org.fqntx.jpa.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * @author <a href="mailto:guoqing.huang@foxmail.com">Guoqing Huang</a>
 * 
 * @since 2013-7-5
 * @version
 */
@Controller
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "", description = "User Operations")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Save an existing Object")
	@ResponseStatus(HttpStatus.CREATED)
	public TUser save(
			@ApiParam(value = "TUser object to be saved", required = true) @RequestBody TUser user) {
		user.setCreateTime(new Date());
		return userService.save(user);
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Find user by ID", responseClass = "org.fqntx.jpa.demo.domain.TUser",
		notes = "Returns an user when ID < 10. ID > 10 or nonintegers will simulate API error conditions")
	public TUser getById(
			@ApiParam(value = "ID of TUser that needs to be fetched", required = true, name = "id") @PathVariable(value = "id") Long id) {
		return userService.findOne(id);
	}

	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ApiOperation(value = "List all useres", responseClass = "org.fqntx.jpa.demo.domain.TUser")
	public Iterable<TUser> getAll() {
		return userService.findAll();
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	@ApiOperation(value = "Update an existing Object")
	public TUser update(
			@ApiParam(value = "Object that needs to be added to the store", required = true) @RequestBody TUser user) {
		user.setModifyTime(new Date());
		return userService.save(user);
	}
}
