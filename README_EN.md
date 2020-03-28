More details refer to Ordering Guide.docx

Ordering External Access Instructions

# 一、Example:OrderingHttpClient under the module of client
    Consumers: Ctrip partners, such as China Eastern Airlines, Yongan, Tongcheng, Yiyou, etc.

## Basic Access Path:
    FWS:http://apiproxy-fws.ctripqa.com/apiproxy/soa2/15169
    UAT:http://apiproxy-uat.ctripqa.com/apiproxy/soa2/15169
    PRO:http://apiproxy.ctrip.com/apiproxy/soa2/15169
    
    PS: Gateway validation is required in PRO, for more information, please visit: https://github.com/Bee2857/cerberus-client-demo
  

## OrderingService
| operation 				| 中文释义 		|
| ---				        | --- 		    |
| saveOrder	        | 下单 	|

# 二、Schema:contract under the module of contract



# 三、Call Method

## Access Path:basic access path + operationName
## Call Format:JSON