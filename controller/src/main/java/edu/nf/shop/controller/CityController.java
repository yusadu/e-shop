package edu.nf.shop.controller;

import edu.nf.shop.entity.Data;
import edu.nf.shop.entity.PageBean;
import edu.nf.shop.service.CityService;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CityController {
    @WebRequest("/list")
    public View getCityList(PageBean page){
        CityService service=new CityService();
        Data data=service.getList(page,null);
        return new JsonView(data);
//        return new JsonView("ASDFSAF");
    }
    @WebRequest("/hello")
    public void hello(){
        System.out.println("hello");
    }
}
