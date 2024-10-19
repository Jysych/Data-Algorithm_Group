package ayemtn;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class login extends JFrame {

    private JPanel contentPane;
    private JTextField emailField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login frame = new login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 600); // Adjust size to fit image and login form
        contentPane = new JPanel(new BorderLayout()); // Using BorderLayout to split the contentPane
        setContentPane(contentPane);

        // Create a panel for the login form on the left side
        JPanel loginPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon("C:\\Users\\paul carlo\\OneDrive\\Desktop\\_4b_InheritanceAndInterface\\ayemtn\\bin\\bglog.png"); // Path to your left-side image
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        loginPanel.setPreferredSize(new Dimension(450, 600)); // Half the frame width for the login panel
        loginPanel.setLayout(null); // Absolute positioning for login form components
        contentPane.add(loginPanel, BorderLayout.WEST);

        // Adding "LOG IN" label
        JLabel loginLabel = new JLabel("LOG IN");
        loginLabel.setFont(new Font("Sitka Text", Font.BOLD, 30));
        loginLabel.setForeground(Color.WHITE);
        loginLabel.setBounds(149, 100, 115, 40); // Adjust position and size as necessary
        loginPanel.add(loginLabel);

        // Adding email label and field
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setBounds(100, 180, 100, 30); // Adjust position and size
        loginPanel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBackground(new Color(221, 221, 221));
        emailField.setBounds(100, 210, 200, 30); // Adjust position and size
        loginPanel.add(emailField);
        emailField.setColumns(10);

        // Adding password label and field
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Sitka Text", Font.PLAIN, 22));
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(100, 260, 100, 30); // Adjust position and size
        loginPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBackground(new Color(221, 221, 221));
        passwordField.setBounds(100, 290, 200, 30); // Adjust position and size
        loginPanel.add(passwordField);

        // Adding login button
        JButton loginButton = new JButton("");
        loginButton.setBounds(154, 355, 95, 30); // Adjust position and size
        ImageIcon arrowIcon = new ImageIcon("C:\\Users\\paul carlo\\OneDrive\\Desktop\\_4b_InheritanceAndInterface\\ayemtn\\bin\\buton.png"); // Path to your arrow icon image
        loginButton.setIcon(arrowIcon);
        loginPanel.add(loginButton);

        // Create a panel for the images on the right side
        JPanel imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon rightSideImage = new ImageIcon("C:\\Users\\paul carlo\\OneDrive\\Desktop\\_4b_InheritanceAndInterface\\ayemtn\\bin\\hotel6.png"); // Path to the right-side image
                g.drawImage(rightSideImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        contentPane.add(imagePanel, BorderLayout.CENTER); // Right-side panel with images
    }
}
