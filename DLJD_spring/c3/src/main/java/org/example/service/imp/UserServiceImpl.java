package org.example.service.imp;

import org.example.dao.MyRepository;
import org.example.dao.repositoryimpl.OracleDao;
import org.example.dao.repositoryimpl.RepositoryImplement;
import org.example.domain.MyUser;
import org.example.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.namespace.QName;


/**
 * @author dell
 */
@Service("userService")
public class UserServiceImpl implements MyUserService {

    private MyRepository myRepository;


    public UserServiceImpl(){
        System.out.println("无参");
    }

    @Autowired
    public UserServiceImpl(@Qualifier("oracleDao") MyRepository myRepository){
        this.myRepository=myRepository;
    }

    @Override
    public void userService(MyUser myUser) {
        myRepository.saveRepository(myUser);
        System.out.println("user service set successfully");
    }

}
