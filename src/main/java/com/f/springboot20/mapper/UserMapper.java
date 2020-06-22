package com.f.springboot20.mapper;

import com.f.springboot20.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    User Sel(int id);

    @Select("SELECT username FROM tb_user WHERE id = #{id}")
    User getNameById(int id);

    User login(String userName, String passWord);

    int register(User user);
}
