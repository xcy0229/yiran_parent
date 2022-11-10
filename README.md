# 依然电商

## 项目简介

依然电商是一个仿照唯品会开发的电商项目。依然电商网站有商品筛选搜索模块，商品详情模块，商品收藏模块，购物车模块，优惠券模块，订单生成模块，订单管理模块。

用户注册该平台后，可以选择手机验证码登录，或者账号密码登录平台。平台首页可以搜索想要购买的商品，也可以通过二级菜单根据不同的品类进行多条件筛选，或者点击品牌进入某个品牌的商品筛选。查看商品详情，查看评论，可以对商品进行收藏，加入购物车。选择商品进行提交订单，可以在我的订单里面查看订单详情。用户还可以领取优惠券以在购买商品的时候减免费用，提升用户的使用体验。

## 项目功能思维导图

![](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E4%BE%9D%E7%84%B6%E5%9C%A8%E7%BA%BF%E5%95%86%E5%9F%8E.png)

## 项目收获

1、通过完成这个项目增强了我独立思考和解决问题的能力，在一些业务上逐渐有了一些自己的想法。

2、在一些复杂的业务上锻炼了我的逻辑思维，养成了做业务前先梳理好业务流程的习惯，也使得我对业 务的分析考虑的更加全面。

3、项目里的很多自己负责的业务技术都是由自己通过查看 GitHub 上源码或通过网上查阅资料学习加进去的，锻炼 了我的学习能力。

4、使我对 Java 有了新的了解与认识，巩固了 Java 技术知识。

5、遇到好多有趣的高并发场景并且都独立解决了这些问题，增加了我对开发项目的兴趣与自信。

6、使我明白了团队沟通的重要性，开发项目中也会遇到一些分歧，这时候我们会去查查资料或者 请教其他同学以获得更合理的解决方案。

## 软件架构说明

该项目用到的框架是 SpringClould(Alibaba)  、Vue 

持久层由 Mybatis-plus 逆向工程生成

数据库使用的是 MySQL 8.0

## 用到的技术
JWT  
CSS  
Vue  
Java  
HTML5  
Redis  
RabbitMQ  
SpringBoot  
Element-ui  
Mybatis-plus  
沙箱支付环境  
阿里云短信服务  
阿里云OSS对象存储  
SpringClould(Alibaba)

## 系统要求

jdk             --->   1.8  
elasticsearch   --->   8.4.3   
nacos           --->   2.1.1  
mysql           --->   8.0.30  
RabbitMQ        --->   3.10.8  
Erlang          --->   25.0.1  
maven           --->   3.8.6  

## 项目前端地址


## 项目功能介绍

1. 注册，登录
       1、这里使用的RSA+AES加密，全程保证保证用户的信息安全。

![短信验证码注册](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E7%9F%AD%E4%BF%A1%E9%AA%8C%E8%AF%81%E7%A0%81%E6%B3%A8%E5%86%8C.png)
2、短信登录注册调用阿里云短信验证API，加入redis技术，将验证码放进redis五分钟，并且设置一分钟内不能再次获取验证码。

![密码登录](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E5%AF%86%E7%A0%81%E7%99%BB%E5%BD%95.png)2. 主页
       主页使用了多级菜单、品牌分类、高亮搜索![首页品牌进入专区](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E9%A6%96%E9%A1%B5%E5%93%81%E7%89%8C%E8%BF%9B%E5%85%A5%E4%B8%93%E5%8C%BA.png)

![首页多级菜单](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E9%A6%96%E9%A1%B5%E5%A4%9A%E7%BA%A7%E8%8F%9C%E5%8D%95.png)

![高亮查询](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E9%AB%98%E4%BA%AE%E6%9F%A5%E8%AF%A2.png)

3. 商品服务
       用户可以在主页查看商品进行选购。也可查看商品详情，且可多条件查询商品，根据喜好来选择自己喜欢的商品。

![商品列表](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E5%95%86%E5%93%81%E5%88%97%E8%A1%A8.png)

![商品多条件筛选](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E5%95%86%E5%93%81%E5%A4%9A%E6%9D%A1%E4%BB%B6%E7%AD%9B%E9%80%89.png)

![商品详情](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85.png)

4. 收藏模块
       首先判断用户是否登录，未登录会被拦截到登陆页面，已登录先判断用户是否已经收藏，若已收藏，点击则会取消收藏，点击我的收藏，可以看到用户已经收藏的所有商品。

   未使用的优惠券：

![未使用优惠券](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E6%9C%AA%E4%BD%BF%E7%94%A8%E4%BC%98%E6%83%A0%E5%88%B8.png)

领取优惠券页面：

![领取优惠券](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E9%A2%86%E5%8F%96%E4%BC%98%E6%83%A0%E5%88%B8.png)

已使用的优惠券页面：

![已使用优惠券](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E5%B7%B2%E4%BD%BF%E7%94%A8%E4%BC%98%E6%83%A0%E5%88%B8.png)

6. 购物车模块
       用户选购商品后加入购物车，在购物车中来选择批量结算或者单条结算。也可选择是否使用优惠券。

   ![购物车](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E8%B4%AD%E7%89%A9%E8%BD%A6.png)

   购物车选择结算时领取优惠券页面：

   ![购物车使用优惠券结算](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E8%B4%AD%E7%89%A9%E8%BD%A6%E4%BD%BF%E7%94%A8%E4%BC%98%E6%83%A0%E5%88%B8%E7%BB%93%E7%AE%97.png)

7.订单提交模块
         用户在提交订单前选择收获地址并提交订单。调用远程接口查询是否使用优惠券，并计算优惠后的金额，创建订单，扣减库存，删除购物车

订单确认选择收货地址：

![订单确认选择收货地址](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E8%AE%A2%E5%8D%95%E7%A1%AE%E8%AE%A4%E9%80%89%E6%8B%A9%E6%94%B6%E8%B4%A7%E5%9C%B0%E5%9D%80.png)

订单确认页面：

![订单确认](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E8%AE%A2%E5%8D%95%E7%A1%AE%E8%AE%A4.png)

8. 订单支付模块
       在提交订单后同时发送延时消息(订单号)。2分钟过后若订单未支付，则自动取消订单，恢复库存。若两分钟内支付，调用支付宝支付接口，同步回调跳转页面，异步回调处理业务逻辑(发送订单已完成的消息)。此时，订单模块收到支付成功消息。创建流水，修改订单状态。

   订单如果两分钟未支付，就会超时：

   ![订单超时](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E8%AE%A2%E5%8D%95%E8%B6%85%E6%97%B6.png)

   支付宝支付页面：

   ![支付宝支付](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E6%94%AF%E4%BB%98%E5%AE%9D%E6%94%AF%E4%BB%98.png)

9.个人中心订单状态模块
         前端订单管理可以查询所有订单信息。且可分类查看（全部、待付款、待发货、待收获、已完成）订单、支付订单、收货订单。 

待支付订单：

![待支付订单](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E5%BE%85%E6%94%AF%E4%BB%98%E8%AE%A2%E5%8D%95.png)



待发货订单：

![待发货订单](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E5%BE%85%E5%8F%91%E8%B4%A7%E8%AE%A2%E5%8D%95.png)

待收货订单：

![待收货订单](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E5%BE%85%E6%94%B6%E8%B4%A7%E8%AE%A2%E5%8D%95.png)

全部订单：

![全部订单](https://yiran-shop.oss-cn-hangzhou.aliyuncs.com/yiran-file/%E5%85%A8%E9%83%A8%E8%AE%A2%E5%8D%95.png)
