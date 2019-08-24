import com.alibaba.fastjson.JSON;
import com.gupau.edu.vip.pattern.decorate.passport.Member;
import com.gupau.edu.vip.pattern.decorate.passport.ResultMsg;
import com.gupau.edu.vip.pattern.decorate.passport.v1.SigninServiceImpl;
import com.gupau.edu.vip.pattern.decorate.passport.v2.SiginForThirdService;
import com.gupau.edu.vip.pattern.decorate.passport.v2.SiginForThirdServiceImpl;

/**
 * SigninServiceDecorateTest类
 *
 * @author wangjixue
 * @date 2019-08-24 15:01
 */
public class SigninServiceDecorateTest {

    public static void main(String[] args) {
        SiginForThirdService service = new SiginForThirdServiceImpl(new SigninServiceImpl());
        ResultMsg<Member> response = service.regist("小王", "12345");
        System.err.println(JSON.toJSONString(response));
    }
}
