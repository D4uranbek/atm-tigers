package uz.jl.configs;

import uz.jl.models.auth.User;

import java.util.Objects;

/**
 * @author Elmurodov Javohir, Mon 11:39 AM. 12/6/2021
 */
public class Session {
    private User sessionUser = new User();
    private static Session session = new Session();

    private Session() {
    }

    public static Session getInstance() {
        if (Objects.isNull(session)) {
            session = new Session();
        }
        return session;
    }

    public User getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(User sessionUser) {
        this.sessionUser = sessionUser;
    }

    public static Session getSession() {
        return session;
    }

    public static void setSession(Session session) {
        Session.session = session;
    }
}
