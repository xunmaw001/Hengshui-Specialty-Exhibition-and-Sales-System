package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusstechanshangpinDao;
import com.entity.DiscusstechanshangpinEntity;
import com.service.DiscusstechanshangpinService;
import com.entity.vo.DiscusstechanshangpinVO;
import com.entity.view.DiscusstechanshangpinView;

@Service("discusstechanshangpinService")
public class DiscusstechanshangpinServiceImpl extends ServiceImpl<DiscusstechanshangpinDao, DiscusstechanshangpinEntity> implements DiscusstechanshangpinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstechanshangpinEntity> page = this.selectPage(
                new Query<DiscusstechanshangpinEntity>(params).getPage(),
                new EntityWrapper<DiscusstechanshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstechanshangpinEntity> wrapper) {
		  Page<DiscusstechanshangpinView> page =new Query<DiscusstechanshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstechanshangpinVO> selectListVO(Wrapper<DiscusstechanshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstechanshangpinVO selectVO(Wrapper<DiscusstechanshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstechanshangpinView> selectListView(Wrapper<DiscusstechanshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstechanshangpinView selectView(Wrapper<DiscusstechanshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
