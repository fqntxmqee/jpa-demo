/**
 * 
 */
package org.fqntx.jpa.demo.service;

import org.fqntx.jpa.demo.dao.RoleRepository;
import org.fqntx.jpa.demo.domain.TRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author <a href="mailto:guoqing.huang@foxmail.com">Guoqing Huang</a>
 *
 * @since 2013-7-5
 * @version
 */
@Service
@Transactional
public class RoleService extends PagingAndSortingService<TRole, Long> {

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	protected PagingAndSortingRepository<TRole, Long> getPagingAndSortingRepository() {
		return roleRepository;
	}
}
