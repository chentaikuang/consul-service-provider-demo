package com.nome.ec.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * http://localhost:8887/test/demo
     * @return
     */
    @RequestMapping("/demo")
    public Map getInfo(){
        Map map = new HashMap();
        map.put("tips","ok");
        map.put("curTime",new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(new Date()));
        return map;
    }

    /**
     * http://localhost:8887/test/demo
     * @return
     */
    @RequestMapping("/provider")
    public Map provider(String tips){
        Map map = new HashMap();
        if (StringUtils.isEmpty(tips)){
            tips = "default tips";
        }
        map.put("tips",tips);
        map.put("curTime",new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(new Date()));
        return map;
    }

    /**
     * http:localhost:8887/test/hi
     * @return
     */
    @RequestMapping("/hi")
    public Map hi(){
        Map map = new HashMap();
        map.put("tips","hi");
        map.put("curTime",new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(new Date()));
        return map;
    }
}
