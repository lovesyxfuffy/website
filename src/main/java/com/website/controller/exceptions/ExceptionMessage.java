package com.website.controller.exceptions;

/**
 * Created by Lily_ on 17/5/2.
 */
public class ExceptionMessage {

    public static final String EX_SYS = "系统走神儿了，操作失败！^_^";

    public static final String EX_USER = "获取用户信息为NULL";

    public static final String EX_PARAM = "参数错误";

    public static final String EX_PIGEON_ERROR = "调用pigeon接口异常";

    public static final String EX_MOD_ENDDATE = "修改结束时间失败";

    public static final String EX_MOD_COMPANY = "修改公司名称失败";

    public static final String EX_CREATE_FUTURE = "ResumeApplicationImpl.queryPhoto 创建future failed";

    public static final String EX_DOWNLOAD_HEAD_ICON_ERROR = "ResumeApplicationImpl.queryPhoto 下载头像文件服务异常 failed";

    public static final String EX_ADD_EDUEXP_FAILED = "添加教育经历失败";

    public static final String EX_ADD_WORKEXP_FAILED = "添加工作经历失败";

    public static final String EX_RESUME_NECESSARY_INFO_LOST = "简历必要信息缺失，覆盖失败";

    public static final String EX_MOD_FAILED = "修改失败，请刷新页面重试";

    public static final String FAIL_CREATE_RESUME = "创建简历失败";
    public static final String FAIL_PHOTO_RELATE_RESUME = "头像附件关联简历失败！";
    public static final String FAIL_UPLOAD_PHOTO = "头像上传到云盘失败！";
    public static final String EX_RESUME_NOT_EXISTS = "简历不存在或已被删除！";
    public static final String FAIL_UPLOAD_ATTACHMENT = "附件上传到云盘失败";
    public static final String FAIL_PREVIEW_FILE = "该附件不支持预览！";
    public static final String EX_EMPTY_JOB_NAME = "职位名称不能为空！";
    public static String EX_INVALID_USER_INFO = "无法获取登录用户信息，请刷新页面！";
    public static String EX_FAIL_CALL_CREATE_JOB_SERVICE = "调用创建项目服务失败！";

    public static String EX_STR_CONTAINS_EMOJI = "无法保存含有表情符号的公司名字";

    public static String EX_NO_JOB = "查询不到该项目信息！";

    public static String EX_NO_APPLYJOB = "查询不到该流程信息！";

    public static String EX_APPLYJOB_CHANGE = "流程状态已发生变化，请刷新页面后重试！";

    public static String EX_RE_ADD_APPLYJOB = "加回项目失败";

    public static String EX_NO_INTERVIEW = "查询不到面试记录信息！";

    public static String EX_FAILED_CANCEL_INTERVIEW = "取消面试失败！";

    public static final String EX_BOOK_SCHEDULE_FAIL = "预定日程失败";
    public static String EX_PROJECT_NAME_TOO_LONG = "项目名称不能超过20个字符！";
    public static String EX_FORBID_EMOJ = "禁止输入表情符号等特殊字符！";
    public static String EX_POST_FAIL = "发布失败！";

    public static final String EX_CONFIG_API = "配置中心返回值异常";
    public static final String EX_RESUME_API = "简历接口返回值异常";
    public static final String EX_RESUME_QUERY_NOT_FOUND = "查询不到该简历";


    public static final String EX_DUPLICATE_OPERATE = "操作已过时，再刷新页面之后查看最新结果";

    public static final String EX_REVIEWER_SELECT = "评审人只能选择本项目成员!";

    public static final String EX_SCHEDULE_FAILED = "获取日程信息失败!";

    public static final String EX_DUPLICATE_TAB_OPERATE = "操作失败,请刷新后重试";

}
