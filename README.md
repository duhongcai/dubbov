# dubbov
dubbo-v
> study dubbo
 ##
    dubbov：顶级模块，作为dubbo项目的父模块，为给模块提供统一的依赖 主要是dubbo依赖
    admin：主模块 ,管理系统---->war包
    interface：接口模块，定义RPC服务的接口，也是admin模块调用其他模块的窗口 --->jar包
    system:系统管理模块，是一个dubbo的服务模块，是dubbov的子模块。提供系统管理比如日志查询 操作查询等服务--->jar包
    user：用户管理模块 是一个dubbo的服务模块，也是dubbo的子模块。提供用户增删改查功能---->jar包