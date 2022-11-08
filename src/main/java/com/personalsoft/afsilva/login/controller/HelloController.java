package com.personalsoft.afsilva.login.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.slf4j.Logger;

@Controller
public class HelloController {

    String hello = "Hola Mundo";
    private Logger logger = LoggerFactory.getLogger(getClass());


    @RequestMapping("saludar")
    @ResponseBody
    public String saludar() {
        return hello;
    }

    @RequestMapping("pagina-html")
    @ResponseBody
    public String paginaHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> Pagina HTML </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1 style='background-color:red'> Soy el cuerpo de la pagina </h1>");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }


    @RequestMapping("pagina-html-jsp")
    public String paginaHtmlJsp(@RequestParam String name, ModelMap model) {
        logger.debug("RequestParam nam is {}", name);
        model.put("name", name);
        return "pageHello";
    }
}
