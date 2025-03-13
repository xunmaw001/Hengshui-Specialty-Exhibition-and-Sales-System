package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstechanshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstechanshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstechanshangpinView;


/**
 * 特产商品评论表
 *
 * @author 
 * @email 
 * @date 2021-02-25 18:12:48
 */
public interface DiscusstechanshangpinService extends IService<DiscusstechanshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstechanshangpinVO> selectListVO(Wrapper<DiscusstechanshangpinEntity> wrapper);
   	
   	DiscusstechanshangpinVO selectVO(@Param("ew") Wrapper<DiscusstechanshangpinEntity> wrapper);
   	
   	List<DiscusstechanshangpinView> selectListView(Wrapper<DiscusstechanshangpinEntity> wrapper);
   	
   	DiscusstechanshangpinView selectView(@Param("ew") Wrapper<DiscusstechanshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstechanshangpinEntity> wrapper);
   	
}

