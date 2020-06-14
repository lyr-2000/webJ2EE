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
        System.out.println(
                spuService.queryShowSpu(0,1)
        );
    }
    @Resource
    private SpuService spuService;
}
