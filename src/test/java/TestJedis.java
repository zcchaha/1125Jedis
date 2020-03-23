import org.junit.Test;
import redis.clients.jedis.Jedis;

public class TestJedis {
    @Test
    public void test(){
        Jedis jedis = new Jedis("192.168.77.168",6379);
        String ping = jedis.ping();
        jedis.sadd("zc","haha");
        System.out.println(jedis.get("zcc"));
        System.out.println("ping===>"+ping);
    }
}
