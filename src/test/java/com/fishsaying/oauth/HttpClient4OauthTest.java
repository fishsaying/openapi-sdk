package com.fishsaying.oauth;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.junit.Test;



/**
 * 
 * @author wangkai
 * @2017年3月15日 下午4:18:51
 * @desc:httpclient 简单测试
 */
public class HttpClient4OauthTest {

	/*
	 * 使用okhttpclient发送简单的请求
	 */
	@Test
	public void testRate() throws Exception {
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
				.url("http://localhost:9000/access_rate/fs349330887550177280")
				.get().addHeader("cache-control", "no-cache").build();

		Response response = client.newCall(request).execute();

		System.out.println("Result: " + response.isSuccessful());
		System.out.println("Server: " + response.header("Server"));
		System.out.println("ResponseBody: " + response.body().string());
		/**
		 * 输出结果:
		 * Result: true 
		 * Server: null 
		 * ResponseBody:
		 * {"clientId":"fs349330887550177280","usedCount":200,"remainingCount":1800}
		 */
	}
	
	/**
	 * post 获取access_token
	 * @throws Exception
	 */
	@Test
	public void testGetToken() throws Exception {
		//https://api.fishsaying.com/oauth/token?client_id=fs349330887550177280&client_secret=JTbH3VYinLfvwMp8Aj88Z861bUSWYH1Y&grant_type=client_credentials&scope=read
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url("http://localhost:9000/oauth/token?client_id=fs349330887550177280&client_secret=JTbH3VYinLfvwMp8Aj88Z861bUSWYH1Y&grant_type=client_credentials&scope=read")
		  .post(null)
		  .addHeader("cache-control", "no-cache")
		  .build();

		Response response = client.newCall(request).execute();
		System.out.println("ResponseBody: " + response.body().string());
	}
	
	

}
