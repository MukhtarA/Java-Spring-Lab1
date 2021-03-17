package com.lab1;

import java.sql.*;

public class DB {
    private String url;
    private String user;
    private String pswd;
    private Connection connection;

    Account account = new Account();
    public DB(String url, String user, String pswd) {
        this.url = url;
        this.user = user;
        this.pswd = pswd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public void init(){
        try{
            connection = DriverManager.getConnection(url, user, pswd);
        }catch (Exception e){
            System.out.println(e);;
        }
    }

    public void destroy(){
        try{
            connection.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }


    public ResultSet allInfo(String pin) throws SQLException {
        String sql = "SELECT * FROM accounts WHERE accounts.pin = " + account.getPin();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        return preparedStatement.executeQuery();
    }
}
