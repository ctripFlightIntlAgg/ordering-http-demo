更多介绍见Ordering Guide.docx

ordering外部接入说明

# 一、访问示例 : 见client模块下OrderingHttpClient
    消费对象：携程合作商，如东航、永安、同程、易游等
## 访问路径
    FWS:http://apiproxy-fws.ctripqa.com/apiproxy/soa2/15169
    UAT:http://apiproxy-uat.ctripqa.com/apiproxy/soa2/15169
    PRO:http://apiproxy.ctrip.com/apiproxy/soa2/15169
    
    PS: 生产环境需要另外添加gateway验证，详见gateway.doc用户文档
## orderingservice
| operation 				| 中文释义 		|
| ---				        | --- 		    |
| saveOrder	        | 下单 	|


# 二、契约 : 见contract模块


# 三、请求方式
## 请求格式：推荐使用JSON   


    