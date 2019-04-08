package com.website.dao.mappers;

import com.website.dao.po.Article;
import com.website.dao.po.ArticleExample;
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

public interface ArticleMapper {
    @SelectProvider(type=ArticleSqlProvider.class, method="countByExample")
    long countByExample(ArticleExample example);

    @DeleteProvider(type=ArticleSqlProvider.class, method="deleteByExample")
    int deleteByExample(ArticleExample example);

    @Delete({
        "delete from article",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into article (id, title, ",
        "subtitle, type, ",
        "creator, time, ",
        "content)",
        "values (#{id,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{subtitle,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, ",
        "#{creator,jdbcType=VARCHAR}, #{time,jdbcType=TIMESTAMP}, ",
        "#{content,jdbcType=LONGVARCHAR})"
    })
    int insert(Article record);

    @InsertProvider(type=ArticleSqlProvider.class, method="insertSelective")
    int insertSelective(Article record);

    @SelectProvider(type=ArticleSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="subtitle", property="subtitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    @SelectProvider(type=ArticleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="subtitle", property="subtitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Article> selectByExample(ArticleExample example);

    @Select({
        "select",
        "id, title, subtitle, type, creator, time, content",
        "from article",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="subtitle", property="subtitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    Article selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ArticleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    @UpdateProvider(type=ArticleSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleExample example);

    @UpdateProvider(type=ArticleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    @UpdateProvider(type=ArticleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Article record);

    @Update({
        "update article",
        "set title = #{title,jdbcType=VARCHAR},",
          "subtitle = #{subtitle,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=VARCHAR},",
          "time = #{time,jdbcType=TIMESTAMP},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Article record);

    @Update({
        "update article",
        "set title = #{title,jdbcType=VARCHAR},",
          "subtitle = #{subtitle,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "creator = #{creator,jdbcType=VARCHAR},",
          "time = #{time,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Article record);
}