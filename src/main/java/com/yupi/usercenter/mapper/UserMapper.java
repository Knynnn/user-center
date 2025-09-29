package com.yupi.usercenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yupi.usercenter.model.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Mapper
    List<User> selectAllUsers();

    User selectByAccount(@Param("userAccount") String userAccount);

    int updateAvatar(@Param("id") Long id, @Param("avatarUrl") String avatarUrl);


}
