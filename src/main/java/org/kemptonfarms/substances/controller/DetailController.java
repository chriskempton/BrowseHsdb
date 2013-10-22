package org.kemptonfarms.substances.controller;

import java.util.Map;
import java.util.HashMap;

import org.kemptonfarms.substances.util.CassandraHsdbDataUtilFactory;
import org.kemptonfarms.substances.util.IHsdbDataUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DetailController {
    private static final IHsdbDataUtil hsdbDataUtil = CassandraHsdbDataUtilFactory.getInstance();

    @RequestMapping(value="/detail/{input}", method={RequestMethod.GET})
    public ModelAndView detailOutput(@PathVariable("input") String input) {
        return new ModelAndView("detail", getSubstanceMap(input));
    }

    private static Map<String, Object> getSubstanceMap(String input) {
        Map<String, Object> model = new HashMap<String,Object>();
        model.put("substance", hsdbDataUtil.getSubstance(input));
        return model;
    }
}