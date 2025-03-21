package com.dao;

import com.entity.DiscusstechanshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstechanshangpinVO;
import com.entity.view.DiscusstechanshangpinView;


/**
 * 特产商品评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-25 18:12:48
 */
public interface DiscusstechanshangpinDao extends BaseMapper<DiscusstechanshangpinEntity> {
	
	List<DiscusstechanshangpinVO> selectListVO(@Param("ew") Wrapper<DiscusstechanshangpinEntity> wrapper);
	
	DiscusstechanshangpinVO selectVO(@Param("ew") Wrapper<DiscusstechanshangpinEntity> wrapper);
	
	List<DiscusstechanshangpinView> selectListView(@Param("ew") Wrapper<DiscusstechanshangpinEntity> wrapper);

	List<DiscusstechanshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstechanshangpinEntity> wrapper);
	
	DiscusstechanshangpinView selectView(@Param("ew") Wrapper<DiscusstechanshangpinEntity> wrapper);
	
}
