package com.entity.view;

import com.entity.DiscusstechanshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特产商品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-25 18:12:48
 */
@TableName("discusstechanshangpin")
public class DiscusstechanshangpinView  extends DiscusstechanshangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstechanshangpinView(){
	}
 
 	public DiscusstechanshangpinView(DiscusstechanshangpinEntity discusstechanshangpinEntity){
 	try {
			BeanUtils.copyProperties(this, discusstechanshangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
