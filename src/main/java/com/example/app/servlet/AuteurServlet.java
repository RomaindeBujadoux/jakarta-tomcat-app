package com.example.app.servlet;

import com.example.app.dao.AuteurDAO;
import com.example.app.entity.Auteur;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

// Servlet contrôleur MVC
@WebServlet("/auteur")
public class AuteurServlet extends HttpServlet {


    private final AuteurDAO userDAO = new AuteurDAO();

    // GET = afficher la liste
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Auteur> auteurs = userDAO.findAll();
        req.setAttribute("auteurs", auteurs);
        req.getRequestDispatcher("/auteur/list.jsp").forward(req, resp);
    }

    // POST = ajouter un auteur
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String nom = req.getParameter("nom");
        if (nom != null && !nom.isEmpty()) {
            userDAO.save(new Auteur(nom));
        }
        resp.sendRedirect(req.getContextPath() + "/auteur");
    }
}