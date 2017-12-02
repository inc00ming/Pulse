package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static com.company.Grade.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by furkan on 01.12.2017.
 */
public class MyGridLayout {

    JFrame ff;
    JPanel f;
    JComboBox courseName0, courseName1, courseName2, courseName3, courseName4, courseName5, courseName6, courseName7, courseName8, courseName9;
    JComboBox grade0, grade1, grade2, grade3, grade4, grade5, grade6, grade7, grade8, grade9, ograde0, ograde1, ograde2, ograde3, ograde4, ograde5, ograde6, ograde7, ograde8, ograde9;
    JLabel credit0, credit1, credit2, credit3, credit4, credit5, credit6, credit7, credit8, credit9;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, clearButton, calculateButton;
    JTextField previousCGPAText, previousTotalCreditText, newGPAText, newCGPAText, totalACTSofSemester, totalCreditofSemester;
    JCheckBox cb0, cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9;
    MyGridLayout(){
        ff=new JFrame();
        f = new JPanel();
        f.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        b0=new JButton("Info");
        b1=new JButton("Info");
        b2=new JButton("Info");
        b3=new JButton("Info");
        b4=new JButton("Info");
        b5=new JButton("Info");
        b6=new JButton("Info");
        b7=new JButton("Info");
        b8=new JButton("Info");
        b9=new JButton("Info");
        clearButton=new JButton("Clear");
        calculateButton=new JButton("Calculate");

        cb0 = new JCheckBox();
        cb1 = new JCheckBox();
        cb2 = new JCheckBox();
        cb3 = new JCheckBox();
        cb4 = new JCheckBox();
        cb5 = new JCheckBox();
        cb6 = new JCheckBox();
        cb7 = new JCheckBox();
        cb8 = new JCheckBox();
        cb9 = new JCheckBox();

        JLabel label0 = new JLabel("Course Name",SwingConstants.CENTER);
        JLabel label1 = new JLabel("Course Credit",SwingConstants.CENTER);
        JLabel label2 = new JLabel("Grade",SwingConstants.CENTER);
        JLabel label3 = new JLabel("Course Info",SwingConstants.CENTER);
        JLabel label4 = new JLabel("Previous CGPA",SwingConstants.CENTER);
        JLabel label5 = new JLabel("Previous Total Credit",SwingConstants.CENTER);
        JLabel label6 = new JLabel("New GPA",SwingConstants.CENTER);
        JLabel label7 = new JLabel("New CGPA",SwingConstants.CENTER);
        JLabel label8 = new JLabel("Implemented by inc0ming",SwingConstants.CENTER);
        JLabel label9 = new JLabel("Atılım University since 1996", SwingConstants.CENTER);
        JLabel label10 = new JLabel("Taken Before", SwingConstants.CENTER);
        JLabel label11 = new JLabel("Total ACTS of Semester", SwingConstants.CENTER);
        JLabel label12 = new JLabel("Old Grade", SwingConstants.CENTER);
        JLabel label13 = new JLabel("Total Credit of Semester", SwingConstants.CENTER);



        credit0 = new JLabel("0",SwingConstants.CENTER);
        credit1 = new JLabel("0",SwingConstants.CENTER);
        credit2 = new JLabel("0",SwingConstants.CENTER);
        credit3 = new JLabel("0",SwingConstants.CENTER);
        credit4 = new JLabel("0",SwingConstants.CENTER);
        credit5 = new JLabel("0",SwingConstants.CENTER);
        credit6 = new JLabel("0",SwingConstants.CENTER);
        credit7 = new JLabel("0",SwingConstants.CENTER);
        credit8 = new JLabel("0",SwingConstants.CENTER);
        credit9 = new JLabel("0",SwingConstants.CENTER);

        courseName0 = new JComboBox();
        courseName1 = new JComboBox();
        courseName2 = new JComboBox();
        courseName3 = new JComboBox();
        courseName4 = new JComboBox();
        courseName5 = new JComboBox();
        courseName6 = new JComboBox();
        courseName7 = new JComboBox();
        courseName8 = new JComboBox();
        courseName9 = new JComboBox();


        grade0 = new JComboBox();
        grade1 = new JComboBox();
        grade2 = new JComboBox();
        grade3 = new JComboBox();
        grade4 = new JComboBox();
        grade5 = new JComboBox();
        grade6 = new JComboBox();
        grade7 = new JComboBox();
        grade8 = new JComboBox();
        grade9 = new JComboBox();

        ograde0 = new JComboBox();ograde0.setEnabled(false);
        ograde1 = new JComboBox();ograde1.setEnabled(false);
        ograde2 = new JComboBox();ograde2.setEnabled(false);
        ograde3 = new JComboBox();ograde3.setEnabled(false);
        ograde4 = new JComboBox();ograde4.setEnabled(false);
        ograde5 = new JComboBox();ograde5.setEnabled(false);
        ograde6 = new JComboBox();ograde6.setEnabled(false);
        ograde7 = new JComboBox();ograde7.setEnabled(false);
        ograde8 = new JComboBox();ograde8.setEnabled(false);
        ograde9 = new JComboBox();ograde9.setEnabled(false);

        previousCGPAText = new JTextField();
        previousTotalCreditText = new JTextField();
        newGPAText = new JTextField();
        newCGPAText = new JTextField();
        totalACTSofSemester = new JTextField();
        totalCreditofSemester = new JTextField();

        f.add(label0);f.add(label1);f.add(label2);f.add(label10);f.add(label12);f.add(label3);

        f.add(courseName0);f.add(credit0);f.add(grade0);f.add(cb0);f.add(ograde0);f.add(b0);
        f.add(courseName1);f.add(credit1);f.add(grade1);f.add(cb1);f.add(ograde1);f.add(b1);
        f.add(courseName2);f.add(credit2);f.add(grade2);f.add(cb2);f.add(ograde2);f.add(b2);
        f.add(courseName3);f.add(credit3);f.add(grade3);f.add(cb3);f.add(ograde3);f.add(b3);
        f.add(courseName4);f.add(credit4);f.add(grade4);f.add(cb4);f.add(ograde4);f.add(b4);
        f.add(courseName5);f.add(credit5);f.add(grade5);f.add(cb5);f.add(ograde5);f.add(b5);
        f.add(courseName6);f.add(credit6);f.add(grade6);f.add(cb6);f.add(ograde6);f.add(b6);
        f.add(courseName7);f.add(credit7);f.add(grade7);f.add(cb7);f.add(ograde7);f.add(b7);
        f.add(courseName8);f.add(credit8);f.add(grade8);f.add(cb8);f.add(ograde8);f.add(b8);
        f.add(courseName9);f.add(credit9);f.add(grade9);f.add(cb9);f.add(ograde9);f.add(b9);

        f.add(label13);f.add(label11);f.add(label4);f.add(label5);f.add(label6);f.add(label7);
        f.add(totalCreditofSemester);f.add(totalACTSofSemester);f.add(previousCGPAText);f.add(previousTotalCreditText);f.add(newGPAText);f.add(newCGPAText);
        f.add(label8);f.add(clearButton);f.add(calculateButton);f.add(label9);
        f.setAlignmentX(Component.CENTER_ALIGNMENT);
        f.setLayout(new GridLayout(14,6));
        ff.add(f);
        ff.pack();
        ff.setVisible(true);
        ff.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Course.setAllCourses();
        ArrayList<Course> allCourses = Course.getAllCourses();
        for (Course c: allCourses) {
            addCourse(c);
        }

        ArrayList<Grade> allGrades = new ArrayList<Grade>();
        allGrades.add(FF);allGrades.add(FD);allGrades.add(DD);allGrades.add(DC);allGrades.add(CC);
        allGrades.add(CB);allGrades.add(BB);allGrades.add(BA);allGrades.add(AA);
        for(Grade g: allGrades){
            addGrade(g);
        }

        addListeners();

        previousCGPAText.setText("0.00");
        previousTotalCreditText.setText("0");
        newCGPAText.setText("0.00");
        newCGPAText.setEditable(false);
        newGPAText.setText("0.00");
        newGPAText.setEditable(false);
        totalACTSofSemester.setText("0");
        totalACTSofSemester.setEditable(false);
        totalCreditofSemester.setText("0");
        totalCreditofSemester.setEditable(false);
    }

