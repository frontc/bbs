### 一个简单的BBS
#### 一. 这是什么
+ 这是一个基于spring boot,mybatis,spring mvc的练手项目
+ 如果你想入门，看这个例子应该会有所帮助

#### 二. 功能描述 - 一个简单的论坛
##### 1. 用户
+ 用户分为游客、普通用户、版块管理员和论坛管理员。
1. 游客可以浏览所有帖子。
2. 普通用户除了浏览帖子外，还可以发表帖子，回复帖子，修改自己的帖子。
3. 版块管理员除了以上权限外，可以对主题设置精华，可以删除主题帖子和回复帖子。
4. 论坛管理员除了以上权限外，还可以设置板块的管理员。
##### 2. 对象
1. 用户
2. 版块
3. 主题
4. 回帖
5. 日志
##### 3.页面
1. 版块列表页面 --分页
2. 主题列表页面 --分页
3. 主题及回复页面 --分页
4. 登录页面
5. 设置板块管理员页面
##### 4. 流程
1. 登录流程 --积分
2. 发帖流程 --是否已登录，积分
3. 回帖流程 --是否已登录，积分
4. 修改帖子流程 --权限
5. 删贴流程 --权限
6. 设置精华流程 --权限，积分
7. 设置版块管理员流程 --权限