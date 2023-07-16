tiquant-common: 存放公共类
tiquant-service-facade:
tiquant-service-impl:
  - api: 实现facade中暴露的服务接口，负责编排各个领域的服务
    - inner: 内部管控接口
    - open: 外部接口，开放给客户
      - dubbo: 微服务
      - http: web接口
  - 其余biz包：实现领域服务，类以Service结尾
