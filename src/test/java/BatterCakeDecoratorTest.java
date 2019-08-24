import com.alibaba.fastjson.JSON;
import com.gupau.edu.vip.pattern.decorate.batter.v2.*;

/**
 * BatterCake类
 * 继承
 *
 * @author wangjixue
 * @date 2019-08-24 13:38
 */
public class BatterCakeDecoratorTest {
    public static void main(String[] args) {
        BatterCake batterCake = new BaseBatterCake();
        // 1个鸡蛋
        batterCake = new EggBatterCakeDecorator(batterCake);
        // 1个烤肠
        batterCake = new SausageBatterCakeDecorator(batterCake);
        batterCake = new EggBatterCakeDecorator(batterCake);
        batterCake = new EggBatterCakeDecorator(batterCake);
        System.err.println(JSON.toJSONString(batterCake));

    }
}
