package action;

import com.opensymphony.xwork2.ModelDriven;
import entity.User;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.UserService;

import javax.annotation.Resource;

/**
 * Created by zhangbaoning on 2017/5/15.
 */
@Namespace("/")
@ParentPackage("struts-default")
@Controller
public class UserAction implements ModelDriven<User> {
    private User user = new User();
    @Override
    public User getModel() {
        return user;
    }
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Action(value ="userAction_add",results = {@Result(name = "add",location = "/success.jsp")})

    public String add(){
        this.userService.saveUser(user);
        return "add";
    }
}