    public void addCourse(Course c){
        courseName0.addItem(c.getCourseCode());
        courseName1.addItem(c.getCourseCode());
        courseName2.addItem(c.getCourseCode());
        courseName3.addItem(c.getCourseCode());
        courseName4.addItem(c.getCourseCode());
        courseName5.addItem(c.getCourseCode());
        courseName6.addItem(c.getCourseCode());
        courseName7.addItem(c.getCourseCode());
        courseName8.addItem(c.getCourseCode());
        courseName9.addItem(c.getCourseCode());
    }

    public void addGrade(Grade g){
        grade0.addItem(g);
        grade1.addItem(g);
        grade2.addItem(g);
        grade3.addItem(g);
        grade4.addItem(g);
        grade5.addItem(g);
        grade6.addItem(g);
        grade7.addItem(g);
        grade8.addItem(g);
        grade9.addItem(g);

        ograde0.addItem(g);
        ograde1.addItem(g);
        ograde2.addItem(g);
        ograde3.addItem(g);
        ograde4.addItem(g);
        ograde5.addItem(g);
        ograde6.addItem(g);
        ograde7.addItem(g);
        ograde8.addItem(g);
        ograde9.addItem(g);
    }

    private void addListeners(){

        courseName0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName0.getItemAt(courseName0.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                credit0.setText(Integer.toString(c.getCourseCredit()));
                totalCreditofSemester.setText(totalSemesterCredit());
            }
        });

        courseName1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName1.getItemAt(courseName1.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                credit1.setText(Integer.toString(c.getCourseCredit()));
                totalCreditofSemester.setText(totalSemesterCredit());
            }
        });

        courseName2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName2.getItemAt(courseName2.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                credit2.setText(Integer.toString(c.getCourseCredit()));
                totalCreditofSemester.setText(totalSemesterCredit());
            }
        });

        courseName3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName3.getItemAt(courseName3.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                credit3.setText(Integer.toString(c.getCourseCredit()));
                totalCreditofSemester.setText(totalSemesterCredit());
            }
        });

        courseName4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName4.getItemAt(courseName4.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                credit4.setText(Integer.toString(c.getCourseCredit()));
                totalCreditofSemester.setText(totalSemesterCredit());
            }
        });

        courseName5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName5.getItemAt(courseName5.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                credit5.setText(Integer.toString(c.getCourseCredit()));
                totalCreditofSemester.setText(totalSemesterCredit());
            }
        });

        courseName6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName6.getItemAt(courseName6.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                credit6.setText(Integer.toString(c.getCourseCredit()));
                totalCreditofSemester.setText(totalSemesterCredit());
            }
        });

        courseName7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName7.getItemAt(courseName7.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                credit7.setText(Integer.toString(c.getCourseCredit()));
                totalCreditofSemester.setText(totalSemesterCredit());
            }
        });

        courseName8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName8.getItemAt(courseName8.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                credit8.setText(Integer.toString(c.getCourseCredit()));
                totalCreditofSemester.setText(totalSemesterCredit());
            }
        });

        courseName9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName9.getItemAt(courseName9.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                credit9.setText(Integer.toString(c.getCourseCredit()));
                totalCreditofSemester.setText(totalSemesterCredit());
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName0.getItemAt(courseName0.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                String info = "Course Code: " + c.getCourseCode() + "\n" +
                            "Course Name: " + c.getCourseName() + "\n" +
                            "Course Credit: " + c.getCourseCredit();
                JOptionPane.showMessageDialog(f, info, "Course Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName1.getItemAt(courseName1.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                String info = "Course Code: " + c.getCourseCode() + "\n" +
                        "Course Name: " + c.getCourseName() + "\n" +
                        "Course Credit: " + c.getCourseCredit();
                JOptionPane.showMessageDialog(f, info, "Course Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName2.getItemAt(courseName2.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                String info = "Course Code: " + c.getCourseCode() + "\n" +
                        "Course Name: " + c.getCourseName() + "\n" +
                        "Course Credit: " + c.getCourseCredit();
                JOptionPane.showMessageDialog(f, info, "Course Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName3.getItemAt(courseName3.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                String info = "Course Code: " + c.getCourseCode() + "\n" +
                        "Course Name: " + c.getCourseName() + "\n" +
                        "Course Credit: " + c.getCourseCredit();
                JOptionPane.showMessageDialog(f, info, "Course Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName4.getItemAt(courseName4.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                String info = "Course Code: " + c.getCourseCode() + "\n" +
                        "Course Name: " + c.getCourseName() + "\n" +
                        "Course Credit: " + c.getCourseCredit();
                JOptionPane.showMessageDialog(f, info, "Course Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName5.getItemAt(courseName5.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                String info = "Course Code: " + c.getCourseCode() + "\n" +
                        "Course Name: " + c.getCourseName() + "\n" +
                        "Course Credit: " + c.getCourseCredit();
                JOptionPane.showMessageDialog(f, info, "Course Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName6.getItemAt(courseName6.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                String info = "Course Code: " + c.getCourseCode() + "\n" +
                        "Course Name: " + c.getCourseName() + "\n" +
                        "Course Credit: " + c.getCourseCredit();
                JOptionPane.showMessageDialog(f, info, "Course Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName7.getItemAt(courseName7.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                String info = "Course Code: " + c.getCourseCode() + "\n" +
                        "Course Name: " + c.getCourseName() + "\n" +
                        "Course Credit: " + c.getCourseCredit();
                JOptionPane.showMessageDialog(f, info, "Course Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName8.getItemAt(courseName8.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                String info = "Course Code: " + c.getCourseCode() + "\n" +
                        "Course Name: " + c.getCourseName() + "\n" +
                        "Course Credit: " + c.getCourseCredit();
                JOptionPane.showMessageDialog(f, info, "Course Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseCode = courseName9.getItemAt(courseName9.getSelectedIndex()).toString();
                Course c = Course.findCourse(courseCode);
                String info = "Course Code: " + c.getCourseCode() + "\n" +
                        "Course Name: " + c.getCourseName() + "\n" +
                        "Course Credit: " + c.getCourseCredit();
                JOptionPane.showMessageDialog(f, info, "Course Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseName0.setSelectedIndex(0);
                courseName1.setSelectedIndex(0);
                courseName2.setSelectedIndex(0);
                courseName3.setSelectedIndex(0);
                courseName4.setSelectedIndex(0);
                courseName5.setSelectedIndex(0);
                courseName6.setSelectedIndex(0);
                courseName7.setSelectedIndex(0);
                courseName8.setSelectedIndex(0);
                courseName9.setSelectedIndex(0);
                grade0.setSelectedIndex(0);
                grade1.setSelectedIndex(0);
                grade2.setSelectedIndex(0);
                grade3.setSelectedIndex(0);
                grade4.setSelectedIndex(0);
                grade5.setSelectedIndex(0);
                grade6.setSelectedIndex(0);
                grade7.setSelectedIndex(0);
                grade8.setSelectedIndex(0);
                grade9.setSelectedIndex(0);
                ograde0.setSelectedIndex(0);
                ograde1.setSelectedIndex(0);
                ograde2.setSelectedIndex(0);
                ograde3.setSelectedIndex(0);
                ograde4.setSelectedIndex(0);
                ograde5.setSelectedIndex(0);
                ograde6.setSelectedIndex(0);
                ograde7.setSelectedIndex(0);
                ograde8.setSelectedIndex(0);
                ograde9.setSelectedIndex(0);
                previousCGPAText.setText("0.00");
                previousTotalCreditText.setText("0");
                newCGPAText.setText("0.00");
                newGPAText.setText("0.00");
                totalACTSofSemester.setText("0");
                totalCreditofSemester.setText("0");
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> selectedCourses = new ArrayList<String>();
                if(!courseName0.getItemAt(courseName0.getSelectedIndex()).toString().equals("None"))
                    selectedCourses.add(courseName0.getItemAt(courseName0.getSelectedIndex()).toString());
                if(!courseName1.getItemAt(courseName1.getSelectedIndex()).toString().equals("None"))
                    selectedCourses.add(courseName1.getItemAt(courseName1.getSelectedIndex()).toString());
                if(!courseName2.getItemAt(courseName2.getSelectedIndex()).toString().equals("None"))
                    selectedCourses.add(courseName2.getItemAt(courseName2.getSelectedIndex()).toString());
                if(!courseName3.getItemAt(courseName3.getSelectedIndex()).toString().equals("None"))
                    selectedCourses.add(courseName3.getItemAt(courseName3.getSelectedIndex()).toString());
                if(!courseName4.getItemAt(courseName4.getSelectedIndex()).toString().equals("None"))
                    selectedCourses.add(courseName4.getItemAt(courseName4.getSelectedIndex()).toString());
                if(!courseName5.getItemAt(courseName5.getSelectedIndex()).toString().equals("None"))
                    selectedCourses.add(courseName5.getItemAt(courseName5.getSelectedIndex()).toString());
                if(!courseName6.getItemAt(courseName6.getSelectedIndex()).toString().equals("None"))
                    selectedCourses.add(courseName6.getItemAt(courseName6.getSelectedIndex()).toString());
                if(!courseName7.getItemAt(courseName7.getSelectedIndex()).toString().equals("None"))
                    selectedCourses.add(courseName7.getItemAt(courseName7.getSelectedIndex()).toString());
                if(!courseName8.getItemAt(courseName8.getSelectedIndex()).toString().equals("None"))
                    selectedCourses.add(courseName8.getItemAt(courseName8.getSelectedIndex()).toString());
                if(!courseName9.getItemAt(courseName9.getSelectedIndex()).toString().equals("None")) {
                    selectedCourses.add(courseName9.getItemAt(courseName9.getSelectedIndex()).toString());
                }
                Set<String> set = new HashSet<String>(selectedCourses);
                if(set.size() < selectedCourses.size()){
                    JOptionPane.showMessageDialog(f, "You add same courses, please remove duplicates!", "Duplicate Courses",JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        cb0.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cb0){
                    ograde0.setEnabled(cb0.isSelected());
                }
            }
        });

        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cb1){
                    ograde1.setEnabled(cb1.isSelected());
                }
            }
        });

        cb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cb2){
                    ograde2.setEnabled(cb2.isSelected());
                }
            }
        });

        cb3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cb3){
                    ograde3.setEnabled(cb3.isSelected());
                }
            }
        });

        cb4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cb4){
                    ograde4.setEnabled(cb4.isSelected());
                }
            }
        });

        cb5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cb5){
                    ograde5.setEnabled(cb5.isSelected());
                }
            }
        });

        cb6.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cb6){
                    ograde6.setEnabled(cb6.isSelected());
                }
            }
        });

        cb7.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cb7){
                    ograde7.setEnabled(cb7.isSelected());
                }
            }
        });

        cb8.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cb8){
                    ograde8.setEnabled(cb8.isSelected());
                }
            }
        });

        cb9.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cb9){
                    ograde9.setEnabled(cb9.isSelected());
                }
            }
        });
    }

    private String totalSemesterCredit(){
        int n = 0;
        n += Integer.parseInt(credit0.getText());
        n += Integer.parseInt(credit1.getText());
        n += Integer.parseInt(credit2.getText());
        n += Integer.parseInt(credit3.getText());
        n += Integer.parseInt(credit4.getText());
        n += Integer.parseInt(credit5.getText());
        n += Integer.parseInt(credit6.getText());
        n += Integer.parseInt(credit7.getText());
        n += Integer.parseInt(credit8.getText());
        n += Integer.parseInt(credit9.getText());
        return Integer.toString(n);
    }
}