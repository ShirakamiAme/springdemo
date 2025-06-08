package io.github.shirakamiame.mapper;

import io.github.shirakamiame.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User login(String username);
}
