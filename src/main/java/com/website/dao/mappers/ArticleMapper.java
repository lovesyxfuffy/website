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
        "insert into article (id, articleName, ",
        "articleType, articleCreater, ",
        "articleContent)",
        "values (#{id,jdbcType=INTEGER}, #{articlename,jdbcType=VARCHAR}, ",
        "#{articletype,jdbcType=INTEGER}, #{articlecreater,jdbcType=VARCHAR}, ",
        "#{articlecontent,jdbcType=LONGVARCHAR})"
    })
    int insert(Article record);

    @InsertProvider(type=ArticleSqlProvider.class, method="insertSelective")
    int insertSelective(Article record);

    @SelectProvider(type=ArticleSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="articleName", property="articlename", jdbcType=JdbcType.VARCHAR),
        @Result(column="articleType", property="articletype", jdbcType=JdbcType.INTEGER),
        @Result(column="articleCreater", property="articlecreater", jdbcType=JdbcType.VARCHAR),
        @Result(column="articleContent", property="articlecontent", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    @SelectProvider(type=ArticleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="articleName", property="articlename", jdbcType=JdbcType.VARCHAR),
        @Result(column="articleType", property="articletype", jdbcType=JdbcType.INTEGER),
        @Result(column="articleCreater", property="articlecreater", jdbcType=JdbcType.VARCHAR)
    })
    List<Article> selectByExample(ArticleExample example);

    @Select({
        "select",
        "id, articleName, articleType, articleCreater, articleContent",
        "from article",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="articleName", property="articlename", jdbcType=JdbcType.VARCHAR),
        @Result(column="articleType", property="articletype", jdbcType=JdbcType.INTEGER),
        @Result(column="articleCreater", property="articlecreater", jdbcType=JdbcType.VARCHAR),
        @Result(column="articleContent", property="articlecontent", jdbcType=JdbcType.LONGVARCHAR)
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
        "set articleName = #{articlename,jdbcType=VARCHAR},",
          "articleType = #{articletype,jdbcType=INTEGER},",
          "articleCreater = #{articlecreater,jdbcType=VARCHAR},",
          "articleContent = #{articlecontent,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Article record);

    @Update({
        "update article",
        "set articleName = #{articlename,jdbcType=VARCHAR},",
          "articleType = #{articletype,jdbcType=INTEGER},",
          "articleCreater = #{articlecreater,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Article record);
}