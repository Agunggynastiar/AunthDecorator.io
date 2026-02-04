package auth;

public abstract class AuthDecorator implements Auth {

    protected Auth auth;

    public AuthDecorator(Auth auth) {
        this.auth = auth;
    }

    @Override
    public boolean authenticate() {
        return auth.authenticate();
    }
}
