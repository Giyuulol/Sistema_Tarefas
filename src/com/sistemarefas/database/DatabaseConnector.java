package com.sistemarefas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "sistemarefasdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME +
            "?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";

    public static Connection conectar() throws SQLException {
        Connection conexao = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        return conexao;
    }

    public static void main(String[] args) {
        Connection conn = null;
        try {
            System.out.println("Testando conexão com o banco de dados...");
            conn = DatabaseConnector.conectar();
            if (conn != null && !conn.isClosed()) {
                System.out.println("SUCESSO! Conexão com o banco de dados '" + DB_NAME + "' estabelecida.");
            } else {
                System.out.println("FALHA! Não foi possível estabelecer a conexão (conexão nula ou fechada).");
            }
        } catch (SQLException e) {
            System.err.println("ERRO DE SQL! Falha ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Conexão de teste fechada.");
                } catch (SQLException e) {
                    System.err.println("Erro ao fechar a conexão de teste: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}