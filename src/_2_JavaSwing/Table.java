package _2_JavaSwing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Table {
    public JFrame jFrame;


    public Table(){
        jFrame = new JFrame();
        jFrame.setTitle("JTable");

        String data[][] ={  {"1","Shreya","19"},
                {"2","Shivani","20"},
                {"3","Tanisha","18"}
        };

        String column[]={"ID","NAME","AGE"};

        JTable jTable=new JTable(data,column);
        jTable.setCellSelectionEnabled(true);         //by using this which cell we selects only that cells would selects

        ListSelectionModel selectionModel=jTable.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String str=null;
                int[] row=jTable.getSelectedRows();
                int[] column=jTable.getSelectedColumns();

                for(int i=0;i<row.length;i++){
                    for(int j=0;j<column.length;j++){
                     str=(String) jTable.getValueAt(row[i],column[i]);
                    }
                }

            JOptionPane.showMessageDialog(jFrame,"You Selected : "+str);
            }
        });
    JScrollPane jScrollPane=new JScrollPane(jTable);
        jFrame.add(jScrollPane);

//        jFrame.setLayout(null);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Table();
    }
}
