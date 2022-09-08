package name.tkn.tknmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import name.tkn.common.utils.PageUtils;
import name.tkn.tknmall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author tkn
 * @email lzlj21@163.com
 * @date 2022-09-08 15:09:52
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

