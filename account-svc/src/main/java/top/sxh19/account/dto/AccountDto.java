package top.sxh19.account.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class AccountDto {
    @Null
    private String name;
    @Email(message = "邮箱格式不正确")
    @NotNull(message = "邮箱不能为空")
    private String email;
    @NotNull(message = "密码不能为空")
    private String password;

    public AccountDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountDto(@Null String name, @Email(message = "邮箱格式不正确") @NotNull(message = "邮箱不能为空") String email, @NotNull(message = "密码不能为空") String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
