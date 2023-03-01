/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Statement;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class studentModify {

    public static List<info> findAll() {
        List<info> studentInfo = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "14102004");
            // querry
            String sql = "select * from info";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                info std = new info(resultSet.getInt("id"),
                        resultSet.getString("student_id"),
                        resultSet.getString("fullname"),
                        resultSet.getString("gender"),
                        resultSet.getString("email"),
                        resultSet.getString("topic"));
                studentInfo.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // end
        return studentInfo;
    }

    public static void insert(info std) {
           List<info> studentInfo = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "14102004");
            // querry
            String sql = "insert into info(fullname, gender, email, student_id, topic) values(?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, std.getFullname());
            statement.setString(2, std.getGender());
            statement.setString(3, std.getEmail());
            statement.setString(4, std.getStudent_id());
            statement.setString(5, std.getTopic());
            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // end
              
    }
    
    public static void update(info std) {
           List<info> studentInfo = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "14102004");
            // querry
            String sql = "update info set fullname=?, gender=?, email=?, student_id=?, topic=? where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, std.getFullname());
            statement.setString(2, std.getGender());
            statement.setString(3, std.getEmail());
            statement.setString(4, std.getStudent_id());
            statement.setString(5, std.getTopic());
            statement.setInt(6, std.getId());
            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // end
}
    public static void delete(int id) {
           List<info> studentInfo = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "14102004");
            // querry
            String sql = "delete from info where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // end
}
    
     public static List<info> findByFullname(String fullname) {
        List<info> studentInfo = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "14102004");
            // querry
            String sql = "select * from info where fullname like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+fullname+"%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                info std = new info(resultSet.getInt("id"),
                        resultSet.getString("student_id"),
                        resultSet.getString("fullname"),
                        resultSet.getString("gender"),
                        resultSet.getString("email"),
                        resultSet.getString("topic"));
                studentInfo.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(studentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // end
        return studentInfo;
    }
}
