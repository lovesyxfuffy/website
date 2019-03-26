package com.website.dao.mappers;

import com.website.dao.po.Article;
import com.website.dao.po.ArticleExample.Criteria;
import com.website.dao.po.ArticleExample.Criterion;
import com.website.dao.po.ArticleExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ArticleSqlProvider {

    public String countByExample(ArticleExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("article");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ArticleExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("article");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Article record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("article");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getArticlename() != null) {
            sql.VALUES("articleName", "#{articlename,jdbcType=VARCHAR}");
        }
        
        if (record.getArticletype() != null) {
            sql.VALUES("articleType", "#{articletype,jdbcType=INTEGER}");
        }
        
        if (record.getArticlecreater() != null) {
            sql.VALUES("articleCreater", "#{articlecreater,jdbcType=VARCHAR}");
        }
        
        if (record.getArticlecontent() != null) {
            sql.VALUES("articleContent", "#{articlecontent,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(ArticleExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("articleName");
        sql.SELECT("articleType");
        sql.SELECT("articleCreater");
        sql.SELECT("articleContent");
        sql.FROM("article");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(ArticleExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("articleName");
        sql.SELECT("articleType");
        sql.SELECT("articleCreater");
        sql.FROM("article");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Article record = (Article) parameter.get("record");
        ArticleExample example = (ArticleExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("article");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getArticlename() != null) {
            sql.SET("articleName = #{record.articlename,jdbcType=VARCHAR}");
        }
        
        if (record.getArticletype() != null) {
            sql.SET("articleType = #{record.articletype,jdbcType=INTEGER}");
        }
        
        if (record.getArticlecreater() != null) {
            sql.SET("articleCreater = #{record.articlecreater,jdbcType=VARCHAR}");
        }
        
        if (record.getArticlecontent() != null) {
            sql.SET("articleContent = #{record.articlecontent,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("article");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("articleName = #{record.articlename,jdbcType=VARCHAR}");
        sql.SET("articleType = #{record.articletype,jdbcType=INTEGER}");
        sql.SET("articleCreater = #{record.articlecreater,jdbcType=VARCHAR}");
        sql.SET("articleContent = #{record.articlecontent,jdbcType=LONGVARCHAR}");
        
        ArticleExample example = (ArticleExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("article");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("articleName = #{record.articlename,jdbcType=VARCHAR}");
        sql.SET("articleType = #{record.articletype,jdbcType=INTEGER}");
        sql.SET("articleCreater = #{record.articlecreater,jdbcType=VARCHAR}");
        
        ArticleExample example = (ArticleExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Article record) {
        SQL sql = new SQL();
        sql.UPDATE("article");
        
        if (record.getArticlename() != null) {
            sql.SET("articleName = #{articlename,jdbcType=VARCHAR}");
        }
        
        if (record.getArticletype() != null) {
            sql.SET("articleType = #{articletype,jdbcType=INTEGER}");
        }
        
        if (record.getArticlecreater() != null) {
            sql.SET("articleCreater = #{articlecreater,jdbcType=VARCHAR}");
        }
        
        if (record.getArticlecontent() != null) {
            sql.SET("articleContent = #{articlecontent,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ArticleExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}