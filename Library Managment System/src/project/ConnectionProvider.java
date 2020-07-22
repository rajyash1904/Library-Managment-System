/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;
/**
 *
 * @author Yashraj Balidani
 */
public class ConnectionProvider 
{
public static Connection getcon()
{
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://bddp3sheu6ovo9it0ma8-mysql.services.clever-cloud.com:3306/bddp3sheu6ovo9it0ma8?characterEncoding=latin1", "ueqcpo4fg2w2osp8", "3BtW9gw1zhQXbLTGR4eD");
        return con;
    }catch(Exception e)
    {
        System.out.println(e);
        return null;
    }
}
}
