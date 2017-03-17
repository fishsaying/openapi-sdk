package com.fishsaying.oauth.client;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;


/**
 * 
 * @author wangkai
 * @2017年3月15日 下午5:18:53
 * <p>获取httpclient</p>
 */
public class OauthHttpClient {
	
	/**
	 * 获取httpclient
	 * @return
	 */
	public static OkHttpClient getClient(){
		OkHttpClient client = new OkHttpClient();
		// 借助构建器builder 设置更多的client参数
		client.newBuilder().connectTimeout(30, TimeUnit.SECONDS).build();
		return client;
	}

}
