package com.shark.ssm.common;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年5月18日 下午10:21:29
 * @version 1.0
 * @since  
 */
public class Const {
	public static final String SESSION_USER = "sessionUser";
	public static final String NO_LOGIN_INTERCEPTOR_PATH = ".*/((login)|(logout)|(code)|(app)|(weixin)|(static)|(payNotify)|(payReturn)|(refundNotify)|(main)|(websocket)|(index)|(pay)|(uploadFiles)|(ueditor)|(login_toLogin)).*"; // 不对匹配该值的访问路径拦截（正则）





}
