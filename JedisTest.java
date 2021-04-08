package com.Adu;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisTest {
    public static void main(String[] args) {
        testJedis();
    }
    public static void testJedis(){
        //1连接redis
        Jedis jedis=new Jedis("192.168.222.131",63388);
        //操作redis
        jedis.auth("redis");
        System.out.println(jedis.get("book"));

           System.out.println(jedis.get("bo5f"));
        Set<String> sets=jedis.keys("*");
        sets.forEach(key-> System.out.println("key="+key));
        //关闭reids
        jedis.flushDB();
        jedis.close();
    }
}
