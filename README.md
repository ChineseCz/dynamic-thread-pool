动态线程池组件
=========
## 内容列表

- [背景](##背景)
- [安装](##安装)
- [使用说明](##使用说明)
- [成果](##成果)

## 背景
基于高并发场景下，线程资源无法在运行期及时调整的问题，参考《Java线程池实现原理及其在美团业务中实践》资料学习，构建一个动态管理线程池的组件SDK。


## 安装以及引入
1. 克隆该仓库：
 ```bash
 git clone https://github.com/Chinesecz/dynamic-thread-pool.git
 ```

2. maven安装
```bash
 mvn install 
 ```
3. 本地maven安装后，即可在其他工程中引入依赖  
![image](https://github.com/user-attachments/assets/17972e74-51e8-4a9e-a67d-5c289c250216)
![image](https://github.com/user-attachments/assets/6ac2692e-4f10-4e63-a1b4-23dd42680625)

## 使用说明
主要源码目录简介：     
```
dynamic-thread-pool-spring-boot-stater
├─config -- spring自动配置类
├─domain --相关实体以及服务接口
├─registry -- 频道注册
├─trigger
|  ├─job --定时上报线程池信息
|  ├─listenr --监听线程池参数变化
```
![image](https://github.com/user-attachments/assets/dcbf4743-d8b7-4a05-bb1d-e9289904a62f)




## 效果展示
![image](https://github.com/user-attachments/assets/d96a9ede-40e1-4069-a917-df08c8be6f70)

