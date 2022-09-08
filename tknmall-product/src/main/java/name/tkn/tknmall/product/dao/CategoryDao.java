package name.tkn.tknmall.product.dao;

import name.tkn.tknmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tkn
 * @email lzlj21@163.com
 * @date 2022-09-08 15:09:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
