package com.sistemarefas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String DB_HOST = "";
    private static final String DB_PORT = "";
    private static final String DB_NAME = "";
    private static final String DB_USER = "";
    private static final String DB_PASSWORD = "";

    private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME + "";

    public static Connection conectar() throws SQLException {
        Connection conexao = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        return conexao;
    }

    public static void main(String[] args) {
        Connection conn = null;
        try {
            System.out.println("Tentando conexão com o banco de dados...");
            conn = DatabaseConnector.conectar();
            if (conn != null && !conn.isClosed()) {
                System.out.println("Sucesso! conexão com o banco de dados '" + DB_NAME + "'estabelecida.");
            } else {
                System.out.println("Falha, não foi possivel estabelecer conexão com o banco de dados.");
            }
        } catch (SQLException e) {
            System.err.println("Erro de SQL! Falha ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Conexão de teste fechada.");
                } catch (SQLException e) {
                    System.err.println("Erro ao fechar conexão de teste: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}
