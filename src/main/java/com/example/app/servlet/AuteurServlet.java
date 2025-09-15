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
	
	// Identifiant de version de sérialisation généré manuellement.
	// Recommandé pour toutes les classes qui héritent de HttpServlet (implémente Serializable).
	// Cela permet d’éviter des incompatibilités lors de la désérialisation si la classe évolue.
	private static final long serialVersionUID = 1L;

    private final AuteurDAO userDAO = new AuteurDAO();

    // GET = afficher la liste
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Auteur> auteurs = userDAO.findAll();
        req.setAttribute("auteurs", auteurs);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    // POST = ajouter un utilisateur
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        if (name != null && !name.isEmpty()) {
            userDAO.save(new Auteur(name));
        }
        resp.sendRedirect(req.getContextPath() + "/auteur");
    }
}
