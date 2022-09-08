package name.tkn.tknmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import name.tkn.common.utils.PageUtils;
import name.tkn.tknmall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author tkn
 * @email lzlj21@163.com
 * @date 2022-09-08 15:09:52
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

