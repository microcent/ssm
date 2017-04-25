package cn.com.microcent.ssm.repository;

import cn.com.microcent.ssm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/4/25.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAll();

}
