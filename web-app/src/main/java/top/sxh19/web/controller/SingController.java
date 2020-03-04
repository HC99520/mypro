package top.sxh19.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import top.sxh19.web.Dto.Account;
import top.sxh19.web.Dto.Staff;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SingController {
    @Autowired
    RestTemplateBuilder restTemplateBuilder;

 @RequestMapping("/signup")
    @ResponseBody
    public  String signUp(@RequestParam(value = "name",required = false) String name,
                          @RequestParam("email") String email,@RequestParam("password") String password){
        System.out.println("注册");
        Map<String,String> map= new HashMap<>();
        map.put("email",email);
        map.put("password",password);

        RestTemplate restTemplate= restTemplateBuilder.build();
        String url="http://localhost:9000/account-svc/v1/account/create";
        // String result=  restTemplate.getForObject(url,String.class,map);
        String result=  restTemplate.postForObject(url,map,String.class);
        if("success".equalsIgnoreCase(result))
        {
            return "ok";
        }
        return "err";
    }

    //第二种方式
    @RequestMapping("/signup2")
    @ResponseBody
    public List<Staff> signUp2(Staff staff){
        System.out.println("注册");
        RestTemplate restTemplate= restTemplateBuilder.build();
        HttpEntity<Staff> body =new HttpEntity<>(staff);
        //ParameterizedTypeReference 泛型处理器 处理集合
        //restTemplate.exchange()
        String url="http://localhost:9000/account-svc/v1/account/get_account";
        // String result=  restTemplate.getForObject(url,String.class,map);
       // String result=  restTemplate.postForObject(url,body,String.class);
      List<Staff> list= restTemplate.exchange(url, HttpMethod.POST, body,
              new ParameterizedTypeReference<List<Staff>>() {
       }).getBody();
        return list;
    }
}
