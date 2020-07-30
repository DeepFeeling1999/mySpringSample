package org.example.dao.repositoryimpl;

import org.example.dao.MyRepository;
import org.example.domain.MyUser;

/**
 * @author dell
 */
public class RepositoryImplement implements MyRepository {

    @Override
    public void saveRepository(MyUser myUser) {
        System.out.println(myUser);
        System.out.println("saveRepository successfully");
    }
}
