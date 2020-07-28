package org.example.dao.repositoryimp;

import org.example.dao.MyRepository;

/**
 * @author dell
 */
public class RepositoryImplement implements MyRepository {

    @Override
    public void saveRepository() {
        System.out.println("saveRepository successfully");
    }
}
