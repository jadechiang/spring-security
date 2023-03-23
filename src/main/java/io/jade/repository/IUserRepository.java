package io.jade.repository;

import com.baomidou.mybatisplus.extension.service.IService;
import io.jade.entity.User;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/23 9:34
 */
public interface IUserRepository extends IService<User> {
    /**
     * @param name 用户名
     */
    User getByUsername(String name);
}
