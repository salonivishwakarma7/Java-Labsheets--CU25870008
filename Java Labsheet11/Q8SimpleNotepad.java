import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Q8SimpleNotepad extends JFrame implements ActionListener {
    JTextArea textArea;
    JMenuItem newFile, open, save, exit;

    Q8SimpleNotepad() {
        setTitle("Simple Notepad");
        setSize(600, 450);

        textArea = new JTextArea();
        add(new JScrollPane(textArea));

        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu("File");

        newFile = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(exit);

        bar.add(file);
        setJMenuBar(bar);

        newFile.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newFile) {
            textArea.setText("");
        }

        else if (e.getSource() == open) {
            JFileChooser chooser = new JFileChooser();

            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();

                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    textArea.setText("");
                    String line;

                    while ((line = br.readLine()) != null) {
                        textArea.append(line + "\n");
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error opening file");
                }
            }
        }

        else if (e.getSource() == save) {
            JFileChooser chooser = new JFileChooser();

            if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();

                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(textArea.getText());
                    JOptionPane.showMessageDialog(this, "File Saved Successfully");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error saving file");
                }
            }
        }

        else if (e.getSource() == exit) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new Q8SimpleNotepad();
    }
}
