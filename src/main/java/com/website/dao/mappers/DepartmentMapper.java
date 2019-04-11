package com.website.dao.mappers;

import com.website.dao.po.Department;
import com.website.dao.po.DepartmentExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;


@Mapper
public interface DepartmentMapper {
    @SelectProvider(type=DepartmentSqlProvider.class, method="countByExample")
    long countByExample(DepartmentExample example);

    @DeleteProvider(type=DepartmentSqlProvider.class, method="deleteByExample")
    int deleteByExample(DepartmentExample example);

    @Delete({
        "delete from department",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into department (id, departmentName, ",
        "departmentContent, departmentArticleLink)",
        "values (#{id,jdbcType=INTEGER}, #{departmentname,jdbcType=VARCHAR}, ",
        "#{departmentcontent,jdbcType=VARCHAR}, #{departmentarticlelink,jdbcType=VARCHAR})"
    })
    int insert(Department record);

    @InsertProvider(type=DepartmentSqlProvider.class, method="insertSelective")
    int insertSelective(Department record);

    @SelectProvider(type=DepartmentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="departmentName", property="departmentname", jdbcType=JdbcType.VARCHAR),
        @Result(column="departmentContent", property="departmentcontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="departmentArticleLink", property="departmentarticlelink", jdbcType=JdbcType.VARCHAR)
    })
    List<Department> selectByExample(DepartmentExample example);

    @Select({
        "select",
        "id, departmentName, departmentContent, departmentArticleLink",
        "from department",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="departmentName", property="departmentname", jdbcType=JdbcType.VARCHAR),
        @Result(column="departmentContent", property="departmentcontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="departmentArticleLink", property="departmentarticlelink", jdbcType=JdbcType.VARCHAR)
    })
    Department selectByPrimaryKey(Integer id);

    @UpdateProvider(type=DepartmentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    @UpdateProvider(type=DepartmentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    @UpdateProvider(type=DepartmentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Department record);

    @Update({
        "update department",
        "set departmentName = #{departmentname,jdbcType=VARCHAR},",
          "departmentContent = #{departmentcontent,jdbcType=VARCHAR},",
          "departmentArticleLink = #{departmentarticlelink,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Department record);
}