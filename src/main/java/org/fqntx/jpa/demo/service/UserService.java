/**
 * 
 */
package org.fqntx.jpa.demo.service;

import org.fqntx.jpa.demo.dao.UserRepository;
import org.fqntx.jpa.demo.domain.TUser;
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
public class UserService extends PagingAndSortingService<TUser, Long> {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	protected PagingAndSortingRepository<TUser, Long> getPagingAndSortingRepository() {
		return userRepository;
	}
	
	@Transactional(readOnly = true)
	public TUser findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}
