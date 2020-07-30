package org.example.service.imp;

import org.example.dao.MyRepository;
import org.example.dao.repositoryimpl.OracleDao;
import org.example.dao.repositoryimpl.RepositoryImplement;
import org.example.domain.MyUser;
import org.example.service.MyUserService;


/**
 * @author dell
 */
public class UserServiceImpl implements MyUserService {

    private MyRepository userRepositoryImplement;

    @Override
    public void userService(MyUser myUser) {
        userRepositoryImplement.saveRepository(myUser);
        System.out.println("user service set successfully");
    }

    public void setUserRepositoryImplement(MyRepository userRepositoryImplement) {
        this.userRepositoryImplement=userRepositoryImplement;
    }
}
