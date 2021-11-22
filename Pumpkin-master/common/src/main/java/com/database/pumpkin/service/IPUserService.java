package com.database.pumpkin.service;


import com.database.pumpkin.domain.entity.PUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-10-11
 */
public interface IPUserService  {
    PUser findUser(String userName);
}
