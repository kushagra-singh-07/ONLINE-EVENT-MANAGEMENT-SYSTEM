import javax.swing.*;

public class EventManagementApp {
    public static void main(String[] args) {
        // Optional: Set system look & feel for native appearance
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Failed to set look and feel");
        }

        // Launch the Customer Details form
        SwingUtilities.invokeLater(() -> {
            CustomerForm customerForm = new CustomerForm();
            customerForm.setVisible(true);
        });
    }
}
