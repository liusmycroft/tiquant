tiquant-common: 存放公共类
  - aspect: 通用域用到的切面，比如MonitorLog、Auth、SalDigest、Cached、InjectXXX（修改线程上下文）
  - enums: 通用的枚举
  - constant: 常量
  - util: 工具类
  - proxy: 代理类，可能会实现facade里面的接口，转发到其他endpoint执行
  - sdk: 引入外部依赖
  - service: 通用域的领域服务
  - manager: 通用域的核心逻辑
  - properties: 通用域的配置文件
  - dao: 通用域的dal代码
tiquant-service-facade:
  - api: 对外/内暴露的服务接口，以Application结尾
  - common: 存放dto、enums、exception等接口依赖等对象
    - dto: 服务接口出参入参
    - enums: 枚举
    - exception
tiquant-service-impl:
  - api: 实现facade中暴露的服务接口，负责编排各个领域的服务(比如鉴权域和账号域)，以及参数校验，结果大小写转换，以ApplicationImpl结尾
    - inner: 内部管控接口
    - open: 外部接口，开放给客户
      - dubbo: 微服务
      - http: web接口
  - xxx: 其余biz包：实现单个领域服务，以Service结尾，Service本身会包含领域内的核心逻辑，同时含有支撑域+通用域的代码，同时单个核心域Service内也会依赖其他核心域的代码
    - manager: 领域的核心逻辑，负责领域模型的生命周期
      - dao: 与数据库交互
      - httpHelper: 与其他服务交互
    - model: 领域模型
    - 支撑域+通用域: properties,redis,builder

说 Spring 的核心之一是使用 IOC/DI 来实现应用解耦，那么Vert.X就是使用 EventBus 来实现应用解耦，
