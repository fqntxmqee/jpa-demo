/**
 * 
 */
package org.fqntx.jpa.demo.service;

import org.fqntx.jpa.demo.dao.UserDetailRepository;
import org.fqntx.jpa.demo.domain.TUserDetail;
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
public class UserDetailService extends PagingAndSortingService<TUserDetail, Long> {

	@Autowired
	private UserDetailRepository userDetailRepository;
	
	@Override
	protected PagingAndSortingRepository<TUserDetail, Long> getPagingAndSortingRepository() {
		return userDetailRepository;
	}
}
