package BankingManagementSystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private Connection connection;

    public Transaction(Connection connection) {
        this.connection = connection;
    }

    public List<String> getTransactionHistory(long accountNumber) {
        String query = "SELECT * FROM Transactions WHERE account_number = ?";
        List<String> transactions = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, accountNumber);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String transaction = "Date: " + resultSet.getDate("transaction_date") +
                        ", Type: " + resultSet.getString("transaction_type") +
                        ", Amount: " + resultSet.getDouble("amount");
                transactions.add(transaction);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transactions;
    }
}
