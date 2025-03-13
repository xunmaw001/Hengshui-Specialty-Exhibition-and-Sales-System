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


import com.dao.TechanshangpinDao;
import com.entity.TechanshangpinEntity;
import com.service.TechanshangpinService;
import com.entity.vo.TechanshangpinVO;
import com.entity.view.TechanshangpinView;

@Service("techanshangpinService")
public class TechanshangpinServiceImpl extends ServiceImpl<TechanshangpinDao, TechanshangpinEntity> implements TechanshangpinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TechanshangpinEntity> page = this.selectPage(
                new Query<TechanshangpinEntity>(params).getPage(),
                new EntityWrapper<TechanshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TechanshangpinEntity> wrapper) {
		  Page<TechanshangpinView> page =new Query<TechanshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TechanshangpinVO> selectListVO(Wrapper<TechanshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TechanshangpinVO selectVO(Wrapper<TechanshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TechanshangpinView> selectListView(Wrapper<TechanshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TechanshangpinView selectView(Wrapper<TechanshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
