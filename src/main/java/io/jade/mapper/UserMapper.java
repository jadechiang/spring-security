package io.jade.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.jade.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/23 9:36
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
