package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

   
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox selectreligion, selectcategory,selectincome,selecteducation , selectoccupation;
    String formno;
    SignupTwo(String formno) {
       this.formno=formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM DETAILS");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
         selectreligion = new JComboBox(valReligion);
        selectreligion.setBounds(300, 140, 400, 30);
        selectreligion.setBackground(Color.WHITE);
        add(selectreligion);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);

        String valcategory[] = {"General", "Obc", "Sc/St", "Other"};
         selectcategory = new JComboBox(valcategory);
        selectcategory.setBounds(300, 190, 400, 30);
        selectcategory.setBackground(Color.WHITE);
        add(selectcategory);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);
       
        
        String valincome[] = {"Null", "<1,50,000", "<2,50,000", "<50,00,000", "Upto 10,00,000"};
        selectincome = new JComboBox(valincome);
        selectincome.setBounds(300, 240, 400, 30);
        selectincome.setBackground(Color.WHITE);
        add(selectincome);

        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);

        String educationValues[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        selecteducation = new JComboBox(educationValues);
        selecteducation.setBounds(300, 315, 400, 30);
        selecteducation.setBackground(Color.WHITE);
        add(selecteducation);

        
//        
//
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
       
        String occupationValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired","Other"};
        selectoccupation = new JComboBox(occupationValues);
        selectoccupation.setBounds(300, 390, 400, 30);
        selectoccupation.setBackground(Color.WHITE);
        add(selectoccupation);



        JLabel pan = new JLabel("Pan number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);

        panTextField = new JTextField();
      panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhar Number:");
      aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
       aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);

       aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway", Font.BOLD, 20));
     seniorcitizen.setBounds(100, 540, 200, 30);
        add(seniorcitizen);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
         sno=new JRadioButton("No");
       sno.setBounds(450,540,100,30);
       sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorgroup=new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);

      
        JLabel existingaccount = new JLabel("Existing Account:");
        existingaccount.setFont(new Font("Raleway", Font.BOLD, 20));
         existingaccount.setBounds(100, 590, 200, 30);
        add( existingaccount);
        
        
          
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
         eno=new JRadioButton("No");
       eno.setBounds(450,590,100,30);
       eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup accountgroup=new ButtonGroup();
       accountgroup.add(eyes);
        accountgroup.add(eno);

       

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        
        String sreligion =(String) selectreligion.getSelectedItem();
        String scategory = (String) selectcategory.getSelectedItem();
        String sincome = (String) selectincome.getSelectedItem();
        String seducation = (String) selecteducation.getSelectedItem();
           String soccupation = (String) selectoccupation.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
           seniorcitizen = "No";
        }
        
        
        String existingaccount = null;
        if (eyes.isSelected()) {
          existingaccount = "Yes";
        } else if (eno.isSelected()) {
           existingaccount = "No";
        }
        
        
        String saadhar = aadharTextField.getText();
        String span = panTextField.getText();
       
        try {
            if(span.equals("")){
                 JOptionPane.showMessageDialog(null,"Fill all the entries");
                
            }
            else
            {
                
                Conn c = new Conn();
                String query = "insert into signuptwo values('" + formno + "', '" + sreligion + "','" + scategory + "','" + sincome + "','" + seducation + "','" + soccupation+ "','" + saadhar + "','" + span + "','" + seniorcitizen + "','" + existingaccount+ "')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
            

            
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}
