package com.kidayuga.demo.dao;

import com.kidayuga.demo.entity.UserMasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserMasterDaoImpl implements UserMasterDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    private static final String SELECT_ALL_QUERY =
            "SELECT " +
            "  user_id " +
            " ,user_name " +
            " ,email " +
            "FROM " +
            "  user_master ";

    @Override
    public List<UserMasterEntity> selectAll() {
        return jdbcTemplate.query(SELECT_ALL_QUERY, new BeanPropertyRowMapper<>(UserMasterEntity.class));
    }
}
