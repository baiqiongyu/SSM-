import com.dao.UserDao;
import com.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:ApplicationContext.xml"})
public class userTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void queryAll(){
        List<User> users=userDao.selectAll();
        for(User u:users){
          System.out.println(u.toString());
        }
    }

}
