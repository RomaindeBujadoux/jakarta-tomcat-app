package com.example.app.servlet;

import com.example.app.dao.LivreDAO;
import com.example.app.entity.Livre;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

// Servlet contrôleur MVC
@WebServlet("/livre")
public class LivreServlet extends HttpServlet {

    private final LivreDAO userDAO = new LivreDAO();

    // GET = afficher la liste
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Livre> livres = userDAO.findAll();
        req.setAttribute("livres", livres);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    // POST = ajouter un utilisateur
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        if (name != null && !name.isEmpty()) {
            userDAO.save(new Livre(name));
        }
        resp.sendRedirect(req.getContextPath() + "/livre");
    }
}