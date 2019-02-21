package atguigu.com;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

public class testJedis {
	
	@SuppressWarnings("source")
	@Test
	public void test() {
		
		Jedis jedis = new Jedis("192.168.218.218",6379);
		
		String pong = jedis.ping();
		
		System.out.println(pong);
		System.out.println(pong);
	}
	
}
