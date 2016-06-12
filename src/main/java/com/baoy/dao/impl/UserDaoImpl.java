package com.baoy.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.baoy.base.dao.JdbcTempBaseDao;
import com.baoy.bean.User;
import com.baoy.dao.UserDao;

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月22日 上午10:23:15 desc: ...
 */
@Repository
public class UserDaoImpl extends JdbcTempBaseDao implements UserDao {

    //userId,userName,password,tel,sex,description
    @SuppressWarnings("rawtypes")
    private class UserRowMapper implements RowMapper {
        public User mapRow(ResultSet rs, int i) throws SQLException {
            User u = new User();
            u.setUserId(rs.getInt("userId"));
            u.setUserName(rs.getString("userName"));
            u.setPassword(rs.getString("password"));
            u.setTel(rs.getString("tel"));
            u.setSex(rs.getString("sex"));
            u.setDescription(rs.getString("description"));
            return u;
        }
    }

    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {
        String sql = "select * from t_user";
        return this.getJdbcTemplate().query(sql, new UserRowMapper());
    }

    @Override
    public void delUserById(int userId) {
        // TODO Auto-generated method stub

    }

    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateUser(User user) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addUser(User user) {
        // TODO Auto-generated method stub

    }

}
