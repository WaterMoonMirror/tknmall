package name.tkn.tknmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import name.tkn.common.utils.PageUtils;
import name.tkn.tknmall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author tkn
 * @email lzlj21@163.com
 * @date 2022-09-08 15:09:52
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

