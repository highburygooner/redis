package net.yunxi.dwl.redis;

import redis.clients.jedis.Jedis;

public class myRedis {
	 private Jedis jedis; 
	  public void setup() {
          //连接redis服务器，192.168.0.100:6379
          jedis = new Jedis("192.168.3.165", 6379);
          //权限认证
          jedis.auth("admin");  
      }
}
