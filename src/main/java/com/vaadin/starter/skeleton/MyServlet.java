package com.vaadin.starter.skeleton;

import com.vaadin.flow.server.VaadinServlet;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/*")
public class MyServlet extends VaadinServlet {
}