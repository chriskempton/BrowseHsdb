package org.kemptonfarms.substances.controller;

import java.util.Map;
import java.util.HashMap;

import org.kemptonfarms.substances.util.HsdbDataUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/list")
public class ListController {

    @RequestMapping(method={RequestMethod.GET})
    public ModelAndView renderList() {
        return new ModelAndView("list", getSubstancesMap());
    }

    private static Map<String, Object> getSubstancesMap() {
        Map<String, Object> model = new HashMap<String,Object>();
        model.put("substances", HsdbDataUtil.getSubstancesFromCassandra());
        return model;
    }
}