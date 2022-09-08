package name.tkn.tknmall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import name.tkn.common.utils.PageUtils;
import name.tkn.common.utils.Query;

import name.tkn.tknmall.product.dao.CategoryDao;
import name.tkn.tknmall.product.entity.CategoryEntity;
import name.tkn.tknmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 筛选出所有一级分类

        return entities.stream().
                filter((categoryEntity) -> categoryEntity.getParentCid() == 0)
                .peek(entity -> entity.setChildren(getChildrens(entity,entities)))
                .sorted(Comparator.comparingInt(entity->entity.getSort()==null?0:entity.getSort()))
                .collect(Collectors.toList());

    }
    /**
     * 递归找所有的子菜单、中途要排序
     * @param entity
     * @param entities
     * @return
     */
    private List<CategoryEntity> getChildrens(CategoryEntity entity, List<CategoryEntity> entities) {
        return  entities.stream().
                filter((categoryEntity) -> categoryEntity.getParentCid().equals(entity.getCatId()))
                .map(menu -> { menu.setChildren(getChildrens(menu,entities));
                    return menu;
                })
                .sorted(Comparator.comparingInt(menu->menu.getSort()==null?0:menu.getSort()))
                .collect(Collectors.toList());
    }

}
