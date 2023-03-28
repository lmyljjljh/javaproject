package com.lmy.Test;
import com.lmy.pojo.Category;
import com.lmy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyBatisTest {
	@Test
	public void findCategoryTest(){
		//通过工具类生成SqlSession对象
		SqlSession session = MyBatisUtils.getSession();
		//查询id为2的商品类别信息
		Category category = session.selectOne("com.lmy.mapper."
					            + "CategoryMapper.findCategoryWithProduct", 2);

		//输出查询结果
		System.out.println(category);
		//关闭SqlSession
		session.close();
	}
}