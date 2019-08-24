import com.alibaba.fastjson.JSON;
import com.gupau.edu.vip.pattern.decorate.batter.v1.BatterCake;
import com.gupau.edu.vip.pattern.decorate.batter.v1.BatterCakeWithEgg;
import com.gupau.edu.vip.pattern.decorate.batter.v1.BattercakeWithEggAndSausage;

/**
 * BatterCake类
 * 继承
 * @author wangjixue
 * @date 2019-08-24 13:38
 */
public class BatterCakeTest {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.err.println("原生："+ JSON.toJSONString(batterCake));
        batterCake=new BatterCakeWithEgg();
        System.err.println("egg："+ JSON.toJSONString(batterCake));
        batterCake=new BattercakeWithEggAndSausage();
        System.err.println("egg+sausage："+ JSON.toJSONString(batterCake));

    }
}
