# sharding-mybatis-demo
1.sql脚本在resource下sqlexample文件夹里
2.启动tomcat后访问直接访问http://ip:port/demo/test （访问类是在ShardingDemoController）
其中/test下的sql查询语句为：
         SELECT
        i.user_id  ,o.user_id
        FROM
        t_order o, t_order_item i
        WHERE
        o.order_id = i.order_id
        order by i.user_id
 

