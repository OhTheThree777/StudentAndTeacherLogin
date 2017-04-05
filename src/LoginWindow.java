import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by r958403448 on 2017/4/5.
 */
public class LoginWindow extends JFrame implements ActionListener{
    JLabel[] jl;
    JButton[] jb;
    JComboBox jcb;
    JTextField jt1,jt2;
    LoginWindow(){
        setBounds(500,300,250,240);
        setTitle("用户登陆");
        setLayout(null);
        ginit();
        jl[0].setSize(100,30);
            jl[0].setLocation(20,20);
            add(jl[0]);
        jcb.setSize(100,30);
            jcb.setLocation(120,20);
            add(jcb);
        jl[1].setSize(100,30);
            jl[1].setLocation(20,60);
            add(jl[1]);
        jt1.setSize(100,30);
            jt1.setLocation(120,60);
            add(jt1);
        jl[2].setSize(100,30);
            jl[2].setLocation(20,100);
            add(jl[2]);
        jt2.setSize(100,30);
            jt2.setLocation(120,100);
            add(jt2);
        jb[0].setSize(60,20);
            jb[0].setLocation(20,140);
            add(jb[0]);
        jb[1].setSize(60,20);
            jb[1].setLocation(90,140);
            add(jb[1]);
        jb[2].setSize(60,20);
            jb[2].setLocation(160,140);
            add(jb[2]);
        setVisible(true);
    }

    /**
     *
     */
    void ginit(){
        jl=new JLabel[3];
        for (int i=0;i<3;i++){
            jl[i]=new JLabel();
        }
        jl[0].setText("用户类型");
        jl[1].setText("用户名");
        jl[2].setText("密码");
        jb=new JButton[3];
        for (int i=0;i<3;i++){
            jb[i]=new JButton();
            jb[i].addActionListener(this);

        }
        jb[0].setText("ok");
        jb[1].setText("cancl");
        jb[2].setText("exit");
        jcb=new JComboBox();
        jcb.addItem("teacher");
        jcb.addItem("student");
        jt1=new JTextField(10);
        jt2=new JTextField(10);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        LoginWindow lw =new LoginWindow();
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb[2]){
            System.exit(0);

        }
        if (e.getSource()==jb[1]){
            jt1.setText("");
            jt2.setText("");
            jcb.setSelectedIndex(0);

        }
        if(e.getSource()==jb[0]){
            int k=0;
            String type = (String) jcb.getSelectedItem();
            String user =jt1.getText().trim();
            String psw=jt2.getText().trim();
            if(user.equals("")){
                JOptionPane.showMessageDialog(null,"hei you silly B",
                        "tipMessage",JOptionPane.WARNING_MESSAGE);
                k=-1;
            }else if (psw.equals("")){

                JOptionPane.showMessageDialog(null,"hei you silly B",
                        "tipMessage",JOptionPane.WARNING_MESSAGE);
                k=-1;
            }
            if(k>=0){
                if (type.equalsIgnoreCase("teacher")&&
                        user.equalsIgnoreCase("teacher")&&psw.equalsIgnoreCase("teacher")){

                    JOptionPane.showMessageDialog(null,"hei you teacher ok",
                            "tipmessage",JOptionPane.WARNING_MESSAGE);

                }else if (type.equalsIgnoreCase("student")
                        &&user.equalsIgnoreCase("student")&&psw.equalsIgnoreCase("student")){

                    JOptionPane.showMessageDialog(null,"hei you student ok",
                            "tipmessage",JOptionPane.WARNING_MESSAGE);

                }else {

                    JOptionPane.showMessageDialog(null,"hei you silly b",
                            "tipmessage",JOptionPane.WARNING_MESSAGE);

                }




            }
        }


    }
}
