/**
 * 
 */
package org.fqntx.jpa.demo.controller;

import org.fqntx.jpa.demo.domain.TRole;
import org.fqntx.jpa.demo.service.RoleService;
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
@RequestMapping(value = "/role", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "", description = "Role Operations")
public class RoleController extends BaseController {

	@Autowired
	private RoleService roleService;

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Save an existing Object")
	@ResponseStatus(HttpStatus.CREATED)
	public TRole save(
			@ApiParam(value = "TRole object to be saved", required = true) @RequestBody TRole role) {
		return roleService.save(role);
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Find role by ID", notes = "Returns an role when ID < 10. ID > 10 or nonintegers will simulate API error conditions")
	public TRole getById(
			@ApiParam(value = "ID of TRole that needs to be fetched", required = true, name = "id") @PathVariable(value = "id") Long id) {
		return roleService.findOne(id);
	}

	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ApiOperation(value = "List all rolees")
	public Iterable<TRole> getAll() {
		return roleService.findAll();
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	@ApiOperation(value = "Update an existing Object")
	public TRole update(
			@ApiParam(value = "Object that needs to be added to the store", required = true) @RequestBody TRole role) {
		return roleService.save(role);
	}
}
