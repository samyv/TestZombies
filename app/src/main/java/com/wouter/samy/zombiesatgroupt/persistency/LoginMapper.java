package com.wouter.samy.zombiesatgroupt.persistency;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.wouter.samy.zombiesatgroupt.Account;
import com.wouter.samy.zombiesatgroupt.Databasetest;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wouter heerwegh on 16/11/2017.
 */

public enum LoginMapper {

    UNIQUEINSTANCE;

    private LoginMapper(){

    }

    public Account getAccountById(int id) {
        String select = "SELECT id, name, pass FROM Accounts where id = ?";
        Account account = null;
        try {
            PreparedStatement prepstat = Databasetest.UNIQUEINSTANCE.getConnection().prepareStatement(select);
            prepstat.setInt(1, id);
            account = queryAccount(prepstat);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }

    public Account getAccountByNames(Account account) {
        String select = "SELECT id, name, pass FROM Accounts where name = ?";
        Account account1 = null;
        try {
            PreparedStatement prepstat = Databasetest.UNIQUEINSTANCE.getConnection().prepareStatement(select);
            prepstat.setString(1, account.getName());
            account = queryAccount(prepstat);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account1;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public int createAccount(Account account) {
        Account account1 = getAccountByNames(account);
        if(account1 == null) {
            int id = -1;
            String sql = "INSERT INTO Accounts (id, name, pass) VALUES (?,?,?)";
            try (PreparedStatement pstmt = Databasetest.UNIQUEINSTANCE.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setInt(1, account.getId());
                pstmt.setString(2, account.getName());
                pstmt.setString(3, account.getPass());
                // executeUpdate() should be called to change something in the database
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    ResultSet rs = pstmt.getGeneratedKeys();
                    if (rs != null) {
                        if (rs.next()) {
                            id = rs.getInt(1);
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return id;

    }

    private Account queryAccount(PreparedStatement prepstat) {
        Account account = null;
        ResultSet rs = null;
        try {
            rs = prepstat.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("PersonID");
                String name = rs.getString("Name");
                String firstname = rs.getString("firstname");
                Date birthdate = rs.getDate("birthdate");
                person = new Person(id, name, firstname, new java.sql.Date(birthdate.getTime()).toLocalDate());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                prepstat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return person;
    }
}
