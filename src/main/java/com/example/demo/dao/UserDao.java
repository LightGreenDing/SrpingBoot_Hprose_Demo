package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 用户DAO
 * @author DingJie
 */
@CacheConfig(cacheNames = "users")
public interface UserDao extends JpaRepository<User, Integer> {


    /**
     * 通过ID查询用户
     * @param id
     * @return
     */
    @Cacheable(key = "'user_'+#p0")
    User findUserById(Integer id);
    /**
     * 通过ID删除用户
     * @param id 用户id
     */
    //如果指定为 true，则方法调用后将立即清空所有缓存
    @CacheEvict(key = "'user_'+#p0", allEntries = true)
    void removeById(Integer id);

}
