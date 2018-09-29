package com.micro.Product.Servlet;

import java.io.IOException;
import java.sql.SQLException;
 


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.micro.Product.DAO.ProductDAO;
import com.micro.Product.model.ProductDTO;
 
@WebServlet("/viewProduct")
public class GetProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public GetProductServlet() {
        super();
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));
        ProductDAO dao = new ProductDAO();
         
        try {
          ProductDTO p = dao.get(productId);
             
            request.setAttribute("product", p);
             
            String page = "/JSP/productDisplay.jsp";
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);              
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
         
    }
}