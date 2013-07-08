/**
 * 
 */
package org.fqntx.jpa.demo.controller;

import org.fqntx.jpa.demo.domain.TUserDetail;
import org.fqntx.jpa.demo.service.UserDetailService;
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
@RequestMapping(value = "/userDetail", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "", description = "UserDetail Operations")
public class UserDetailController extends BaseController {

	@Autowired
	private UserDetailService userDetailService;

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Save an existing Object")
	@ResponseStatus(HttpStatus.CREATED)
	public TUserDetail save(
			@ApiParam(value = "TUserDetail object to be saved", required = true) @RequestBody TUserDetail userDetail) {
		return userDetailService.save(userDetail);
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Find userDetail by ID", notes = "Returns an userDetail when ID < 10. ID > 10 or nonintegers will simulate API error conditions")
	public TUserDetail getById(
			@ApiParam(value = "ID of TUserDetail that needs to be fetched", required = true, name = "id") @PathVariable(value = "id") Long id) {
		return userDetailService.findOne(id);
	}

	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ApiOperation(value = "List all userDetailes")
	public Iterable<TUserDetail> getAll() {
		return userDetailService.findAll();
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	@ApiOperation(value = "Update an existing Object")
	public TUserDetail update(
			@ApiParam(value = "Object that needs to be added to the store", required = true) @RequestBody TUserDetail userDetail) {
		return userDetailService.save(userDetail);
	}
}
