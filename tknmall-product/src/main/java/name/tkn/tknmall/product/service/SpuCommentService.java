package name.tkn.tknmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import name.tkn.common.utils.PageUtils;
import name.tkn.tknmall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * ??Ʒ???
 *
 * @author tkn
 * @email lzlj21@163.com
 * @date 2022-09-07 13:52:45
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
