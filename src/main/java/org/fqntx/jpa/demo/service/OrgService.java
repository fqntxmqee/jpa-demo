/**
 * 
 */
package org.fqntx.jpa.demo.service;

import org.fqntx.jpa.demo.dao.OrgRepository;
import org.fqntx.jpa.demo.domain.TOrg;
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
public class OrgService extends PagingAndSortingService<TOrg, Long> {

	@Autowired
	private OrgRepository orgRepository;
	
	@Override
	protected PagingAndSortingRepository<TOrg, Long> getPagingAndSortingRepository() {
		return orgRepository;
	}
}
