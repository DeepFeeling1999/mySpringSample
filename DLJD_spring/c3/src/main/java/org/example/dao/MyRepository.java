package org.example.dao;

import org.example.domain.MyUser;

/**
 * @author dell
 */
public interface MyRepository {
    /**
     * 输出调用成功的语句就行
     * @param myUser 用户对象
     */
    void saveRepository(MyUser myUser);
}
