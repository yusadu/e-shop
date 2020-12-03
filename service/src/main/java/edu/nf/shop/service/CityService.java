package edu.nf.shop.service;

import edu.nf.shop.dao.CityDao;
import edu.nf.shop.entity.Data;
import edu.nf.shop.entity.PageBean;

public class CityService {

    public Data getList(PageBean page, String province){
        Data data=new Data();
        CityDao dao=new CityDao();
        data.setList(dao.listCity(page,province));
        Integer n=dao.getPageCount(province)/page.getPageSize();
        Integer pageCount=dao.getPageCount(province)%page.getPageSize()==0?n:n+1;
        data.setPageCount(pageCount);
        return data;
    }
}
