package top.sxh19.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.sxh19.account.dmo.Staff;
import top.sxh19.account.dto.AccountDto;
import top.sxh19.account.service.AccountService;

import java.util.List;

@RestController
@RequestMapping("/v1/account")
public class AccountController {
    @Autowired
    AccountController accountController;
    @Autowired
    AccountService accountService;
    @RequestMapping("/create")
    public String createAccount(@RequestBody  AccountDto accountDto){

        System.out.println("调用账户服务模块的createAccount方法来注册");
        System.out.println(accountDto.getEmail());
        System.out.println(accountDto.getPassword());
        System.out.println("查询");
       List<Staff> list  =accountService.getStaffs();
        System.out.println(list);
        return "success";
    }

    @RequestMapping("/get_account")
    public @ResponseBody List<Staff>  getAccounts( ){
        System.out.println("查询");
        List<Staff> list  =accountService.getStaffs();
        System.out.println(list);
        return list;
    }
}
