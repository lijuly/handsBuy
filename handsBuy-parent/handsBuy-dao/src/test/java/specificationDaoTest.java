import com.handsBuy.dao.SpecificationDao;
import com.handsBuy.entity.TbSpecification;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class SpecificationDaoTest {

/**
    private InputStream inputStream;

    private SqlSession sqlSession;

    private SpecificationDao specificationDao;

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
        specificationDao = sqlSession.getMapper(SpecificationDao.class);
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
        List<TbSpecification> specifications = specificationDao.findAll();
        specifications.forEach(specification -> System.out.println(specification.toString()));
    }*/
}
