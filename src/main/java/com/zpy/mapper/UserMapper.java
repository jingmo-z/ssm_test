package com.zpy.mapper;

import com.zpy.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zpy
 */
@Repository
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user values(null,#{username},#{password})")
    void save(User user);
}
