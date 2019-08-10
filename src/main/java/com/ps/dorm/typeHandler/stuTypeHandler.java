package com.ps.dorm.typeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/24 14:18
 */
public class stuTypeHandler extends BaseTypeHandler {

    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String[] strings, JdbcType jdbcType) throws SQLException {
        StringBuffer sb = new StringBuffer();
        for(String s  : strings) {
            sb.append(",").append(s);
        }
        preparedStatement.setString(i, sb.substring(1).toString());
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public Object getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return resultSet.getString(s).split(",");
    }

    @Override
    public Object getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getString(i).split(",");
    }

    @Override
    public Object getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return new String[0];
    }
}
