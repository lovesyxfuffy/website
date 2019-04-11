package com.website.dao.mappers;

import com.website.dao.po.Config;
import com.website.dao.po.ConfigExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ConfigMapper {
    @SelectProvider(type=ConfigSqlProvider.class, method="countByExample")
    long countByExample(ConfigExample example);

    @DeleteProvider(type=ConfigSqlProvider.class, method="deleteByExample")
    int deleteByExample(ConfigExample example);

    @Delete({
        "delete from config",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into config (id, configName, ",
        "configContent, configType, ",
        "configModel)",
        "values (#{id,jdbcType=INTEGER}, #{configname,jdbcType=VARCHAR}, ",
        "#{configcontent,jdbcType=VARCHAR}, #{configtype,jdbcType=VARCHAR}, ",
        "#{configmodel,jdbcType=INTEGER})"
    })
    int insert(Config record);

    @InsertProvider(type=ConfigSqlProvider.class, method="insertSelective")
    int insertSelective(Config record);

    @SelectProvider(type=ConfigSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="configName", property="configname", jdbcType=JdbcType.VARCHAR),
        @Result(column="configContent", property="configcontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="configType", property="configtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="configModel", property="configmodel", jdbcType=JdbcType.INTEGER)
    })
    List<Config> selectByExample(ConfigExample example);

    @Select({
        "select",
        "id, configName, configContent, configType, configModel",
        "from config",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="configName", property="configname", jdbcType=JdbcType.VARCHAR),
        @Result(column="configContent", property="configcontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="configType", property="configtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="configModel", property="configmodel", jdbcType=JdbcType.INTEGER)
    })
    Config selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ConfigSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Config record, @Param("example") ConfigExample example);

    @UpdateProvider(type=ConfigSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Config record, @Param("example") ConfigExample example);

    @UpdateProvider(type=ConfigSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Config record);

    @Update({
        "update config",
        "set configName = #{configname,jdbcType=VARCHAR},",
          "configContent = #{configcontent,jdbcType=VARCHAR},",
          "configType = #{configtype,jdbcType=VARCHAR},",
          "configModel = #{configmodel,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Config record);
}