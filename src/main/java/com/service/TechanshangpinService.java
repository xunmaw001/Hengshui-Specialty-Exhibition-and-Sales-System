package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TechanshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TechanshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TechanshangpinView;


/**
 * 特产商品
 *
 * @author 
 * @email 
 * @date 2021-02-25 18:12:48
 */
public interface TechanshangpinService extends IService<TechanshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TechanshangpinVO> selectListVO(Wrapper<TechanshangpinEntity> wrapper);
   	
   	TechanshangpinVO selectVO(@Param("ew") Wrapper<TechanshangpinEntity> wrapper);
   	
   	List<TechanshangpinView> selectListView(Wrapper<TechanshangpinEntity> wrapper);
   	
   	TechanshangpinView selectView(@Param("ew") Wrapper<TechanshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TechanshangpinEntity> wrapper);
   	
}

