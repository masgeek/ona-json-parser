package com.tsobu.ona.database.entities.repositories
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

import com.tsobu.ona.database.entities.valsphstz.SzEntity

/**
 * 服务类
 * @author 刘前进 xindong888@163.com  www.xjke.com
 * @since 1.0.0
 */
@Repository
interface SzEntityRepository : JpaSpecificationExecutor<SzEntity>{

}