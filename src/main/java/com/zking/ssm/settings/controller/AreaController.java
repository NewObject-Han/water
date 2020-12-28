package com.zking.ssm.settings.controller;

import com.zking.ssm.settings.model.Area;
import com.zking.ssm.settings.service.ISettingsAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Areaa")
@ResponseBody
public class AreaController {
    @Autowired
    private ISettingsAreaService iSettingsAreaService;
    @RequestMapping("/Areaxq")
    public List queryAreaAll(Area area){
        List list=iSettingsAreaService.queryArea(area);
        return list;
    };
    @RequestMapping("/Areaxqadd")
    public int Areaadd(Area area){

        area.setDisabled(0);
        int str=iSettingsAreaService.insert(area);
      return str;
    };

    @RequestMapping("/Areaxqdel")
    public int Areadel(Area area){
        int i = area.getAid();
//        if(!"".equals(String.valueOf(i))){
            int str=iSettingsAreaService.deleteByPrimaryKey(i);
//        }
        return str;

    };

    @RequestMapping("/Areaxqedit")
    public int Areaedit(Area area){
        int i = area.getAid();
        area.setDisabled(0);
        Area str=iSettingsAreaService.updateByPrimaryKey(area);

        return i;

    };

}
