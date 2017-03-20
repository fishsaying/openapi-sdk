package com.fishsaying.oauth.client;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.sun.org.apache.regexp.internal.recompile;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.Interceptor.Chain;


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
		OkHttpClient client = new OkHttpClient().newBuilder()
		// 借助构建器builder 设置更多的client参数
//		client.newBuilder().addInterceptor(new Interceptor() {
//			
//			public Response intercept(Chain chain) throws IOException {
//				// TODO Auto-generated method stub
//				chain.request().
//				return null;
//			}
//		})
		.connectTimeout(30, TimeUnit.SECONDS).build();
		return client;
	}

}
