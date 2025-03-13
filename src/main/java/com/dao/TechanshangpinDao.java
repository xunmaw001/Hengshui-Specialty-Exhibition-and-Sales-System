package com.dao;

import com.entity.TechanshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TechanshangpinVO;
import com.entity.view.TechanshangpinView;


/**
 * 特产商品
 * 
 * @author 
 * @email 
 * @date 2021-02-25 18:12:48
 */
public interface TechanshangpinDao extends BaseMapper<TechanshangpinEntity> {
	
	List<TechanshangpinVO> selectListVO(@Param("ew") Wrapper<TechanshangpinEntity> wrapper);
	
	TechanshangpinVO selectVO(@Param("ew") Wrapper<TechanshangpinEntity> wrapper);
	
	List<TechanshangpinView> selectListView(@Param("ew") Wrapper<TechanshangpinEntity> wrapper);

	List<TechanshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<TechanshangpinEntity> wrapper);
	
	TechanshangpinView selectView(@Param("ew") Wrapper<TechanshangpinEntity> wrapper);
	
}
