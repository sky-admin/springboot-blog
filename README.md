# springboot-blog

用springboot框架构建一个blog的API后端。

docker提供开发环境及测试数据库，安装完成docker后本项目可一键启动。

## 使用

（请确保电脑上有docker，操作系统无所谓，win10以前安装docker可能较费劲，自行搜索教程）

克隆项目到本地后，用命令行在当前目录执行

`docker-compose up`

上述命令会启动两个service，并执行预置的命令：mvn spring-boot:run

如果是想进行开发，需要频繁的结束重启，可输入命令：

`docker-compose run web bash`

会进入web容器的bash，mysql容器因为是关联容器，也会自己启动。

## 功能

注册登录，登录用户可发表文字，未登录用户可浏览文章。

## 接口

- `/reg` 注册， `/login` 登录，都需要post username和password字段
- `/articles` 显示所有文章
- `/postnew` 发布新文章（需要登录），post参数title和content
- `/article` 显示某篇文章，参数id
- `/edit` 编辑文章，post参数id，title，content

## TODO

- 替换session/cookie认证为JWT认证
- web界面