package com.springmvc.Repository;

import com.springmvc.data.entity.Login;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jotaiwan on 22/07/2017.
 */
@Repository
public class LoginRepository extends AbstractRepository {

    public void saveLogin(Login login) {
        persist(login);
    }

    @SuppressWarnings("unchecked")
    public List<Login> findAll() {
        Criteria criteria = getSession().createCriteria(Login.class);
        return (List<Login>) criteria.list();
    }
}
