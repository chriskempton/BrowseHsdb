package org.kemptonfarms.substances.controller;

import java.util.List;

import org.kemptonfarms.substances.model.Substance;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class ListControllerTest {

    String input = "108-87-2";

    private ListController ListController;
    public void setListController(ListController c){
        this.ListController = c;
    }

    @Before
    public void setup() {
        setListController(new ListController());
    }

    @Test
    public void testOutputControllerHTML() {
        ModelAndView mv = ListController.renderList();

        assertTrue(mv.getViewName().equals("list"));

        assertNotNull(mv.getModel().get("substances"));
        assertTrue(mv.getModel().get("substances") instanceof List);
    }
}