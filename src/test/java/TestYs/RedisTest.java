package TestYs;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ys.entity.Goods;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpathspring-beans.xml")
public class RedisTest {
	RedisTemplate redisTemplate;
	//获取文件内容
	@Test
	public void UntilFiles() {
		File file = new File("src/test/resource/files");
		for (int i = 0; i <= 106; i++) {
			
		}
	}
	
	
	
//		(1)在Redis服务器定义一个key为goods_list，value为list类型。（2分）
	@Test
	public void RedisList() {
		Goods goods = new Goods();
//		然后将解析出来的106个Goods对象使用Java编程依次添加到list类型的value中。（6
		for (int i = 0; i <= 106; i++) {
			goods.setId(i);
			goods.setName("张"+i);
			//goods.setPrice();
			goods.setBaifen("60%");
			redisTemplate.opsForList().set("prodect", i, goods);
		}
		
	}
	@Test
	public void RedisSet() {
		Goods goods = new Goods();
		for (int i = 0; i <= 106; i++) {
			goods.setId(i);
			goods.setName("张"+i);
			//goods.setPrice();
			goods.setBaifen("60%");
			redisTemplate.opsForSet().add("prodect", goods);
		
		}
	}
}
