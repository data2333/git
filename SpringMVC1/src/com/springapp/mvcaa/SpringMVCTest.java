package com.springapp.mvcaa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
/**
 * Created by Administrator on 2017/3/18.
 */
@SessionAttribute(value = {"fuck"}, types = {String.class})
@Controller
@RequestMapping("/testPathVariable")
public class SpringMVCTest {
    public SpringMVCTest(){}
    @RequestMapping(value = "/testRest/{id}", method =RequestMethod.GET)
    public String testRest(@PathVariable("id") Integer id) {
        System.out.println("testRest GET:" + id);
        return "success";
    }
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.POST)
    public String testRestPost(@PathVariable Integer id) {
        System.out.println("testRest POST:"+id);
        return "success";
    }
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testRestPut(@PathVariable Integer id) {
        System.out.println("testRest PUT:" + id);
        return "success";
    }
    @RequestMapping(value = "testRest/{id}", method = RequestMethod.DELETE)
    public String testRestDelete(@PathVariable Integer id) {
        System.out.println("testRest DELETE:" + id);
        return "success";
    }
    @RequestMapping(value = "/testRequestParam",method = RequestMethod.POST)
    public String testRequestParam(@RequestParam(value = "username")String un){
        System.out.println("testRequestParam:username:"+un);
        return "success";
    }
    @RequestMapping(value = "testParamsAndHeaders",params = {"username","age"},method = RequestMethod.POST)
    public String testParamsAndHeaders(){
        System.out.println("testParamsAndHeaders");
        return "success";
    }
    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String un, @RequestParam(value = "age", required = false) Integer age) {
        System.out.println("testRequestParam,username" + un + ",age" + age);
        return "success";
    }
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language") String s) {
        System.out.println("testRequestHeader,Accept-Language:" + s);
        return "success";
    }
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String sessionID) {
        System.out.println("testCookieValue:" + sessionID);
        return "success";
    }
    @RequestMapping("/testPojo")
    public String testPojo(User user) {
        System.out.println("testPojo" + user);
        return "success";
    }

    @RequestMapping("/testServlet")
    public String testServletAPI(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("testServletAPI" + request + "." + response);
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("time", new Date());
        return modelAndView;
    }

    @RequestMapping("testMap")
    public String testMapping(Map<String, Object> map) {
        map.put("names", Arrays.asList("Tom", "Jerry", "Mike"));
        return "success";
    }

    @RequestMapping("testSession")
    public String testSessionAttribute(Map<String, Object> map) {
        User user = new User("Tom", "123456", "ui@qq.com", 15);
        map.put("user", user);
        map.put("school", "at");
        return "success";
    }
    @ModelAttribute
    public void getUser(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map) {
        if (id != null) {
            User user = new User(1, "Tom", "123456", "tom@qq.com", 15);
            System.out.println("从数据库中获取一个对象" + user);
            map.put("abc", user);
        }
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user) {
        System.out.println("testModelAttribute:" + user);
        return "success";
    }

    @RequestMapping("/testResolver")
    public String testViewResolver() {
        System.out.println("testViewResolver:");
        return "success";
    }

    @RequestMapping("/testView")
    public String testView() {
        System.out.println("testView");
        return "helloView";
    }
    @RequestMapping("/testRedirect")
    public String testRedirect() {
        System.out.println("testRedirect");
        return "redirect:/WEB-INF/index.jsp";
    }

//    @Autowired
//    private DepartmentDAO departmentDAO;
//    @RequestMapping("/emps")
//    public String list(Map<String,Object>map){
//        map.put("employee", EmployeeDao.getAll());
//        return "list";
//    }
//    @RequestMapping(value = "emp", method = RequestMethod.GET)
//    public String input(Map<String,Object>map) {
//        map.put("employee", departmentDAO.getDepartments());
//        return "input";
//    }
}
