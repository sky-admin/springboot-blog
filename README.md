# springboot-blog

用springboot框架构建一个blog的API后端。

## 功能

注册登录，登录用户可发表文字，未登录用户可浏览文章。

## 接口

- `/reg` 注册， `/login` 登录，都需要post username和password字段
- `/articles` 显示所有文章
- `/postnew` 发布新文章（需要登录），post参数title和content
- `/article` 显示某篇文章，参数id
- `/edit` 编辑文章，post参数id，title，content

## TODO

- 用docker解决环境问题，保证任何用户可以轻易进入开发
- 替换session/cookie认证为JWT认证
- web界面