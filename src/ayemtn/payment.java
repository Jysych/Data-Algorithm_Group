package ayemtn;

import javax.swing.*;
import java.awt.*;

public class payment extends JFrame {

    public payment() {
        // Set the title for the window
        setTitle("Aurora Cove Hotel Login");

        // Set layout for the entire frame
        setLayout(new BorderLayout());

        // Create the left panel (for login form)
        JPanel loginPanel = new JPanel();
        loginPanel.setBackground(new Color(33, 150, 243));  // Blue background
        loginPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Add the "LOG IN" label
        JLabel loginLabel = new JLabel("LOG IN");
        loginLabel.setFont(new Font("Arial", Font.BOLD, 24));
        loginLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        loginPanel.add(loginLabel, gbc);

        // Add the email label and text field
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        loginPanel.add(emailLabel, gbc);

        JTextField emailField = new JTextField(15);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.EAST;
        loginPanel.add(emailField, gbc);

        // Add the password label and password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        loginPanel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.EAST;
        loginPanel.add(passwordField, gbc);

        // Add the login button
        JButton loginButton = new JButton("→");
        loginButton.setBackground(new Color(255, 193, 7));  // Yellow button
        loginButton.setForeground(Color.BLACK);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        loginPanel.add(loginButton, gbc);

        // Create the right panel (for images and hotel logo)
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());

        // Load the hotel logo (replace with actual image path)
        JLabel logoLabel = new JLabel();
        ImageIcon logoIcon = new ImageIcon("path_to_your_logo_image.png");  // Add your logo path
        logoLabel.setIcon(logoIcon);
        logoLabel.setHorizontalAlignment(JLabel.CENTER);
        rightPanel.add(logoLabel, BorderLayout.NORTH);

        // Load some sample hotel images into a grid layout
        JPanel imagesPanel = new JPanel(new GridLayout(2, 2));

        // Add image placeholders (replace with actual image paths)
        JLabel image1 = new JLabel(new ImageIcon("hotel1.png"));  // Image 1
        JLabel image2 = new JLabel(new ImageIcon("path_to_room_image2.png"));  // Image 2
        JLabel image3 = new JLabel(new ImageIcon("path_to_room_image3.png"));  // Image 3
        JLabel image4 = new JLabel(new ImageIcon("path_to_room_image4.png"));  // Image 4

        imagesPanel.add(image1);
        imagesPanel.add(image2);
        imagesPanel.add(image3);
        imagesPanel.add(image4);

        rightPanel.add(imagesPanel, BorderLayout.CENTER);

        // Add panels to the frame
        add(loginPanel, BorderLayout.WEST);  // Login panel to the left
        add(rightPanel, BorderLayout.CENTER); // Image/logo panel to the right

        // Set size of the window
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create the GUI on the event-dispatching thread for thread-safety
        SwingUtilities.invokeLater(() -> new payment());
    }
}
