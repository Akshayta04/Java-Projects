import javax.swing.*;// java swing for GUI
import javax.swing.text.DefaultEditorKit;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
public class NotepadApp{
    private JFrame frame;
    private JTextArea textArea;
    public NotepadApp(){//constructor begins
        frame = new JFrame("Simple Notepad");
        frame.setSize(600,500);// set size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textArea = new JTextArea();
        JScrollPane scrollPane=new JScrollPane(textArea);
        frame.add(scrollPane);
        JMenuBar menuBar = new JMenuBar();//menu bar created
        //open created
        JMenu openMenu = new JMenu("Open");
        JMenuItem openItem = new JMenuItem(new AbstractAction("Open File"){
            public void actionPerformed(java.awt.event.ActionEvent e){
                openFile();
            }
        });
        openMenu.add(openItem);
        //save created
        JMenu saveMenu = new JMenu("Save");
        JMenuItem saveItem = new JMenuItem(new AbstractAction("Save File"){
            public void actionPerformed(java.awt.event.ActionEvent e){
                saveFile();
            }
        });
        saveMenu.add(saveItem);
        //edit created containg the options to cut, copy and paste
        JMenu editMenu= new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem(new DefaultEditorKit.CutAction());
        cutItem.setText("Cut");
        JMenuItem copyItem = new JMenuItem(new DefaultEditorKit.CopyAction());
        copyItem.setText("Copy");
        JMenuItem pasteItem =new JMenuItem( new DefaultEditorKit.PasteAction());
        pasteItem.setText("Paste");
        //cut, copy and paste added to edit menu
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        //open, save and edit added to menubar
        menuBar.add(openMenu);
        menuBar.add(saveMenu);
        menuBar.add(editMenu);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
   }//constructor closes
   private void openFile(){//for open option to perform its task of opening a file
    JFileChooser fileChooser = new JFileChooser();
    int option = fileChooser.showOpenDialog(frame);
    if(option == JFileChooser.APPROVE_OPTION){
        try(BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))){
            textArea.read(reader, null);
        }catch (IOException ex){
            JOptionPane.showMessageDialog(frame, "Error Opening File");
        }
    }
   }
   private void saveFile(){//for the save option to perform its task of saving the file 
    JFileChooser fileChooser = new JFileChooser();
    int option = fileChooser.showSaveDialog(frame);
    if(option == JFileChooser.APPROVE_OPTION){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()))){
            textArea.write(writer);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(frame, "Error saving file");
        }
    }
   }
   public static void main (String[] args){
    new NotepadApp();
   }
}