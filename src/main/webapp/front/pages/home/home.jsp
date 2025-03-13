<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!-- 首页 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>首页</title>
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<body>

		<div id="app">
			<!-- 轮播图 -->
			<div class="layui-carousel" id="swiper">
				<div carousel-item id="swiper-item">
					<div v-for="(item,index) in swiperList" v-bind:key="index">
						<img class="swiper-item" :src="item.img">
					</div>
				</div>
			</div>
			<!-- 轮播图 -->

			
                                                            <!-- 推荐 -->
			<div class="recommend-container">
				<h2 class="index-title">Recommend</h2>
				<div class="line-container">
					<p class="line"> 特产商品推荐 </p>
				</div>
				<div class="recommend-list">
					<ul class="recommend-item">
						<li v-for="(item,index) in techanshangpinRecommend" v-bind:key="index" @click="jump('../techanshangpin/detail.jsp?id='+item.id)">
						
                                                                                                                                                                                                                                                            
                            <img :src="item.tupian?item.tupian.split(',')[0]:''" width="218" height="218">
                            
                                                                                                                                                                                                                                                                                                                                                                                                        
							                                                                                                                
                            <a class="img" href="#" :title="item.shangpinmingcheng"></a>
                            <a class="wor" href="#" :title="item.shangpinmingcheng">{{item.shangpinmingcheng}}</a>
                            
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        							
						</li>
					</ul>
				</div>
			</div>
			<!-- 推荐 -->
                                                                                                                                                                                                            
            
			
																																																												
			
			
																																																												

		</div>

		<script src="../../layui/layui.js"></script>
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>

		<script>
			var vue = new Vue({
				el: '#app',
				data: {
                    
                    
                                                                                                    // 推荐数据
					techanshangpinRecommend: [],
                                                                                                                                                                                                                                                                                                                                                    

                    
					                                                                                                                                                                                                                                                                                                                                                                                            

                    // 轮播图
					swiperList: [{
						img: '../../img/banner.jpg'
					}],
					// 新闻资讯
					leftNewsList: [],
					rightNewsList: []
				},
				filters: {
					newsDesc: function(val) {
						if (val) {
							if (val.length > 60) {
								return val.substring(0, 60).replace(/<[^>]*>/g).replace(/undefined/g, '');
							} else {
								return val.replace(/<[^>]*>/g).replace(/undefined/g, '');
							}
						}
						return '';
					}
				},
				methods: {
					jump(url) {
						jump(url)
					}
				}
			})

			layui.use(['layer', 'form', 'element', 'carousel', 'http', 'jquery'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var form = layui.form;
				var carousel = layui.carousel;
				var http = layui.http;
				var jquery = layui.jquery;

				// 获取轮播图 数据
				http.request('config/list', 'get', {
					page: 1,
					limit: 5
				}, function(res) {
					if (res.data.list.length > 0) {
						var swiperItemHtml = '';
						for (let item of res.data.list) {
							if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
								swiperItemHtml +=
									'<div>' +
									'<img class="swiper-item" src="' + item.value + '">' +
									'</div>';
							}
						}
						jquery('#swiper-item').html(swiperItemHtml);
						// 轮播图
						carousel.render({
							elem: '#swiper',
							width: swiper.width,height:swiper.height,
							arrow: swiper.arrow,
							anim: swiper.anim,
							interval: swiper.interval,
							indicator: swiper.indicator
						});
					}
				});
                
                
				                                                                                                                                                                                                                                                                                                                
                
                
                                                                                // 获取推荐信息
				http.request(`techanshangpin/autoSort?limit=4`, 'get', {
					page: 1,
					limit: 4
				}, function(res) {
					vue.techanshangpinRecommend = res.data.list
				});
                                                                                                                                                                                                                                                                                
				
                
                                                                                                                                                                                                                                                                                                                                
				
			});
		</script>
	</body>
</html>
