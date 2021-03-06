
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Container;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zarir Hamza
 */
public class checkSum extends javax.swing.JFrame {

    ArrayList<String> numb = new ArrayList<String>();
    ArrayList<String> file = new ArrayList<String>();
    String welcomeMessage = "This demo version 1.0\n Type hex data above to see its checksum or append it to the current file\n Press restart to start over\n Press reset to start over\n When finished press generate hex file to save finished file\n\n By: Zarir Hamza, Kunal Adhia, and Abhishek Patel";
    boolean working = true;
    /**
     * Creates new form checkSum
     */
     JProgressBar progressBar = new JProgressBar(0,2000);
     JFrame f = new JFrame("JProgressBar Sample");
    public void initT(){
     
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    Container content = f.getContentPane();
   
    progressBar.setValue(0);
    progressBar.setStringPainted(true);
   
    Border border = BorderFactory.createTitledBorder("Reading...");
    progressBar.setBorder(border);
    content.add(progressBar, BorderLayout.NORTH);
    f.setSize(300, 100);
    f.setVisible(true);
 for (int i = 0; i <= 100; i++) {
      final int percent = i;
      try {
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            progressBar.setValue(percent);
          }
        });
        java.lang.Thread.sleep(100);
      } catch (InterruptedException e) {
        ;
      }
       //  f.setVisible(false);
    }
    }

    public checkSum() {
         final SwingProgressBarExample it = new SwingProgressBarExample();
         it.pb();
        this.setTitle("EEPROM Intel Programmer");
        
        initComponents();
        jTextPane1.setText(welcomeMessage);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Add To Current File");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setText("Enter Hex Number Below:");

        jButton2.setText("Generate Hex File");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Create CheckSum");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Current File:");

        jButton6.setText("Input Text File");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton5.setText("Check File");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jTextPane1.setEditable(false);
        jScrollPane2.setViewportView(jTextPane1);

        jButton7.setText("Reset");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7))
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:  
        //  hexNumofBytes = String.format("%02d", Integer.parseInt(hexNumofBytes));
        String address = ""; 
                String[]splitLine = jTextField1.getText().split(",");
        if(splitLine.length == 1){
          address = JOptionPane.showInputDialog(null, "Enter the adress you wish to store this");
          
        }
        else{
            address = splitLine[0];
            jTextField1.setText(splitLine[1]);
        }
            String orginal = jTextField1.getText();
        int numofBytes = jTextField1.getText().length() / 2;
        String hexNumofBytes = Integer.toHexString(numofBytes).toUpperCase();
       
         
        if (hexNumofBytes.length() < 2) {
            hexNumofBytes = "0" + hexNumofBytes;
        }
        jTextField1.setText(hexNumofBytes + address + "00" + jTextField1.getText());
        String checkSum = generateCheckSum("2");
        String line = ":" + hexNumofBytes + address + "00" + orginal + checkSum;
        JOptionPane.showMessageDialog(null, "The line of code for \n" + orginal + " at address\n" + address + "\n" + "is: \n" + line);
    //    file.add(":");
        file.add(hexNumofBytes);
        file.add(address);
      //  file.add("00");
        file.add(orginal);
        file.add(checkSum);
        
    
        jTextField1.setText("");
        jTextPane1.setText("");
         StyledDocument doc = jTextPane1.getStyledDocument();

        Style style = jTextPane1.addStyle("I'm a Style", null);
       /* if(jTextPane1.getText().equals(welcomeMessage)== false || jTextPane1.getText().equals("") == false){
        
        }
        else
        {
       
        }
     /*   String xyp = "";
        // jTextArea1.setText(file.get(0));*/
    //   Object[] array = {Color.black,Color.red,Color.blue,Color.pink,Color.black,Color.orange};
        for (int p = 0; p < file.size(); p+=4) {
             StyleConstants.setForeground(style, Color.black);
         try {   doc.insertString(doc.getLength(), ":",style); }
        catch (BadLocationException e){}
         
        StyleConstants.setForeground(style, Color.red);
        try { 
            doc.insertString(doc.getLength(), file.get(p) ,style); }
        catch (BadLocationException e){}

        StyleConstants.setForeground(style, Color.blue);

        try { doc.insertString(doc.getLength(), file.get(p+1) ,style); }
        catch (BadLocationException e){}
        
        StyleConstants.setForeground(style, Color.pink);
         try { doc.insertString(doc.getLength(), "00" ,style); }
        catch (BadLocationException e){}
         
          StyleConstants.setForeground(style, Color.black);
         try { doc.insertString(doc.getLength(), file.get(p+2) ,style); }
        catch (BadLocationException e){}
         
          StyleConstants.setForeground(style, Color.orange);
         try { doc.insertString(doc.getLength(), file.get(p+3) + "\n" ,style); }
        catch (BadLocationException e){}
        }
     //   jTextPane1.setText(xyp);
        
    }//GEN-LAST:event_jButton1MouseClicked

    public String generateCheckSum(String byteSize) {
        ArrayList<String> thingstoAdd = new ArrayList<String>();
        String text = jTextField1.getText();
        numb.clear();
        int index = 0;
        while (index < text.length()) {
            numb.add(text.substring(index, Math.min(index + Integer.parseInt(byteSize), text.length())));
            index = index + Integer.parseInt(byteSize);
        }
        String format = "%0" + Integer.parseInt(byteSize) * 4 + "d";
        for (int a = 0; a < numb.size(); a++) {
            int hexBin = Integer.parseInt(numb.get(a), 16);
            String g = Integer.toBinaryString(hexBin);
            thingstoAdd.add(String.format(format, Integer.parseInt(g)));
        }
        System.out.println(thingstoAdd);
        String firstnum = thingstoAdd.get(0);
        for (int c = 1; c < thingstoAdd.size(); c++) {
            int numFirst = Integer.parseInt(firstnum, 2);
            int numSecond = Integer.parseInt(thingstoAdd.get(c), 2);
            String sumNum = Integer.toBinaryString(numFirst + numSecond);
            sumNum = new StringBuilder(sumNum).reverse().toString();
            sumNum = sumNum.substring(0, Math.min(sumNum.length(), Integer.parseInt(byteSize) * 4));
            sumNum = new StringBuilder(sumNum).reverse().toString();
            sumNum = String.format(format, Integer.parseInt(sumNum));
            firstnum = sumNum;
        }
        String thirdnum = "";
        for (int e = 0; e < firstnum.length(); e++) {
            if (firstnum.charAt(e) == '1') {
                thirdnum = thirdnum + '0';
            } else {
                thirdnum = thirdnum + '1';
            }
        }
        int num1 = Integer.parseInt(thirdnum, 2);
        String checkSum = Integer.toBinaryString(num1 + 1);
        checkSum = String.format(format, Integer.parseInt(checkSum));
        ArrayList<String> hexValues = new ArrayList<String>();
        String message = "";
        String[] thisCombo2 = checkSum.split("(?<=\\G....)");
        for (int z = 0; z < thisCombo2.length; z++) {
            int dumbNum = Integer.parseInt(thisCombo2[z], 2);
            hexValues.add(Integer.toString(dumbNum, 16));
            message = message + Integer.toString(dumbNum, 16).toUpperCase();
        }
        numb.clear();
        return message;
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        String byteSize = JOptionPane.showInputDialog(null, "Enter the number of bytes you wish to group together for the checksum");

        JOptionPane.showMessageDialog(null, "The checksum of \n" + jTextField1.getText() + "\n" + "is: " + generateCheckSum(byteSize));

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:0
//        file.add(":00000001FF");
        System.out.println(file);

        JFileChooser win = new JFileChooser();
        BufferedWriter writer = null;
        File file2 = null;
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter("hex files (*.hex)", "hex");
        win.setDialogTitle("Choose File To Open");
        win.setFileFilter(xmlfilter);
        win.setCurrentDirectory(new File(System.getProperty("user.home")));
        win.setDialogType(JFileChooser.SAVE_DIALOG);
        //    win.setSelectedFile(new File("myhexfile.hex"));
        int fileCheck = win.showSaveDialog(this.getOwner());
        if (fileCheck == JFileChooser.APPROVE_OPTION) {

            String filename = win.getSelectedFile().toString();
            if (!filename.endsWith(".hex")) {
                filename += ".hex";
                // file2 = win.getSelectedFile();
            }
            file2 = win.getSelectedFile();
        }
        try {
            // String hexExtenstion = file2.toString().substring(0, file2.toString().length() - 4);
            System.out.println(file2.toString() + ".hex");
            //System.out.println(hexExtenstion);
            File file3 = new File(file2.toString() + ".hex");
            FileWriter fw = new FileWriter(file3.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for (int j = 0; j+3 < file.size(); j+=4) {
                System.out.println(file);
                bw.write((":"));
                bw.write(file.get(j));
                bw.write(file.get(j+1));
                bw.write("00");
                bw.write(file.get(j+2));
                bw.write(file.get(j+3));
               //  if(j+4 != file.size())
                    bw.newLine();
            }
            bw.write(":00000001FF");
            bw.close();

            String fileName;
            // Files.move(file2.toPath(), file3.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            System.out.println(file2.toString() + " " + file3);

        } catch (IOException ex) {
            Logger.getLogger(checkSum.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        numb.clear();
        file.clear();
        jTextPane1.setText(welcomeMessage);
        jTextField1.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        JFileChooser win = new JFileChooser();
        File file2 = null;
         FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter("text files", "txt", "text");
        win.setDialogTitle("Choose File To Open");
          win.setFileFilter(xmlfilter);
        win.setCurrentDirectory(new File(System.getProperty("user.home")));
        win.setDialogType(JFileChooser.OPEN_DIALOG);
        //    win.setSelectedFile(new File("myhexfile.hex"));
        int fileCheck = win.showSaveDialog(this.getOwner());
        if (fileCheck == JFileChooser.APPROVE_OPTION) {
            file2 = win.getSelectedFile();
        }
        String sCurrentLine = null;
        ArrayList<String> text = new ArrayList<>();
        ArrayList<String>addr = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file2.getAbsolutePath()));
            while ((sCurrentLine = br.readLine()) != null) {
                String[] splitLine = sCurrentLine.split(",");
                if(splitLine.length == 1){
                text.add(sCurrentLine);
                addr.add("ask");
                }
                else{
                text.add(splitLine[1]);
                addr.add(splitLine[0]);  
                }
                    
                sCurrentLine = null;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(checkSum.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(checkSum.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(text);
        String finale = null;
        ArrayList<String> lines = new ArrayList<>();
        for (int a = 0; a < text.size(); a++) {
            jTextField1.setText(text.get(a));
            String address = "";
            if(addr.get(a).equals("ask"))
            address = JOptionPane.showInputDialog(null, "Please enter the address for: " + jTextField1.getText() + "\n");
            else
            address = addr.get(a);
            String orginal = jTextField1.getText();
            int numofBytes = jTextField1.getText().length() / 2;
            String hexNumofBytes = Integer.toHexString(numofBytes).toUpperCase();

            //  hexNumofBytes = String.format("%02d", Integer.parseInt(hexNumofBytes));
            if (hexNumofBytes.length() < 2) {
                hexNumofBytes = "0" + hexNumofBytes;
            }
            jTextField1.setText(hexNumofBytes + address + "00" + jTextField1.getText());
            String checkSum = generateCheckSum("2");
            String line = ":" + hexNumofBytes + address + "00" + orginal + checkSum;
            System.out.println(line);
            lines.add(line);
        }
        lines.add(":00000001FF");
        //   File file3  = new File(file2.toString() + ".hex"); 
        try {
            File file3 = new File(file2.toString().substring(0, file2.toString().length() - 4) + ".hex");
            FileWriter fw = new FileWriter(file3.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for (int j = 0; j < lines.size(); j++) {
                bw.write(lines.get(j));
                 if(j+1 != lines.size())
                bw.newLine();
            }
            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(checkSum.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"File created successfully");
        jTextPane1.setText("");
        jTextField1.setText("");
    }//GEN-LAST:event_jButton6MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
          // TODO add your handling code here:
        JFileChooser win = new JFileChooser();
        File file2 = null;
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter("hex (*.hex)", "hex");
        win.setDialogTitle("Choose File To Open");
        win.setFileFilter(xmlfilter);
        win.setCurrentDirectory(new File(System.getProperty("user.home")));
        win.setDialogType(JFileChooser.OPEN_DIALOG);
        //    win.setSelectedFile(new File("myhexfile.hex"));
        int fileCheck = win.showSaveDialog(this.getOwner());
        if (fileCheck == JFileChooser.APPROVE_OPTION) {
            file2 = win.getSelectedFile();
        }
            boolean fixCheck = false;
        String sCurrentLine = null;
        ArrayList<String> text = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file2.getAbsolutePath()));
            while ((sCurrentLine = br.readLine()) != null) {
                text.add(sCurrentLine);
                sCurrentLine = null;
            }
            System.out.println(text);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(checkSum.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(checkSum.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (text.get(text.size() - 1).substring(text.get(text.size()-1).length()-4,text.get(text.size()-1).length()).equals("01FF") == false) {
            System.out.println(text.get(text.size() - 1).substring(text.get(text.size()-1).length()-4,text.get(text.size()-1).length()) + " hello i am here");
            text.add(":00000001FF");
            fixCheck = true;
        }

        String xxxx, yeezus = "Inavlid Hex Data Length in lines:", augestine = "Wrong Syntax in Lines:";
        String numberwrong = "Bit Count does not match Number of Bytes in Data in Lines:";
        for (int ccc = 0; ccc < text.size() - 1; ccc++)
        {
        xxxx = String.valueOf(ccc+1);
        String bitslength = text.get(ccc).substring(1,3);
        int bit1 = Integer.parseInt(bitslength, 16);
        //System.out.println(text.get(ccc).substring(8,text.get(ccc).length()-2));
        if (text.get(ccc).substring(9,text.get(ccc).length()-2).length() != 2*bit1)
        {
            numberwrong += "\n" + xxxx;
        }
        //System.out.println("Hello" + bit1);
        String tempThingie =  text.get(ccc).substring(1, text.get(ccc).length() - 2);
        if (!(tempThingie.length()%2 == 0))
            yeezus += "\n" + xxxx;
        if (!(text.get(ccc).substring(0,1).equals(":")))
            augestine += "\n" + xxxx;
        }
        if (augestine.length() > 22 | yeezus.length() > 34 | numberwrong.length() > 58)
        {
            if (augestine.length() < 23)
                augestine = "";
            if (yeezus.length() < 35)
                yeezus = "";
            if (numberwrong.length() < 59)
                numberwrong = "";
            JOptionPane.showMessageDialog(null, yeezus + "\n" + augestine + "\n" + numberwrong, "Corrupt File", JOptionPane.ERROR_MESSAGE);
            working = false;
        } 
        if (working == false)
            return;
       
    
         ArrayList<String> rightCheck = new ArrayList<>();
        for (int a = 0; a < text.size() - 1; a++) {
            String checkSum = text.get(a).substring(text.get(a).length() - 2, text.get(a).length());
            String actualThingie = text.get(a).substring(1, text.get(a).length() - 2);
            System.out.println(checkSum);
            jTextField1.setText(actualThingie);
            String check = generateCheckSum("2");
            System.out.println(actualThingie + " asdask ");
            if (check.equals(checkSum) == false) {
                //   JOptionPane.showMessageDialog(null, check + "\n does not equal \n" + checkSum);
                fixCheck = true;
                
                rightCheck.add(":" + actualThingie + check);
                
            } else {
                //     JOptionPane.showMessageDialog(null, check + "\n equals \n" + checkSum);
                rightCheck.add(":" + actualThingie + check);
            }
        }
        //   rightCheck.add();
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(file2, false));
            for (int c = 0; c < rightCheck.size(); c++) {
                br.write(rightCheck.get(c));
            //    if(c+1 != rightCheck.size())
                br.newLine();
            }
             br.write(":00000001FF");
            br.close();
            jTextField1.setText("");
        } catch (IOException ex) {
            Logger.getLogger(checkSum.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(fixCheck){
            JOptionPane.showMessageDialog(null, "Success! \n We fixed some check sums but your format is right", "Success",JOptionPane.INFORMATION_MESSAGE);
           }
         else
              JOptionPane.showMessageDialog(null, "Success! \n Nothing was wrong at all!", "Success",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
         numb.clear();
        file.clear();
        jTextPane1.setText(welcomeMessage);
        jTextField1.setText("");
        JOptionPane.showMessageDialog(null, "File reset complete!");
    
    }//GEN-LAST:event_jButton7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(checkSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkSum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
