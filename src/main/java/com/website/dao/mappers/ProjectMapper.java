package com.website.dao.mappers;

import com.website.dao.po.Project;
import com.website.dao.po.ProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ProjectMapper {
    @SelectProvider(type=ProjectSqlProvider.class, method="countByExample")
    long countByExample(ProjectExample example);

    @DeleteProvider(type=ProjectSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProjectExample example);

    @Delete({
        "delete from project",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into project (id, projectName, ",
        "projectSubtitle, articleLink, ",
        "projectImgUrl)",
        "values (#{id,jdbcType=INTEGER}, #{projectname,jdbcType=VARCHAR}, ",
        "#{projectsubtitle,jdbcType=VARCHAR}, #{articlelink,jdbcType=VARCHAR}, ",
        "#{projectimgurl,jdbcType=VARCHAR})"
    })
    int insert(Project record);

    @InsertProvider(type=ProjectSqlProvider.class, method="insertSelective")
    int insertSelective(Project record);

    @SelectProvider(type=ProjectSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="projectName", property="projectname", jdbcType=JdbcType.VARCHAR),
        @Result(column="projectSubtitle", property="projectsubtitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="articleLink", property="articlelink", jdbcType=JdbcType.VARCHAR),
        @Result(column="projectImgUrl", property="projectimgurl", jdbcType=JdbcType.VARCHAR)
    })
    List<Project> selectByExample(ProjectExample example);

    @Select({
        "select",
        "id, projectName, projectSubtitle, articleLink, projectImgUrl",
        "from project",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="projectName", property="projectname", jdbcType=JdbcType.VARCHAR),
        @Result(column="projectSubtitle", property="projectsubtitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="articleLink", property="articlelink", jdbcType=JdbcType.VARCHAR),
        @Result(column="projectImgUrl", property="projectimgurl", jdbcType=JdbcType.VARCHAR)
    })
    Project selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ProjectSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    @UpdateProvider(type=ProjectSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    @UpdateProvider(type=ProjectSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Project record);

    @Update({
        "update project",
        "set projectName = #{projectname,jdbcType=VARCHAR},",
          "projectSubtitle = #{projectsubtitle,jdbcType=VARCHAR},",
          "articleLink = #{articlelink,jdbcType=VARCHAR},",
          "projectImgUrl = #{projectimgurl,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Project record);
}