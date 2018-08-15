--项目框架介绍设计
项目属于对于springBoot日常组件的集成和使用，对于springCloud的相关技术的测试和开发
通过eureka管理提供的服务的注册和消费
通过ribbon管控负载均衡，
通过feign编写控制层的面向接口的的编写
每一个服务provider都需要编写对应的服务接口向外暴露接口，而外部需要调用对应的controller服务就需要通过feign调用接口的实现controller


此springboot的项目技术图
--springBoot版本2.0.3.RELEASE
	--mybatis
	--redis
	--shiro
	--spring
	--springmvc
	--ActiveMQ（后续实现集成RibbonMQ）

--springCloud版本1.4.5.RELEASE
	--eureka
	--ribbon
	--feign
	--config


--服务部署
	--jetty
	--jdk10