package org.example.dao.repositoryimpl;

import org.example.dao.MyRepository;
import org.example.domain.MyUser;
import org.springframework.stereotype.Repository;

/**
 * @author dell
 */
@Repository
public class OracleDao implements MyRepository {

    @Override
    public void saveRepository(MyUser myUser) {
        System.out.println(myUser);
        System.out.println("save Oracle Repository successfully");
    }
}
