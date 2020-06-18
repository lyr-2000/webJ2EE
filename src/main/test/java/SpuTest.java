import com.much.shopmanager.entity.Spu;
import com.much.shopmanager.service.SpuService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @Author lyr
 * @create 2020/6/13 19:12
 */
public class SpuTest extends PPPTest{


    @Test
    public void printSPU() {
        Spu s = new Spu();
        s.setCategoryId(21);

        System.out.println(
                spuService.queryByFuzzyName("小米","k","手机",1,12)
        );
    }
    @Resource
    private SpuService spuService;
}
