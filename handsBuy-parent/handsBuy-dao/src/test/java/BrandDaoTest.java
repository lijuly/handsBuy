import com.handsBuy.dao.BrandDao;
import com.handsBuy.entity.TbBrand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class BrandDaoTest {


    private InputStream inputStream;

    private SqlSession sqlSession;

    private BrandDao brandDao;

    //用于在测试方法执行之前执行
    @Before
    public void init()throws Exception{
        //1.读取配置文件，生成字节输入流
        inputStream = Resources.getResourceAsStream("sqlMapper.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.获取SqlSession对象
        sqlSession = factory.openSession();
        //4.获取dao的代理对象
        brandDao = sqlSession.getMapper(BrandDao.class);
    }

    //用于在测试方法执行之后执行
    @After
    public void destroy()throws Exception{
        //提交事务
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void findAll_Test() {
        List<TbBrand> brands = brandDao.findAll();
        brands.forEach(brand -> System.out.println(brand.toString()));
    }

    @Test
    public void deleteBrandByIds_Test() {
        List<TbBrand> brands = brandDao.findAll();
        brands.forEach(brand -> System.out.println(brand.toString()));
        List<Long> list = new ArrayList<>();
        list.add(37L);
        list.add(38L);
        brandDao.deleteBrandByIds(list);
        brands = brandDao.findAll();
        brands.forEach(brand -> System.out.println(brand.toString()));
    }
}
