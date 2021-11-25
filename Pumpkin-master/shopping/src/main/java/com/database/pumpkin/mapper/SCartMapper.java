package com.database.pumpkin.mapper;

import com.database.pumpkin.domain.entity.SCart;
import com.database.pumpkin.mapper.base.MyMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whl
 * @since 2021-11-23
 */
@Repository
public interface SCartMapper extends MyMapper<SCart> {
    void deleteByKey(SCart sCart);
    void updateCart(SCart sCart);
}
