package com.bit.order_service;

import com.bit.util.SpringManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableFeignClients
public class OrderServiceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrderServiceApplication.class, args);
        SpringManager.init(context);
    }

    private static final Logger logger = LoggerFactory.getLogger(OrderServiceApplication.class);

    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced //ribbon的负载均衡注解
    public RestTemplate restTemplate() {
        restTemplate = new RestTemplate();
        return restTemplate;
    }


    @RestController
    class EchoController {

        @Autowired(required = false)
        private LoadBalancerClient loadBalancerClient;

        @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
        public String echo(@PathVariable String string) {
            return "Hello Nacos Discovery " + string;
        }

        @RequestMapping("/ip")
        public String getServerIP() {
            ServiceInstance serviceInstance = this.loadBalancerClient.choose("product_service");
            // 打印当前选择的是哪个节点
            return String.format("%s:%s:%d", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
        }
    }
}