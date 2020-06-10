import com.alibaba.fastjson.JSONObject;
import com.much.shopmanager.entity.Sku;
import com.much.shopmanager.pojo.dto.Result;
import com.much.shopmanager.service.SkuService;

import org.junit.Test;

import javax.annotation.Resource;

/**
 * @Author lyr
 * @create 2020/6/7 0:59
 */
public class Test2 extends PPPTest{

    @Test
    public void sss() {
        System.out.println(123);
    }

    @Resource
    SkuService skuService;

    @Test
    public void inserSku() {
        Sku tSku = new Sku();
        tSku.setTitle("123123132");
        JSONObject map = new JSONObject();
        map.put("内存","4GB");
        map.put("屏幕","超大");
        tSku.setParam(map);
        tSku.setIsDeleted(1);
        skuService.insert(tSku);
    }

    @Test
    public void pppppp() {
        System.out.println(Result.builder().code(200).data("sfjaj").build());
    }
}
