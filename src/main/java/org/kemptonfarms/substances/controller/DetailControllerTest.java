package org.kemptonfarms.substances.controller;

import static org.junit.Assert.*;

import org.kemptonfarms.substances.model.Substance;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class DetailControllerTest {

    String input = "108-87-2";

    private DetailController DetailController;
    public void setDetailController(DetailController c){
        this.DetailController = c;
    }

    @Before
    public void setup() {
        setDetailController(new DetailController());
    }

    @Test
    public void testOutputControllerHTML() {
        ModelAndView mv = DetailController.detailOutput(input);

        assertTrue(mv.getViewName().equals("detail"));

        assertNotNull(mv.getModel().get("substance"));
        assertTrue(mv.getModel().get("substance") instanceof Substance);
    }
}