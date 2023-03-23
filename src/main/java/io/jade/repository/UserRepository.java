package io.jade.repository;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.jade.entity.User;
import io.jade.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/23 9:35
 */
@Service
public class UserRepository extends ServiceImpl<UserMapper, User> implements IUserRepository {
    @Override
    public User getByUsername(String name) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, name);
        wrapper.last("limit 1");
        return getOne(wrapper);
    }
}
